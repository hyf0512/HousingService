package com.housing.management.backend.common;

import java.math.BigDecimal;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.Timestamp;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Random;
import java.util.UUID;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.quartz.CronTrigger;
import org.quartz.TriggerUtils;

import com.housing.management.backend.domain.PageData;
import com.housing.management.backend.exception.BusinessException;

public class Utils {

	private static final Logger logger = Logger.getLogger(Utils.class);
	
	private static SimpleDateFormat formatter=new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss.SSSZ");

	private static MessageDigest digest = null;
	
	private static final int DEFAULT_PAGE_SIZE=10;//默认每页条数
	
	private static final int DEFAULT_PAGE_INDEX=1;//起始条数


	public static synchronized String formatDate(Date date){
		return formatter.format(date);
	}
	
	public static synchronized Date parseDate(String date_str){
		try{
		return formatter.parse(date_str);
		}catch(Exception e){
			logger.error(e.getMessage());
		}
	   return null;
	}

	public static final synchronized String hash(String data) {
		if (digest == null) {
			try {
				digest = MessageDigest.getInstance("MD5");
			} catch (NoSuchAlgorithmException nsae) {
				logger.error("Failed to load the MD5 MessageDigest",nsae);
			}
		}
		digest.update(data.getBytes());
		return encodeHex(digest.digest());
	}

	public static String generateToken(String originalStr) {
		return hash(originalStr);
	}

	public static final String encodeHex(byte[] bytes) {
		StringBuffer buf = new StringBuffer(bytes.length * 2);

		for (int i = 0; i < bytes.length; ++i) {
			if ((bytes[i] & 0xFF) < 16) {
				buf.append("0");
			}
			buf.append(Long.toString(bytes[i] & 0xFF, 16));
		}
		return buf.toString();
	}

	public static Date getTokenExpireTime() {
		Calendar calendar = Calendar.getInstance();
		calendar.add(Calendar.MINUTE, 120);
		
		
		return calendar.getTime();
	}

	public static int getTimeValidRange(String time_valid_range) {
		int time_valid_range_sec = 0;
		if (StringUtils.isEmpty(time_valid_range)) {
			return 0;
		}
		String val = "0";
		char unit = time_valid_range.charAt(time_valid_range.length() - 1);
		if ("yMdhms".indexOf(unit) != -1) {
			val = time_valid_range.substring(0, time_valid_range.length() - 1);
			int val_int = 0;
			try {
				val_int = Integer.parseInt(val);
			} catch (Exception e) {
				logger.warn("OtsUtils.getTimeValidRange() Integer.parseInt("
						+ val
						+ ") fail,please check the value of time_valid_range in ots.properties.");
				return 0;
			}
			time_valid_range_sec = getTimeValidRangeSec(val_int, unit);
		} else {
			try {
				time_valid_range_sec = Integer.parseInt(time_valid_range);
			} catch (Exception e) {
				logger.warn("OtsUtils.getTimeValidRange() Integer.parseInt("
						+ time_valid_range
						+ ") fail,please check the value of time_valid_range in ots.properties.");
				time_valid_range_sec = 0;
			}
		}
		return time_valid_range_sec;
	}

	private static int getTimeValidRangeSec(int val_int, char unit) {
		int time_valid_range_sec = 0;
		if ('y' == unit)
			time_valid_range_sec = val_int * 365 * 24 * 60 * 60;
		else if ('M' == unit)
			time_valid_range_sec = val_int * 30 * 24 * 60 * 60;
		else if ('d' == unit)
			time_valid_range_sec = val_int * 24 * 60 * 60;
		else if ('h' == unit)
			time_valid_range_sec = val_int * 60 * 60;
		else if ('m' == unit)
			time_valid_range_sec = val_int * 60;
		else if ('s' == unit)
			time_valid_range_sec = val_int;
		else {
			time_valid_range_sec = val_int;
		}
		return time_valid_range_sec;
	}

