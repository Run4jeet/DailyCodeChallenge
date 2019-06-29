package com.test.spring.mvc.hellocontroller;

import java.util.Calendar;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

public class DayOfWeekBasedAccessInterceptor extends HandlerInterceptorAdapter{
	
	@Override
	public boolean preHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler) throws Exception {
		
		Calendar cl = Calendar.getInstance();
		
		int dayOfWeek = cl.get(cl.DAY_OF_WEEK);
		
		if(dayOfWeek ==1)
		{
		response.getWriter().write("The site is on uder maintaince!!! Please try on next day");
		return false;
		}
		
		return true;
	}
	
	@Override
	public void postHandle(HttpServletRequest request,
			HttpServletResponse response, Object handler,ModelAndView model) throws Exception{
		System.out.println("Test postHandle ");
	}
	

	@Override
	public void afterCompletion(HttpServletRequest request,
			HttpServletResponse response, Object handler,Exception ex) throws Exception{
		
		System.out.println("Test afterCompletion ");
	}
			
	}