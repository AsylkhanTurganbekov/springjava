package com.framework.springjava.repositories;

import com.framework.springjava.domain.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book, Long> {
}