package com.example.jpausermanytomanyprimarykey.repository;

import com.example.jpausermanytomanyprimarykey.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PublisherRepository extends JpaRepository<Publisher,Integer> {
}
