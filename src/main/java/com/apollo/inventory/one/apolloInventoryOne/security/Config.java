package com.apollo.inventory.one.apolloInventoryOne.security;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.crypto.password.StandardPasswordEncoder;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import javax.sql.DataSource;
import java.beans.PropertyVetoException;
import java.util.logging.Logger;

@EnableWebMvc
@Configuration

@PropertySource("classpath:persistence-mysql.properties")
public class Config {

@Autowired
private Environment environment;

Logger logger =Logger.getLogger(getClass().getName());


@Bean
public PasswordEncoder encoder()
{
    return  new BCryptPasswordEncoder();
}

//define a bean for Security data source

//    @Bean
//    public DataSource dataSource()
//    {
//        //create a connection pool
//        ComboPooledDataSource securityDataSource=new ComboPooledDataSource();
//
//        //set the jdbc driver class
//        try {
//            securityDataSource.setDriverClass(environment.getProperty("jdbc.driver"));
//        } catch (PropertyVetoException e) {
//            throw new RuntimeException(e);
//        }
//
//        //log the connection props
//        logger.info(">>>>jdbc.url="+ environment.getProperty("jdbc.url"));
//        logger.info(">>>>jdbc.user="+ environment.getProperty("jdbc.user"));
//
//        //set database connection props
//        securityDataSource.setJdbcUrl(environment.getProperty("jdbc.url"));
//        securityDataSource.setUser(environment.getProperty("jdbc.user"));
//        securityDataSource.setPassword(environment.getProperty("jdbc.password"));
//
//        //set connection pool props
//        securityDataSource.setInitialPoolSize(5);//getIntProperty(  "connection.Pool.initialPoolSize"));
//        securityDataSource.setMinPoolSize(5);//getIntProperty("connection.Pool.minPoolSize"));
//        securityDataSource.setMaxPoolSize(20);//(getIntProperty("connection.Pool.maxPoolSize"));
//        securityDataSource.setMaxIdleTime(30000);//(getIntProperty("connection.Pool.maxIdlePoolSize"));
//
//        return securityDataSource;
//    }


    //need a helper methos
    //read a environment property and convert to int

//    private int getIntProperty(String propName)
//    {
//        String propVal= environment.getProperty(propName);
//        int intPropVal=Integer.parseInt(propVal);
//        return intPropVal;
//    }

}


