package com.housing.management.backend.common;

import java.lang.annotation.Documented;
import java.lang.annotation.Retention;
import java.lang.annotation.Target;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.ElementType;

//@Retention(RetentionPolicy.RUNTIME)  
//@Target(ElementType.METHOD)  
@Target({ElementType.TYPE, ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
public @interface DataSource {
	String value() default "dataSourceOne";
}
