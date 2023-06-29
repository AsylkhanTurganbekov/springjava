package com.framework.springjava.repositories;

import com.framework.springjava.domain.Publisher;
import org.springframework.data.repository.CrudRepository;

public interface PublisherRepository  extends CrudRepository<Publisher, Long> {

}
