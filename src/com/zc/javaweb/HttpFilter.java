package com.zc.javaweb;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/*
 * 自定义HttpFilter.实现Filter接口
 * */
public abstract class HttpFilter implements Filter {
	private FilterConfig filterConfig;
	@Override
	public void init(FilterConfig filterConfig) throws ServletException {
		// TODO Auto-generated method stub
		this.filterConfig=filterConfig;
		init();
	}
	
	public void init(){}
	
	public FilterConfig getFilterConfig(){
		return filterConfig;
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub

	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp,
			FilterChain chain) throws IOException, ServletException {
		// TODO Auto-generated method stub
		HttpServletRequest request=(HttpServletRequest)req;
		HttpServletResponse response=(HttpServletResponse)resp;
		doFilter(request,response,chain);

	}
	
	//抽象类里的抽象方法.使得继承该类的子类必须重写该方法
	public abstract void doFilter(HttpServletRequest request,HttpServletResponse response,
			FilterChain filterChain)throws IOException,ServletException;

	

}
