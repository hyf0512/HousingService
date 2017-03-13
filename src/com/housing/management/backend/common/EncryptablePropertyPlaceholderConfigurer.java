package com.housing.management.backend.common;

import java.util.Properties;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanInitializationException;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.config.PropertyPlaceholderConfigurer;


public class EncryptablePropertyPlaceholderConfigurer extends PropertyPlaceholderConfigurer {
    private static final String key1 = "sql.jdbc.one.password";
    private static final String key2 = "sql.jdbc.two.password";
    private static final String key3 = "sql.jdbc.three.password";
    
    protected void processProperties(ConfigurableListableBeanFactory beanFactory, Properties props)
        throws BeansException {
            try {
//                DesEncrypt des = new DesEncrypt();
                String dbPassword1 = props.getProperty(key1);
                if (dbPassword1 != null) {
                	DESUtil desUtil = new DESUtil();
                    props.setProperty(key1, desUtil.decrypt(dbPassword1));
                }
                
                String dbPassword2 = props.getProperty(key2);
                if (dbPassword2 != null) {
                	DESUtil desUtil = new DESUtil();
                    props.setProperty(key2, desUtil.decrypt(dbPassword2));
                }
//                
                String dbPassword3 = props.getProperty(key3);
                if (dbPassword3 != null) {
                	DESUtil desUtil = new DESUtil();
                    props.setProperty(key3, desUtil.decrypt(dbPassword3));
                }
//                
                super.processProperties(beanFactory, props);
            } catch (Exception e) {
                e.printStackTrace();
                throw new BeanInitializationException(e.getMessage());
            }
        }
    }