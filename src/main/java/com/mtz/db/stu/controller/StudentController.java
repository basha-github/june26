package com.mtz.db.stu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mtz.db.stu.model.Student;
import com.mtz.db.stu.service.StudentService;

@RestController
public class StudentController {
	
	//StudentService stuService = new StudentService();
	
	@Autowired
	StudentService stuService;
	
	
	@PostMapping("/mtz/stu/add")
	public Student addNewStudent(@RequestBody Student stu){
		
		return stuService.addNewStudentRecord(stu);
		
	}

}
