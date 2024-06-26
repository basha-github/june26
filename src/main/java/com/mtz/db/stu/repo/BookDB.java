package com.mtz.db.stu.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mtz.db.stu.model.Book;

public interface BookDB extends JpaRepository<Book, String> {

}