	public static String getHostName() {

		try {
			return InetAddress.getLocalHost().getHostName();
		} catch (UnknownHostException e) {
			logger.error("unknown host!",e);
		}
		return "default_host";
	}

	/**
	 * 数据类型转换：String 转换成 Double，保留小数几位
	 * 
	 * @param dataStr
	 * @param dNo
	 * 
	 * @result Double
	 */
	public static Double stringToDouble(String dataStr, Integer dNo) {
		// 构造以字符串内容为值的BigDecimal类型的变量bd
		BigDecimal bd = new BigDecimal(dataStr);
		// 设置小数位数，第一个变量是小数位数，第二个变量是取舍方法(四舍五入)
		Double douV = bd.setScale(dNo, BigDecimal.ROUND_HALF_UP).doubleValue();

		return douV;
	}
	
	/**
	 * 数据类型转换：String 转换成 BigDecimal，保留小数几位
	 * 
	 * @param dataStr
	 * @param dNo
	 * 
	 * @result BigDecimal
	 */
	public static BigDecimal stringToBigDecimal(String dataStr, Integer dNo) {
		// 构造以字符串内容为值的BigDecimal类型的变量bd
		BigDecimal bd = new BigDecimal(dataStr);
		// 设置小数位数，第一个变量是小数位数，第二个变量是取舍方法(四舍五入)
		bd=bd.setScale(dNo, BigDecimal.ROUND_HALF_UP); 

		return bd;
	}

	/**
	 * 时间计算：加小时
	 * 
	 * @param dataStr
	 * @param dNo
	 * 
	 * @result Double
	 */
	public static Date dateAddHour(Date dateV, Integer hours) {
		Calendar rightNow = Calendar.getInstance();
		int hour = rightNow.get(Calendar.HOUR_OF_DAY);
		hour += hours;
		rightNow.set(Calendar.HOUR_OF_DAY, hour);
		Date date = rightNow.getTime();

		return date;
	}

	public static void pageDataInit(PageData pd){
		pd.setPageIndex(pd.getPageIndex()==0?DEFAULT_PAGE_INDEX:pd.getPageIndex());
		pd.setPageSize(pd.getPageSize()==0?DEFAULT_PAGE_SIZE:pd.getPageSize());
		
		//FromRowNum
		int pageSize = pd.getPageSize();
		int beginPage = pd.getPageIndex() - 1, result = 0;
		if (beginPage <= 0) {
			result = 1;
		} else {
			result = pageSize * beginPage+1;
		}
		pd.setFromRowNum(result);
		
		//ToRowNum
		pageSize = pd.getPageSize();
		beginPage = pd.getPageIndex() - 1;
		result = 0;
		if (beginPage <= 0) {
			result = pd.getPageSize();
		} else {
			result = pageSize * pd.getPageIndex();
		}
		pd.setToRowNum(result);
	}
	
	/**
	 * 获取val的Hash
	 * 
	 * @param val
	 * 
	 */
	public static String getValHash(String val) {
		return hash(val);
	}
	
	/**
	 * 获取UUID的Hash
	 * 
	 * 
	 */
	public static String getUUIdHash() {
		return  hash(UUID.randomUUID().toString());
	}
	
	/**
	 * 补"0"
	 * 
	 * @param size 长度
	 * @param 原值
	 * 
	 * @return String
	 */
	public static String addZero(int size, String val){
		String result = val;
		if(val.length() >= size){
			return val;
		} else {
			for(int i = 0; i < size - val.length(); i++){
				result = "0" + result;
			}
			
			return result;
		}
	}
	
	/**
	 * 补"0"
	 * 
	 * @param size 长度
	 * @param 原值
	 * 
	 * @return String
	 */
	public static String addZero(int size, int val){
		String s = String.valueOf(val);
		String result = s;
		if(s.length() >= size){
			return s;
		} else {
			for(int i = 0; i < size - s.length(); i++){
				result = "0" + result;
			}
			
			return result;
		}
	}
	
