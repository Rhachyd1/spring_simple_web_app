package com.rhd.spring6simplewebapp.services;

import org.springframework.stereotype.Service;

import com.rhd.spring6simplewebapp.domain.Author;
import com.rhd.spring6simplewebapp.repository.AuthorRepository;

@Service
public class AuthorServiceimpl implements AuthorService {


    final AuthorRepository authorRepository;

    public AuthorServiceimpl(AuthorRepository authorRepository){
        this.authorRepository = authorRepository;
    }

    @Override
    public Iterable<Author> findAll() {
        return authorRepository.findAll();
    }
    
}
