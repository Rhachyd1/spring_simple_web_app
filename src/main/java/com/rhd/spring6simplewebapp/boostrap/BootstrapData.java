package com.rhd.spring6simplewebapp.boostrap;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.rhd.spring6simplewebapp.domain.Author;
import com.rhd.spring6simplewebapp.domain.Book;
import com.rhd.spring6simplewebapp.repository.AuthorRepository;
import com.rhd.spring6simplewebapp.repository.BookRepository;

@Component
public class BootstrapData implements CommandLineRunner{

    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    @Autowired
    public BootstrapData(AuthorRepository authorRepository, BookRepository bookRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
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
       eric.setFirstName("John");
       eric.setLastName("Evans");

       Book newBook2 = new Book();
       newBook2.setTitle("Domain Driven Design");
       newBook2.setIsbn(String.valueOf(new Random().nextInt() ) ); 
       
       Author johnSaved = authorRepository.save(john);
       Book book2Saved = bookRepository.save(newBook2);


       ericSaved.getBooks().add(newBookSaved);
       johnSaved.getBooks().add(book2Saved);

       System.out.println("Bootstrap!");
       System.out.println("Author: "+authorRepository.count());
       System.out.println("Book: "+bookRepository.count());
    }
    
}