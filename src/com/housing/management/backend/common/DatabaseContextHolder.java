package com.housing.management.backend.common;

public class DatabaseContextHolder { 
	
	private static final ThreadLocal<String> contextHolder = new ThreadLocal<String>();  
	  
    public static void setCustomerType(String customerType) {  
        contextHolder.set(customerType);  
    }  
  
    public static String getCustomerType() {  
        return contextHolder.get();  
    }  
  
    public static void clearCustomerType() {  
        contextHolder.remove();  
    }  
}
