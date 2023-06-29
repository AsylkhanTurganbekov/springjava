package com.framework.springjava.repositories;

import com.framework.springjava.domain.Author;
import org.springframework.data.repository.CrudRepository;

public interface AuthorRepository extends CrudRepository<Author,Long> {

}
