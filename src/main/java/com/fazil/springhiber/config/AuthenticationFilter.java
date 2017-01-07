package com.fazil.springhiber.config;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class AuthenticationFilter implements Filter {

	@Override
	public void init(FilterConfig filterConfig) throws ServletException {

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain)
			throws IOException, ServletException {
		System.out.println("Filter Begin..");
		HttpServletRequest req = (HttpServletRequest)request;
		if("/".equals(req.getServletPath()) || "/login".equals(req.getServletPath()) || req.getServletPath().startsWith("/static/")){
			chain.doFilter(request, response);
		}else if(req.getSession().getAttribute("userSession") != null && !req.getSession().getAttribute("userSession").toString().isEmpty()){
			chain.doFilter(request, response);
		}else{
			((HttpServletResponse)response).sendRedirect(req.getContextPath()+"?error=authenticationFailed");
			//req.getRequestDispatcher("/").forward(request, response);
		}		
		System.out.println("Filter End..");
	}

	@Override
	public void destroy() {
	}

}
