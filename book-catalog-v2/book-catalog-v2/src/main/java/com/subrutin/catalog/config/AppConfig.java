package com.subrutin.catalog.config;

import java.util.HashMap;
import java.util.Map;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.subrutin.catalog.domain.Author;
import com.subrutin.catalog.domain.Book;
import com.subrutin.catalog.repository.BookRepository;
import com.subrutin.catalog.repository.impl.BookRepositoryImpl;

// @ComponentScan(basePackages = {"com.subrutin"})
@Configuration
public class AppConfig {

    @Bean
    public Author author(){
        return new Author(1L, "Agung Hermawan", null);
    }

    @Bean
    public Book book1(Author author) {
        Book book = new Book();
        book.setId(1L);
        book.setTitle("Test pertama");
        book.setDescription("Test ini yag pertama");
        book.setAuthor(author);
        return book;
    }

    @Bean
    public Book book2(Author author) {
        Book book = new Book();
        book.setId(2L);
        book.setTitle("Test Kedua");
        book.setDescription("Test ini yag kedua");
        book.setAuthor(author);
        return book;
    }

    @Bean
    public BookRepository bookRepository(Book book1, Book book2) {
        Map<Long, Book> bookMap = new HashMap<Long,Book>();
        bookMap.put(1L, book1);
        bookMap.put(2L, book2);

        BookRepositoryImpl bookRepository = new BookRepositoryImpl();
        bookRepository.setBookMap(bookMap);

        return bookRepository;
    }

}
