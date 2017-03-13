package com.housing.management.backend.rest;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.servlet.http.HttpSession;

import org.apache.commons.lang.StringUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.housing.management.backend.domain.Fcbzyy;
import com.housing.management.backend.domain.FcbzyyChb;
import com.housing.management.backend.domain.FcbzyySldd;
import com.housing.management.backend.domain.FcbzyyYwlb;
import com.housing.management.backend.domain.WorkDay;
import com.housing.management.backend.service.one.AppointmentService;
import com.housing.management.backend.service.one.FcbbyyLoginService;
import com.housing.management.backend.service.two.WorkDayService;

@Controller
@RequestMapping({ "/appointment" })
public class AppointmentRestService {
	private static final Logger logger = Logger.getLogger(AppointmentRestService.class);
	
	@Autowired
	private AppointmentService appointmentService;
	@Autowired
	private WorkDayService workDayService;
	@Autowired
	private FcbbyyLoginService fcbbyyLoginService;
	
	/**
	 * 受理地点列表
	 */
	@RequestMapping(value = { "/address/list" }, method = { RequestMethod.GET })
	@ResponseBody
	public List<FcbzyySldd> getAddressList(HttpSession session) {
		
//		session.setAttribute("userId", "test01");
		
		logger.info("查询受理地点开始");

		List<FcbzyySldd> fcbzyySlddList = appointmentService.getAddressList();
		
		logger.info("查询受理地点结束");
		  
		return fcbzyySlddList;
	}
	
	/**
	 * 受理时间段列表
	 */
	@RequestMapping(value = { "/time/list/{slddId}" }, method = { RequestMethod.GET })
	@ResponseBody
	public List<FcbzyyChb> getTimeList(@PathVariable String slddId,HttpSession session) {
//		System.out.println(session.getAttribute("userId"));
		logger.info("查询受理时间段列表开始");

		List<FcbzyyChb> fcbzyyChbList = appointmentService.getTimeList(slddId);
		
		logger.info("查询受理时间段列表结束");
		  
		return fcbzyyChbList;
	}
	
	/**
	 * 业务类别列表
	 */
	@RequestMapping(value = { "/bussinessType/list" }, method = { RequestMethod.GET })
	@ResponseBody
	public List<FcbzyyYwlb> getBussinessTypeList() {
		logger.info("查询业务类别列表开始");

		List<FcbzyyYwlb>fcbzyyYwlbList = appointmentService.getBussinessTypeList();
		
		logger.info("查询业务类别列表结束");
		  
		return fcbzyyYwlbList;
	}
	
	/**
	 * 受理日期和对应剩余数
	 * 
	 * @param slddId
	 * @throws ParseException 
	 */
	@RequestMapping(value = { "/date/number/list/{slddId}" }, method = { RequestMethod.GET })
	@ResponseBody
	public List<FcbzyyChb> getDateAndNumberList(@PathVariable String slddId) throws ParseException {
		logger.info("查询受理日期和对应剩余数开始");
		
		//List<FcbzyyChb> fcbzyyChbList = appointmentService.getDateAndNumberList(slddId);
		List<FcbzyyChb> fcbzyyChbList = new ArrayList<FcbzyyChb>();
		List<WorkDay> workDayList = workDayService.getWorkDayList();
		int j=0;
		
		
		for(int i=1;i<100;i++){
			boolean workday = true;
			boolean jjr=false;
			String day = appointmentService.getDay(i);
			//fcbzyychb.setCjsj(day);
			for(WorkDay workDay: workDayList){
				if(day.equals(workDay.getWdDate())){
					jjr=true;
					break;
				}
			}
			if(!jjr){
				SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
				//String pTime = "2016-03-05";
				Calendar c = Calendar.getInstance();
				c.setTime(format.parse(day));
				int dayForWeek = 0;
				dayForWeek = c.get(Calendar.DAY_OF_WEEK) - 1;
				if(dayForWeek==0||dayForWeek==6){
					workday=false;
				}
			}
			if(workday){
				j=j+1;
				FcbzyyChb fcbzyychb = new FcbzyyChb();
				fcbzyychb.setCjsj(day);
				fcbzyychb.setSlddId(slddId);
				int yyzs = appointmentService.getYyzs(slddId);//预约总数
				int yyys = appointmentService.getYyys(fcbzyychb);//已预约数
				int syyys = yyzs-yyys;
				String syyys1 = String.valueOf(syyys);
				fcbzyychb.setYysy(syyys1);
				fcbzyyChbList.add(fcbzyychb);
			}
			if(j==5){
				break;
			}
		}
		// 需要过滤workday
		logger.info("查询受理日期和对应剩余数结束");
		  
		return fcbzyyChbList;
	}
	
	/**
	 * 插入预约信息
	 */
	@RequestMapping(value = { "/insert/info" }, method = { RequestMethod.POST })
	@ResponseBody
	public int insertInfo(@RequestBody Fcbzyy fcbzyy) {
		logger.info("查询插入预约信息开始");

		int result = appointmentService.insertInfo(fcbzyy);
		
		logger.info("查询插入预约信息结束");
		  
		return result;
	}
	
	@RequestMapping(value = { "/workday" }, method = { RequestMethod.GET })
	@ResponseBody
	public List<WorkDay> getWorkDayList(){
		return workDayService.getWorkDayList();
	}

	/**
	 * 登录
	 */
	@RequestMapping(value = { "/login" }, method = { RequestMethod.POST })
	@ResponseBody
	public Fcbzyy login(@RequestBody Fcbzyy fcbzyy) {
		
		//int result = 0;
		Fcbzyy fcbzyyR = fcbbyyLoginService.login(fcbzyy.getLoginUserName(), fcbzyy.getLoginPassword());
		//if(fcbzyyR!=null){
			//result = 1;
		//}
		
		return fcbzyyR;
	}
	/**
	 * 查询预约
	 */
	@RequestMapping(value = { "/searchyy/list/{userId}" }, method = { RequestMethod.GET })
	@ResponseBody
	public List<Fcbzyy> getfcbzyylist(@PathVariable String userId) throws ParseException{
		logger.info("查询预约列表开始");
		List<Fcbzyy> fcbzyylist = appointmentService.getyylist(userId);
		logger.info("查询预约列表结束");
		return fcbzyylist;
		
	}
	/**
	 * 查询预约详细
	 */
	@RequestMapping(value = { "/fcbzyy/list/detil/{yyh}" }, method = { RequestMethod.GET })
	@ResponseBody
	public Fcbzyy searchyydetil(@PathVariable String yyh) {
		logger.info("查询预约详情开始");
		Fcbzyy detil = new Fcbzyy();
		detil = appointmentService.searchyydetil(yyh);
		logger.info("查询预约详情结束");
		return detil;
	}
	/**
	 * 删除预约记录
	 * @return 
	 */
	@RequestMapping(value = { "/fcbzyy/delete" }, method = { RequestMethod.POST })
	@ResponseBody
	public Fcbzyy deleteyy(@RequestBody Fcbzyy fcbzyy) {
		logger.info("删除预约记录开始");
		Fcbzyy fcbzyy1 = new Fcbzyy();
		fcbzyy1 = appointmentService.updatefcbzyy(fcbzyy);
		logger.info("删除预约记录结束");
		return fcbzyy1;
	}
}
