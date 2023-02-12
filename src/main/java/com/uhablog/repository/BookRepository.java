package com.uhablog.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.uhablog.model.Book;

public interface BookRepository extends JpaRepository<Book, Integer> {

}
