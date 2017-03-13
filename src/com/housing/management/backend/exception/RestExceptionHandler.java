package com.housing.management.backend.exception;

import java.util.HashMap;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.context.request.WebRequest;
import org.springframework.web.servlet.mvc.method.annotation.ResponseEntityExceptionHandler;

@ControllerAdvice
public class RestExceptionHandler extends ResponseEntityExceptionHandler
{
  private static final Logger logger = Logger.getLogger(RestExceptionHandler.class);

  @ExceptionHandler({BusinessException.class})
  public final ResponseEntity<?> handleException(BusinessException ex, WebRequest request)
  {
    Map<String,String> dd = new HashMap<String,String>();
    dd.put("succ_flag", "1");
    dd.put("error_code", ex.getErrorCode());
    dd.put("error_msg", ex.getMessage());
    return new ResponseEntity<Object>(dd, HttpStatus.OK);
  }

  @ExceptionHandler({RuntimeException.class})
  public final ResponseEntity<?> handleException(RuntimeException ex, WebRequest request)
  {
	logger.error(ex.getMessage(), ex);
	
    Map<String,String> dd = new HashMap<String,String>();
    dd.put("succ_flag","1");
    dd.put("error_code", "-1");
    dd.put("error_msg", "system error: " + ex.getMessage());
    return new ResponseEntity<Object>(dd, HttpStatus.INTERNAL_SERVER_ERROR);
  }
}
