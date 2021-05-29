package com.example.jpausermanytomanyprimarykey.repository;

import com.example.jpausermanytomanyprimarykey.model.BookPublisher;
import org.hibernate.metamodel.model.convert.spi.JpaAttributeConverter;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookPublisherRepository extends JpaRepository<BookPublisher,Integer> {
}
