/*
 * AppIntializator
 */
package com.fazil.springhiber.config;

import javax.servlet.Filter;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

/**
 * Java based web.xml configuration
 * @author fazil
 *
 */
/*
 * If we implements WebApplicationInitializer instead ofWebApplicationInitializer
 * We have to do below code
 * @Override
	public void onStartup(ServletContext container) throws ServletException {
		AnnotationConfigWebApplicationContext context = new AnnotationConfigWebApplicationContext();
		context.register(AppConfig.class);
		context.setServletContext(container);
		
		ServletRegistration.Dynamic servlet = container.addServlet("dispatcher", new DispatcherServlet(context));
		servlet.setLoadOnStartup(1);
		servlet.addMapping("/");		
	}
 * 
 */
public class AppInitializer extends  AbstractAnnotationConfigDispatcherServletInitializer{

	@Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[] { AppConfig.class };
    }
	
	@Override
	protected Class<?>[] getServletConfigClasses() {
		return null;
	}
    /*@Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[]{AuthenticationInterceptor.class};
    }*/
  
    @Override
    protected String[] getServletMappings() {
        return new String[] { "/" };
    } 
    
    @Override
    protected Filter[] getServletFilters() {
    	return new Filter[] { new AuthenticationFilter()};
    }

	
}
