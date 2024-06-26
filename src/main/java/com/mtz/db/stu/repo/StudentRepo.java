package com.mtz.db.stu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtz.db.stu.model.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {

}
