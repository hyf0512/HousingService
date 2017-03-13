package com.housing.management.backend.service.one;

import java.util.Calendar;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.housing.management.backend.common.Utils;

@Service
public class SecurityService
{
  private static final Logger logger = Logger.getLogger(SecurityService.class);
//  
//  @Autowired
//  private RedisCacheService redisService;

//  @Autowired
//  private LoginDAO loginDao;

  @Value("#{propertiesFactory['time_valid_range']}")
  private String time_valid_range;

  public boolean isRequestTimeValid(Date date_req)
  {
    logger.debug("prepare time str");

    Calendar calendar_req = Calendar.getInstance();
    calendar_req.setTime(date_req);

    Date date_now = new Date();
    Calendar calendar_now = Calendar.getInstance();
    calendar_now.setTime(date_now);

    logger.debug("time_valid_range : " + this.time_valid_range);
    int time_valid_range_sec = Utils.getTimeValidRange(this.time_valid_range);

    long time_before = date_now.getTime() - (time_valid_range_sec * 1000);
    Calendar calendar_before = Calendar.getInstance();
    calendar_before.setTimeInMillis(time_before);

    long time_after = date_now.getTime() + time_valid_range_sec * 1000;
    Calendar calendar_after = Calendar.getInstance();
    calendar_after.setTimeInMillis(time_after);

    logger.debug(calendar_req.getTime());
    logger.debug(calendar_before.getTime());
    logger.debug(calendar_after.getTime());

    if ((calendar_req.before(calendar_before)) || (calendar_req.after(calendar_after))) {
      logger.warn("time_str invalid , request time[" + calendar_req.getTime() + "],current server time[" + calendar_now.getTime() + 
        "]");
      return false;
    }
    return true;
  }

	public boolean isTokenValid(String url, String token, String username, String OSType) {
		logger.debug("URL : " + url);

		// 加入判断，所有security_token为空，则是登录，或者是version调用
		if(null == token || "".equals(token)){
			String patternString = "^http://(\\S)+(/user/login|/version|/masterdata/basecode|/user/changePassword|/upload)$";
		    Pattern pattern = Pattern.compile(patternString);
		    Matcher matcher = pattern.matcher(url);
		    if(matcher.find()){
		    	//登录
				return true;
		    }else{
		    	return false;
		    }
		}
        
		// check cache before db
//		String token_in_cache=redisService.getValue(Constants.REDIS_KEY_HEADER_TOKEN+username);
//		if(token_in_cache!=null&&token.equals(token_in_cache.trim())){
//			logger.info("cache hit");
//			return true;
//		}
		//验证token是否过期代码
//		Login paramLogin = new Login();
//		paramLogin.setUserId(username);
//		paramLogin.setOSType(OSType);
//		Login loginAccount = this.loginDao.getLogin(paramLogin);
//		if (loginAccount == null) {
//			//没有对应的登录记录，但不是登录请求
//			return false;
//		}
//
//		if ((loginAccount != null)
//				&& (token.equalsIgnoreCase(loginAccount.getSecurityToken()))) {
//			logger.info("token expire time : " + loginAccount.getTokenExpire());
//			return loginAccount.getTokenExpire().after(new Date());
//		}
		return false;
	}
}