package com.housing.management.backend.exception;

import java.io.PrintStream;
import java.io.PrintWriter;

import org.apache.log4j.Logger;

public class BusinessException extends RuntimeException
{
 private static final Logger logger = Logger.getLogger(BusinessException.class);
	 
  private static final long serialVersionUID = -6511002503497232801L;
  private String errorCode;
  private String message;

  public BusinessException(String message)
  {
    this.message = message;
  }

  public BusinessException(String errorCode, String message) {
    this.message = message;
    this.errorCode = errorCode;
  }

  public BusinessException(String message, Throwable cause) {
    super(cause);
    this.message = message;
  }

  public BusinessException(String errorCode, String message, Throwable cause)
  {
    super(errorCode, cause);
    this.errorCode = errorCode;
    this.message = message;
  }

  public void printStackTrace(PrintStream outStream) {
	  logger.equals(new PrintWriter(outStream));
  }

  public void printStackTrace(PrintWriter writer) {
    super.printStackTrace(writer);
    writer.flush();
  }

  public String getErrorCode() {
    return this.errorCode;
  }

  public void setErrorCode(String errorCode) {
    this.errorCode = errorCode;
  }

  public String getMessage() {
    return this.message;
  }

  public void setMessage(String message) {
    this.message = message;
  }

}
