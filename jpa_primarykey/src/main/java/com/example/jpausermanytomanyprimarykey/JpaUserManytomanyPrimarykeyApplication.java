package com.example.jpausermanytomanyprimarykey;

import com.example.jpausermanytomanyprimarykey.model.Book;
import com.example.jpausermanytomanyprimarykey.model.BookPublisher;
import com.example.jpausermanytomanyprimarykey.model.Publisher;
import com.example.jpausermanytomanyprimarykey.repository.BookPublisherRepository;
import com.example.jpausermanytomanyprimarykey.repository.BookRepository;
import com.example.jpausermanytomanyprimarykey.repository.PublisherRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;
import java.util.Date;

@SpringBootApplication
public class JpaUserManytomanyPrimarykeyApplication implements CommandLineRunner {
    @Autowired
    BookRepository bookRepository;
    @Autowired
    PublisherRepository publisherRepository;
    @Autowired
    BookPublisherRepository bookPublisherRepository;

    public static void main(String[] args) {
        SpringApplication.run(JpaUserManytomanyPrimarykeyApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        Book book1 = new Book("Springboot");
        Book book2 = new Book("JavaCore");
        bookRepository.saveAll(Arrays.asList(book1, book2));
        Publisher publisher1 = new Publisher("fpraptech");
        Publisher publisher2 = new Publisher("NXB-TG");
        publisherRepository.saveAll(Arrays.asList(publisher1, publisher2));
        BookPublisher bookPublisher1 = new BookPublisher(book1, publisher1, new Date());
        BookPublisher bookPublisher2 = new BookPublisher(book1, publisher2, new Date());
        bookPublisherRepository.saveAll(Arrays.asList(bookPublisher1, bookPublisher2));


    }
}
