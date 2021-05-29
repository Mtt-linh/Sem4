package com.example.jpamanytomanypkextra;

import com.example.jpamanytomanypkextra.model.Book;
import com.example.jpamanytomanypkextra.model.BookPublisher;
import com.example.jpamanytomanypkextra.model.Publisher;
import com.example.jpamanytomanypkextra.repository.BookPublisherRepository;
import com.example.jpamanytomanypkextra.repository.BookRepository;
import com.example.jpamanytomanypkextra.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class JpaManytomanyPkExtraApplication implements CommandLineRunner {

    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private PublisherRepository publisherRepository;
    @Autowired
    private BookPublisherRepository bookPublisherRepository;
    public static void main(String[] args) {
        SpringApplication.run(JpaManytomanyPkExtraApplication.class, args);
    }

    @Override
    @Transactional
    public  void  run(String...args) throws  Exception{
        Book b1 = new Book("javaSprongboot");
        Book b2 = new Book("Rest with Spring Boot");
        bookRepository.saveAll(Arrays.asList(b1,b2));

        Publisher p1 = new Publisher("NXB the gioi");
        Publisher p2 = new Publisher("NXB Aptech ");
        publisherRepository.saveAll(Arrays.asList(p1,p1));

        BookPublisher bp1 = new BookPublisher(b1,p1,new Date());
        BookPublisher bp2 = new BookPublisher(b2,p2,new Date());
        bookPublisherRepository.saveAll(Arrays.asList(bp1,bp2));
    }
}
