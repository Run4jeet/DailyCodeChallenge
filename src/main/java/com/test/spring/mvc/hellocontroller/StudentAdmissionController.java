package com.test.spring.mvc.hellocontroller;


import java.sql.Date;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import javax.validation.Valid;
import javax.xml.bind.Binder;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class StudentAdmissionController {
	
	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setDisallowedFields(new String [] {"mobile"});
		
		SimpleDateFormat sf = new SimpleDateFormat("yyyy***mm**dd");
		binder.registerCustomEditor(Date.class ,"dob",new CustomDateEditor(sf,false));
		binder.registerCustomEditor(String.class ,"name",new StudentNameEditor());
	}
	
	
	@RequestMapping(value ="admisionForm.html", method= RequestMethod.GET)
	public ModelAndView getAddmisionForm() {
		ModelAndView model = new ModelAndView("admisionForm");
		//model.addObject("msg" , "Jabalpur Engineering College ");
	
		return model;
	}
	
	@ModelAttribute
	public void commonCode(Model model) {
		
		model.addAttribute("msg" , "Jabalpur Engineering College ");
	
	}
	
	@RequestMapping(value ="submitAdmisionForm.html", method= RequestMethod.POST)
	public ModelAndView submitAddmisionForm(@Valid @ModelAttribute("student") Student student,BindingResult result ) {
		
		/*
		 * ArrayList list = new ArrayList(); list.add("Java"); list.add("Spring ");
		 * student.setSkills(list);
		 */
		
	
		if(result.hasErrors()) {
			ModelAndView model = new ModelAndView("admisionForm");
			return model;
		}
		System.out.println(student.getSkills());
		
		ModelAndView model = new ModelAndView("admissionSuccess");
		//model.addObject("msg" , "Jabalpur Engineering College "); 
		 
		return model;
	}
	/*
	 * @RequestMapping(value ="submitAdmisionForm.html", method= RequestMethod.POST)
	 * public ModelAndView submitAddmisionForm(@RequestParam(value = "name",
	 * defaultValue ="XYZ" )String name, @RequestParam("hobby")String hobby) {
	 * ModelAndView model = new ModelAndView("admissionSuccess");
	 * model.addObject("msg" , "name " + name + " hobby is  "+ hobby); return model;
	 * }
	 */

}
