package com.mtz.db.stu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtz.db.stu.model.Student;
import com.mtz.db.stu.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo stuRepo;

	public Student addNewStudentRecord(Student stu) {
		
		return stuRepo.save(stu);
	}

}
