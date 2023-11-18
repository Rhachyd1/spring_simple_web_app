package com.rhd.spring6simplewebapp.services;

import com.rhd.spring6simplewebapp.domain.Author;

public interface AuthorService{

    Iterable<Author> findAll();
    
}
