package com.example.jpausermanytomanyprimarykey.repository;

import com.example.jpausermanytomanyprimarykey.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book,Integer> {
}
