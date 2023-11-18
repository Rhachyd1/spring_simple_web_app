package com.rhd.spring6simplewebapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.rhd.spring6simplewebapp.domain.Author;

/* <TypeDomain, TypeId> */
public interface AuthorRepository extends CrudRepository<Author, Long> {
    Author findByFirstName(String name);
}
