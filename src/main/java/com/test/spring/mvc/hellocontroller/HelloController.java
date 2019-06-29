package com.test.spring.mvc.hellocontroller;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
import javax.servlet.http.HttpServletRequest;
 
@Controller
public class HelloController  {

	@RequestMapping("/welcome/{Country}/{userName}")
	public ModelAndView helloWorld(@PathVariable Map<String,String> pathVariable) {
		
		String name = pathVariable.get("userName");
		String country = pathVariable.get("Country");
		ModelAndView model = new ModelAndView("hellopage");
		model.addObject("Message" ,"Hello " +name +" you are from " +country );
	
		return model;
	}
	
	@RequestMapping("/hi")
	public ModelAndView hell() {
		
		ModelAndView model = new ModelAndView("welcome");
		model.addObject("Message" ,"This is spring MVC Test");
	
		return model;
	}

}