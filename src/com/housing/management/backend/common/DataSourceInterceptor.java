package com.housing.management.backend.common;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.apache.commons.lang.StringUtils;

public class DataSourceInterceptor implements MethodInterceptor  {

	
	private String defaultDsName  = null;
	
	public String getDefaultDsName() {
		return defaultDsName;
	}

	public void setDefaultDsName(String defaultDsName) {
		this.defaultDsName = defaultDsName;
	}

	/**
	 * 其中一种方式：从Service方法，读取注入的数据源指定连接
	 */
	public Object invoke(MethodInvocation mi) throws Throwable {
		
		
		Class<?> ifc = mi.getMethod().getDeclaringClass();
		if ( ifc.isInterface()) {
			
			return mi.proceed();
		}
		
		String injectedDataSource = null;
		if (mi.getMethod().isAnnotationPresent(DataSource.class)) {
			
			DataSource dncDs = mi.getMethod().getAnnotation(DataSource.class);
			injectedDataSource = dncDs.value();
		}

		if (StringUtils.isBlank(injectedDataSource)) {
			
			injectedDataSource = this.getDefaultDsName();
		}
		
		DatabaseContextHolder.setCustomerType( injectedDataSource );
		
//		logger.debug("Inject DataSource from {{}} for method {{}} invoking", injectedDataSource, mi.getMethod());
		
		try{
			
			return mi.proceed();
		}
		finally {
			
//			logger.debug("Reset DataSource from {{}} for method {{}} invoking", injectedDataSource, mi.getMethod());
			DatabaseContextHolder.clearCustomerType();
		}
	}
	
	/**
	 * 直接配置
	 * @param point
	 */
	 public void setdataSourceOne() {  
		 DatabaseContextHolder.setCustomerType("dataSourceOne");  
	 }  
	      
		/**
		 * 直接配置
		 * @param point
		 */
    public void setdataSourceTwo() {  
        DatabaseContextHolder.setCustomerType("dataSourceTwo");  
    }  
    
    /**
	 * 直接配置
	 * @param point
	 */
    public void setdataSourceThree(){
    	DatabaseContextHolder.setCustomerType("dataSourceThree");  
    }
    
//    public void before(JoinPoint point)  
//    {  
//        Object target = point.getTarget();  
//        String method = point.getSignature().getName();  
//  
//        Class<?>[] classz = target.getClass().getInterfaces();  
//  
//        Class<?>[] parameterTypes = ((MethodSignature) point.getSignature())  
//                .getMethod().getParameterTypes();  
//        try {  
//            Method m = classz[0].getMethod(method, parameterTypes);  
//            if (m != null && m.isAnnotationPresent(DataSource.class)) {  
//                DataSource data = m  
//                        .getAnnotation(DataSource.class);  
//                DynamicDataSourceHolder.putDataSource(data.value());  
//                System.out.println(data.value());  
//            }  
//              
//        } catch (Exception e) {  
//            // TODO: handle exception  
//        }  
//    }  
	
}
