package com.rhd.spring6simplewebapp.services;

import org.springframework.stereotype.Service;

import com.rhd.spring6simplewebapp.domain.Book;
import com.rhd.spring6simplewebapp.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService{

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    @Override
    public Iterable<Book> findAll() {
        return bookRepository.findAll();
    }
    
}
