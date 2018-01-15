package com.zc.javaweb;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

public class UserNameFilter implements Filter {

	private FilterConfig filterConfig;
    /**
     * Default constructor. 
     */
    public UserNameFilter() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
	
		//String initUser=filterConfig.getInitParameter("username");
		String initUser=new String("Tom");
		String username=request.getParameter("username");
		if(!initUser.equals(username))
		{
			request.setAttribute("message","用户名不正确");
			request.getRequestDispatcher("/login.jsp").forward(request, response);
		}
		chain.doFilter(request, response);
	}
	
	
	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
