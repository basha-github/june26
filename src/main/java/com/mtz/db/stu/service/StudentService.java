package com.mtz.db.stu.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mtz.db.stu.model.Book;
import com.mtz.db.stu.model.Student;
import com.mtz.db.stu.repo.BookDB;
import com.mtz.db.stu.repo.StudentRepo;

@Service
public class StudentService {
	
	@Autowired
	StudentRepo stuRepo;
	
	@Autowired
	BookDB bookDB;
	

	public Student addNewStudentRecord(Student stu) {
		
		return stuRepo.save(stu);
	}

	public Book saveNewBook(Book book) {
		
		return bookDB.save(book);
	}

}
