/*
 * AppConfig.java
 */
package com.fazil.springhiber.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.ViewResolver;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.ViewResolverRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;
import org.springframework.web.servlet.view.JstlView;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

/**
 * Dispatcher servlet configuration
 * @author fazil
 *
 */
@Configuration
@EnableWebMvc
@ComponentScan(basePackages="com.fazil.springhiber")
public class AppConfig extends WebMvcConfigurerAdapter{
	
	/**
	 * Tiles Configurer bean
	 * @return
	 */
	@Bean
	public TilesConfigurer tilesConfigurer(){
		TilesConfigurer tileConfigurer = new TilesConfigurer();
		tileConfigurer.setDefinitions("/WEB-INF/views/**/tiles.xml");
		tileConfigurer.setCheckRefresh(true);
		return tileConfigurer;
	}
	/**
	 * configure view tile resolvers
	 */
	@Override
	public void configureViewResolvers(ViewResolverRegistry registry) {
		TilesViewResolver viewResolver = new TilesViewResolver();
		registry.viewResolver(viewResolver);
	}
	
	/**
	 * add resource handlers
	 */
	@Override
	public void addResourceHandlers(ResourceHandlerRegistry registry) {
		registry.addResourceHandler("/static/**").addResourceLocations("/static/");
	}
	/*
	 * Normal view resolver
	@Bean
	public ViewResolver viewResolver(){
		InternalResourceViewResolver viewResolver = new InternalResourceViewResolver();
		viewResolver.setViewClass(JstlView.class);
		viewResolver.setPrefix("/WEB-INF/views/");
		viewResolver.setSuffix(".jsp");
		return viewResolver;
	}
	 */
	/*@Override
	public void addInterceptors(InterceptorRegistry registry) {
		registry.addInterceptor(new AuthenticationInterceptor());
		super.addInterceptors(registry);
	}*/
}
