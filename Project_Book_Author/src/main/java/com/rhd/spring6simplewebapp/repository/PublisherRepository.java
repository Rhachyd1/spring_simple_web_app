package com.rhd.spring6simplewebapp.repository;

import org.springframework.data.repository.CrudRepository;

import com.rhd.spring6simplewebapp.domain.Publisher;

public interface PublisherRepository extends CrudRepository<Publisher, Long> {
    
}
