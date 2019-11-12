package cz.guru.spring.springwebproject.repository;

import cz.guru.spring.springwebproject.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookRepository extends CrudRepository<Book,Long> {
}