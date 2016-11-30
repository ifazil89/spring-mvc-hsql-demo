/*
 * HibernateConfiguration.java
 */
package com.fazil.springhiber.config;

import java.util.Properties;

import javax.sql.DataSource;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabase;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseBuilder;
import org.springframework.jdbc.datasource.embedded.EmbeddedDatabaseType;
import org.springframework.orm.hibernate4.HibernateTransactionManager;
import org.springframework.orm.hibernate4.LocalSessionFactoryBean;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement
@ComponentScan(basePackages="com.fazil.springhiber.config")
@PropertySource(value={"classpath:application.properties"})
public class HibernateConfiguration {

	@Autowired
	private Environment environment;
	
	@Bean
	public LocalSessionFactoryBean sessionFactory(){
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setPackagesToScan(new String[]{"com.fazil.springhiber.model"});
		sessionFactory.setHibernateProperties(hibernateProperties());
		return sessionFactory;
	}
	
	/**
	 * Data source for MySql
	 * @return
	 */
	/*@Bean
	public DataSource dataSource(){
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		dataSource.setDriverClassName(environment.getRequiredProperty("jdbc.driverClassName"));
		dataSource.setUrl(environment.getRequiredProperty("jdbc.url"));
		dataSource.setUsername(environment.getRequiredProperty("jdbc.userName"));
		dataSource.setPassword(environment.getRequiredProperty("password"));
		return dataSource;
	}*/
	
	/**
	 * Data source for embedded HSQL database
	 * @return
	 */
	@Bean
	public DataSource dataSource(){
		EmbeddedDatabaseBuilder builder = new EmbeddedDatabaseBuilder();
		EmbeddedDatabase dataBase = builder.setType(EmbeddedDatabaseType.HSQL)
										.addScript("db/create-tables.sql")
										.addScript("db/insert-data.sql")
										.build();
		return dataBase;
	}
	
	@Autowired
	@Bean
	public HibernateTransactionManager transactionManager(SessionFactory sf){
		HibernateTransactionManager transactionManager = new HibernateTransactionManager();
		transactionManager.setSessionFactory(sf);
		return transactionManager;
	}
	
	private Properties hibernateProperties(){
		Properties hibernatePropeties = new Properties();
		hibernatePropeties.put("hibernate.dialect", environment.getRequiredProperty("hibernate.dialect"));
		hibernatePropeties.put("hibernate.show_sql", environment.getRequiredProperty("hibernate.show_sql"));
		hibernatePropeties.put("hibernate.format_sql", environment.getRequiredProperty("hibernate.show_sql"));
		return hibernatePropeties;
	}
}