	/**
	 * 字符串转换成日期,格式自定义：如yyyy-MM-dd
	 * @param dateStr
	 * @param formatStr
	 * @return
	 */
	public static synchronized java.sql.Date stringToSqlDate(String dateStr,String formatStr){
		DateFormat dd=new SimpleDateFormat(formatStr);
		Date date=null;
		try {
			date = dd.parse(dateStr);
		} catch (ParseException e) {
			throw new BusinessException(
					"sys utils err",
					e.getMessage());
		}
		
		java.sql.Date sqlDate = new java.sql.Date(date.getTime());
		return sqlDate;
	}
	/**
	 * 字符串转换成Util日期,格式自定义：如yyyy-MM-dd
	 * @param dateStr
	 * @param formatStr
	 * @return
	 */
	public static synchronized Date stringToDate(String dateStr,String formatStr){
		DateFormat dd=new SimpleDateFormat(formatStr);
		Date date=null;
		try {
			date = dd.parse(dateStr);
		} catch (ParseException e) {
			throw new BusinessException(
					"sys utils err",
					e.getMessage());
		}
		
		return date;
	}
	
	/**
	 * 字符串转换成SQL日期,格式自定义：如yyyy-MM-dd
	 * @param dateStr
	 * @return
	 */
	public static Date stringToDate(String dateStr){
		return java.sql.Date.valueOf(dateStr);  
	}

	/**
	 * XMLGregorianCalendar类型和Date类型之间的相互转换
	 * @param cal
	 * @return
	 */
	public static Date convertToDate(XMLGregorianCalendar cal){
		GregorianCalendar ca = cal.toGregorianCalendar();
        return ca.getTime();
    }
	
	/**
	 * XMLGregorianCalendar类型和Date类型之间的相互转换
	 * @param cal
	 * @return
	 */
	public static XMLGregorianCalendar  convertToXmlDate(Date date){
		if(date == null) return null;
		 Calendar cal = Calendar.getInstance();  
         cal.setTime(date);  
         DatatypeFactory dtf = null;  
          try {  
             dtf = DatatypeFactory.newInstance();  
         } catch (DatatypeConfigurationException e) {
        	 throw new BusinessException(
        			 "sys utils err",
 					e.getMessage());
         }  
         XMLGregorianCalendar dateType = dtf.newXMLGregorianCalendar();  
         dateType.setYear(cal.get(Calendar.YEAR));  
         //由于Calendar.MONTH取值范围为0~11,需要加1  
         dateType.setMonth(cal.get(Calendar.MONTH)+1);  
         dateType.setDay(cal.get(Calendar.DAY_OF_MONTH));  
         dateType.setHour(cal.get(Calendar.HOUR_OF_DAY));  
         dateType.setMinute(cal.get(Calendar.MINUTE));  
         dateType.setSecond(cal.get(Calendar.SECOND));  
         return dateType;  
    }
	
	/**
	 * 字符串转换成Timestamp,格式自定义：如yyyy-MM-dd HH:mm:ss
	 * @param dateStr
	 * @param formatStr
	 * @return
	 */
	public static Timestamp stringToTimestamp(String dateStr,String formatStr){
		Date a = stringToDate(dateStr,formatStr);
		Timestamp ts = new Timestamp(a.getTime());
		return ts;
	}
	
	/**
	 * 时间格式转换,String(毫秒数) 转换成 Timestamp,如：1421205613550
	 * 
	 */
	public static synchronized Timestamp stringToTimestamp2(String dateStr, String formatStr) {

		SimpleDateFormat df = new SimpleDateFormat(formatStr);
		Date dt = new Date(Long.parseLong(dateStr));
		Timestamp ts = null;
		String sd = df.format(dt);
		ts = Timestamp.valueOf(sd);

		return ts;
	}
	

    /**
     * 日期转换成字符串，如：yyyy-MM-dd HH:mm:ss
     */
    public static synchronized String dateToStr(Date dateV, String formatStr){
        //最后的aa表示“上午”或“下午”    HH表示24小时制    如果换成hh表示12小时制
        SimpleDateFormat sdf = new SimpleDateFormat(formatStr);
        String dateStr = sdf.format(dateV);
        return dateStr;
    }
    
