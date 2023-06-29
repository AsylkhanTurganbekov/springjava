package com.framework.springjava.boostrap;

import com.framework.springjava.domain.Author;
import com.framework.springjava.domain.Book;
import com.framework.springjava.domain.Publisher;
import com.framework.springjava.repositories.AuthorRepository;
import com.framework.springjava.repositories.BookRepository;
import com.framework.springjava.repositories.PublisherRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;


@Component
public class BootStrapData implements CommandLineRunner {
    private final AuthorRepository authorRepository;
    private final BookRepository bookRepository;

    private final PublisherRepository publisherRepository;

    public BootStrapData(AuthorRepository authorRepository, BookRepository bookRepository, PublisherRepository publisherRepository) {
        this.authorRepository = authorRepository;
        this.bookRepository = bookRepository;
        this.publisherRepository = publisherRepository;
    }

    @Override
    public void run(String... args)  {

        Publisher publisher = new Publisher();
        publisher.setName("Asike");
        publisher.setCity("Astana");
        publisher.setState("LA");

        publisherRepository.save(publisher);

        System.out.println("Publisher Count: " + publisherRepository.count() );

        Author author1 = new Author("Eric","Smt");
        Book  book = new Book("DMT","12312312");
        author1.getBooks().add(book);
        book.getAuthors().add(author1);

        book.setPublisher(publisher);
        publisher.getBooks().add(book);

        publisherRepository.save(publisher);
        authorRepository.save(author1);
        bookRepository.save(book);

        Author author2 = new Author("Eric","Smt");
        Book  book2 = new Book("DMT","12312312");
        author2.getBooks().add(book2);
        book2.getAuthors().add(author2);

        book2.setPublisher(publisher);
        publisher.getBooks().add(book2);

        authorRepository.save(author2);
        bookRepository.save(book2);
        publisherRepository.save(publisher);


        System.out.println("Started from boosTrap");
        System.out.println("number of books: " + bookRepository.count());
        System.out.println("Publisher number of books : " + publisher.getBooks().size());
    }
}
