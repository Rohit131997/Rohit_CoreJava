package com.spring.cofig;

import org.omg.CORBA.Environment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.spring.drivers.Database;

@Configuration
@ComponentScan("com.spring")
@PropertySource("classpath:oracledatabase.properties")
public class appconfig {
	@Autowired
    Environment environment;
// bean annotation
@Bean
Database MySqlDriver() {
	MySqlDriver mysql = new MySqlDriver();
mysql.setDriver(environment.getProperty("db.driver"));
    mysql.setUrl(environment.getProperty("db.url"));
    mysql.setPort(Integer.parseInt(environment.getProperty("db.port")));
    mysql.setUser(environment.getProperty("db.user"));
    mysql.setPassword(environment.getProperty("db.password"));

    return oracleDriver;

}

@Bean
Database mysqlDriver() {
	return new MySqlDriver();
}
	

}