    /**
     * 判断两个日期是否是同一天
     * 
     * @param date1
     *            date1
     * @param date2
     *            date2
     * @return
     */
    public static boolean isSameDate(Date date1, Date date2) {
        Calendar cal1 = Calendar.getInstance();
        cal1.setTime(date1);

        Calendar cal2 = Calendar.getInstance();
        cal2.setTime(date2);

        boolean isSameYear = cal1.get(Calendar.YEAR) == cal2
                .get(Calendar.YEAR);
        boolean isSameMonth = isSameYear
                && cal1.get(Calendar.MONTH) == cal2.get(Calendar.MONTH);
        boolean isSameDate = isSameMonth
                && cal1.get(Calendar.DAY_OF_MONTH) == cal2
                        .get(Calendar.DAY_OF_MONTH);

        return isSameDate;
    }

    /**
     * 获得一个UUID
     * @return String UUID
     */
    public static String getUUID(){
        String s = UUID.randomUUID().toString();
        //去掉“-”符号
        return s.substring(0,8)+s.substring(9,13)+s.substring(14,18)+s.substring(19,23)+s.substring(24);
    }
  
    /**
     * 根据cron表达式获取24小时内运行时间节点
     * @return List<Date>
     */
    
    public static List<Date> getFireTimes(String cronExpres){
    	List<Date> dates =null;
    	try{
    		CronTrigger cronIml =new CronTrigger();
    		cronIml.setCronExpression(cronExpres);
    		Calendar calendar = Calendar.getInstance(); 
    		Date now = calendar.getTime();  
    		calendar.add(Calendar.DATE, 1);
    		dates=TriggerUtils.computeFireTimesBetween(cronIml, null, now, calendar.getTime());

    		}catch(Exception e){
    			logger.error(e.getMessage(), e);
    		}
    	return dates;
    }
    
    /**
     * 生成job随机处理时间8小时内
     * @return List<Date>
     */
    
    public static Date getRandomFireTime(){
    	List<Date> dates =null;
    	try{
    		CronTrigger cronIml =new CronTrigger();
    		cronIml.setCronExpression("0 0/5 * * * ?");
    		Calendar calendar = Calendar.getInstance(); 
    		Date now = calendar.getTime();  
    		calendar.add(Calendar.HOUR, 8);
    		dates=TriggerUtils.computeFireTimesBetween(cronIml, null, now, calendar.getTime());

    		}catch(Exception e){
    			logger.error(e.getMessage(), e);
    		}
    	Random r = new Random();
    	//System.out.println(r.nextInt(96));
    	return dates.get(r.nextInt(96));
    }
    
    /**
     * 根据cron表达式获取下次运行时间
     * @return List<Date>
     */
    
    public static Date getNextFireTime(String cronExpres){
    	List<Date> dates =null;
    	try{
    		CronTrigger cronIml =new CronTrigger();
    		cronIml.setCronExpression(cronExpres);

    		dates=TriggerUtils.computeFireTimes(cronIml, null, 1);

    		}catch(Exception e){
    			logger.error(e.getMessage(), e);
    		}
    	return dates.get(0);
    }
    
    /**
     * Double类型转换成BigDecimal
     * 
     * @param val
     * 
     * @return BigDecimal
     */
    
    public static BigDecimal doubleToBigDecimal(Double val){
    	return new BigDecimal(Double.toString(val));
    }
    
    public static boolean checkJsonStringValid(String jsonString){
		boolean isValid=false;
		try {
			JSONObject.fromObject(jsonString);
			isValid=true;
		} catch (Exception e) {
			logger.error(e.getMessage());
		}	
		return isValid;
    }
    
	public static boolean checkCronExpValid(String cron_exp) {
		boolean isValid=false;
		try {
			CronTrigger cronIml = new CronTrigger();
			cronIml.setCronExpression(cron_exp);
			isValid=true;
		} catch (Exception e) {
			logger.error(e.getMessage());
		}	
		return isValid;
	}

}
