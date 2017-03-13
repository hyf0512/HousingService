package com.housing.management.backend.filter;

import java.io.IOException;
import java.text.ParseException;
import java.util.Date;
import java.util.Enumeration;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.sf.json.JSONObject;

import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.time.DateUtils;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import com.housing.management.backend.service.one.SecurityService;

@Service
public class AccessControlFilter implements Filter
{
  private static Logger logger = Logger.getLogger(AccessControlFilter.class);

  @Autowired
  private SecurityService securityService;
  private FilterConfig config;
  
   @Value("#{propertiesFactory['access_control_flag']}")
   private int access_control_flag;

  public void init(FilterConfig config)
    throws ServletException
  {
    this.config = config;
  }

  public void destroy() {
    this.config = null;
  }

	public void doFilter(ServletRequest request, ServletResponse response,
			FilterChain chain) throws IOException, ServletException {
		HttpServletRequest httpServletRequest = (HttpServletRequest) request;
		HttpServletResponse httpServletResponse = (HttpServletResponse) response;

		if (access_control_flag == 0) {
			chain.doFilter(request, response);
		}
		
		String os_type =  httpServletRequest.getHeader("os_type");
		String device_id =  httpServletRequest.getHeader("device_id");
	    String time_str = httpServletRequest.getHeader("time_str");
		String account_name = httpServletRequest.getHeader("account_name");
		String security_token =  httpServletRequest.getHeader("security_token");

		logger.debug("common data: " + os_type + " " + device_id + " " + " "
				+ security_token + " " + time_str + " " + account_name);
		String errorResp;
		
		String patternString = "^http://(\\S)+(/upload)$";
	    Pattern pattern = Pattern.compile(patternString);
	    Matcher matcher = pattern.matcher(httpServletRequest.getRequestURL().toString());
	    if(matcher.find()){
	    	//上传
	    	chain.doFilter(request, response);
	    }else{
	    	if (isCommonDataValid(os_type, device_id, time_str, account_name)) {
				if (isTimeStrValid(time_str)) {
					boolean isTokenValid =false;
					try{
					     isTokenValid = isSecurityTokenValid(httpServletRequest,  security_token, account_name, os_type);
					}catch(Exception e){
						logger.error("error happen when validate token", e);
						errorResp = generateErrorResponse(
								"sys error",
								"系统异常："+e.getMessage());
						responseWriteErrorMsg(httpServletResponse, errorResp);
					}
					if (isTokenValid) {
						chain.doFilter(request, response);
					} else {
						errorResp = generateErrorResponse(
								"sys logout",
								/*"安全校验码异常"*/"超时系统自动退出!");
						responseWriteErrorMsg(httpServletResponse, errorResp);
					}
				} else {
					errorResp = generateErrorResponse(
							"sys time out", "请求时间戳异常");
					responseWriteErrorMsg(httpServletResponse, errorResp);
				}
			} else {
				errorResp = generateErrorResponse(
						"sys param error", "公共请求参数异常");
				responseWriteErrorMsg(httpServletResponse, errorResp);
			}
	    }
		
		
	}

	private boolean isTimeStrValid(String time_str) {
		try {
			Date requestDate = DateUtils.parseDate(time_str,
					new String[] { "yyyyMMddHHmmss" });
			return this.securityService.isRequestTimeValid(requestDate);
		} catch (ParseException e) {
			logger.error(e.getMessage(), e); 
		}
		return false;
	}

  private boolean isCommonDataValid(String os_type, String device_id, String time_str, String account_name)
  {
    return ((!(StringUtils.isEmpty(os_type))) && (!(StringUtils.isEmpty(device_id))) && (!(StringUtils.isEmpty(time_str))) && (!(StringUtils.isEmpty(account_name))));
  }

  private boolean isSecurityTokenValid(HttpServletRequest httpServletRequest, String token, String accountName, String OSType) {
    return this.securityService.isTokenValid(httpServletRequest.getRequestURL().toString(), token, accountName, OSType);
  }

  private void printRequestHeader(HttpServletRequest httpServletRequest)
  {
    Enumeration<String> headerNames = httpServletRequest.getHeaderNames();
    String headerName = "";
    String headerValue = "";
    while (headerNames.hasMoreElements()) {
      headerName = (String)headerNames.nextElement();
      headerValue = httpServletRequest.getHeader(headerName);
      if (logger.isInfoEnabled())
        logger.info(headerName + ":" + headerValue);
    }
  }

  private String generateErrorResponse(String error_code, String error_msg)
  {
    JSONObject jo = new JSONObject();
    jo.put("error_code", error_code);
    jo.put("error_msg", error_msg);
    return jo.toString();
  }

  private void responseWriteErrorMsg(HttpServletResponse httpServletResponse, String response_str)
    throws IOException
  {
    httpServletResponse.setContentType("application/json;charset=UTF-8");
    httpServletResponse.getWriter().write(response_str);
  }
}
