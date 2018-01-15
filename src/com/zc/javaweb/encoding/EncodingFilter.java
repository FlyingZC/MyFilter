package com.zc.javaweb.encoding;

import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.zc.javaweb.HttpFilter;

public class EncodingFilter extends HttpFilter {
	private String encoding;
	
	public void init()
	{
		encoding=getFilterConfig().getServletContext().getInitParameter("ecoding");
		
	}
	
	@Override
	public void doFilter(HttpServletRequest request,
			HttpServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding(encoding);
		filterChain.doFilter(request, response);
		
	}

}
