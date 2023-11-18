package com.rhd.spring6simplewebapp.services;

import com.rhd.spring6simplewebapp.domain.Book;

public interface BookService {
    Iterable<Book> findAll();
}
