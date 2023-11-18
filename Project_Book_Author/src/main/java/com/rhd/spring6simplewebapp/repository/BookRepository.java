package com.rhd.spring6simplewebapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.rhd.spring6simplewebapp.domain.Book;

/* <TypeDomain, TypeId> */
public interface BookRepository extends CrudRepository<Book, Long>{
    Book findByTitle(String title);
}
