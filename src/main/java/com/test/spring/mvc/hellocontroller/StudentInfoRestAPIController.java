package com.test.spring.mvc.hellocontroller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
public class StudentInfoRestAPIController {
	

	//**********************Retrive All Student*************************	//
		@ResponseBody
		@RequestMapping(value ="/students", method= RequestMethod.GET)
		public List<Student>getStudentList(){
			
			
			Student s1 = new Student();
			s1.setName("Ranjeet");
			s1.setMobile(7042300566L);
			Student s2 = new Student();
			s2.setName("Ranjeet");
			s2.setMobile(7042300566L);
			
			List<Student> studentList = new ArrayList();
			studentList.add(s1);
			studentList.add(s2);
			
			return studentList;
		}
		
		//**********************Retrive a specific  Student*************************//	
		@ResponseBody
		@RequestMapping(value ="/students/{name}", method= RequestMethod.GET)
		public Student getStudent(@PathVariable("name") String studentName)
		
		{
		
			// Retrieve the student record from database and return back to client
			
			Student s1 = new Student();
			s1.setName(studentName);
			s1.setMobile(9891047083L);
			
			return s1;
		}

}
