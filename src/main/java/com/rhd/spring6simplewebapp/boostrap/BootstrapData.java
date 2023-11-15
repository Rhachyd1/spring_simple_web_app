package com.rhd.spring6simplewebapp.boostrap;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rhd.spring6simplewebapp.domain.Author;
import com.rhd.spring6simplewebapp.domain.Book;
import com.rhd.spring6simplewebapp.domain.Publisher;
import com.rhd.spring6simplewebapp.repository.AuthorRepository;
import com.rhd.spring6simplewebapp.repository.BookRepository;
import com.rhd.spring6simplewebapp.repository.PublisherRepository;

@Component
public class BootstrapData implements CommandLineRunner{

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;
    private final PublisherRepository publisherRepository;

    @Autowired
    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }


    @Override
    public void run(String... args) throws Exception {
       Author eric = new Author();
       eric.setFirstName("Eric");
       eric.setLastName("Evans");

       Book newBook = new Book();
       newBook.setTitle("Domain Driven Design");
       newBook.setIsbn(String.valueOf(new Random().nextInt() ) );

       Author ericSaved = authorRepository.save(eric);
       Book newBookSaved = bookRepository.save(newBook);

       Author john = new Author();
       john.setFirstName("John");
       john.setLastName("Evans");

       Book newBook2 = new Book();
       newBook2.setTitle("Domain Driven Design");
       newBook2.setIsbn(String.valueOf(new Random().nextInt() ) ); 
       
       Author johnSaved = authorRepository.save(john);
       Book book2Saved = bookRepository.save(newBook2);


       ericSaved.getBooks().add(newBookSaved);
       johnSaved.getBooks().add(book2Saved);

       newBookSaved.getAuthors().add(eric);
       book2Saved.getAuthors().add(john);

       authorRepository.save(ericSaved);
       authorRepository.save(johnSaved);
       bookRepository.save(book2Saved);
       bookRepository.save(newBookSaved);

       Publisher publisher1 = new Publisher();
       publisher1.setAddress("An Address");
       publisher1.setCity("in a City");
       publisher1.setState("in a State");
       publisher1.setPublisherName("TestPublisher");
       publisher1.setZip("00000-000");

       

       Publisher savedPublisher = publisherRepository.save(publisher1);
       savedPublisher.getPublishedBooks().add(book2Saved);
       savedPublisher.getPublishedBooks().add(newBookSaved);


       System.out.println("Bootstrap!");
       System.out.println("Author: "+authorRepository.count());
       System.out.println("Book: "+bookRepository.count());
       System.out.println("Publishers: "+publisherRepository.count());
    }
    
}