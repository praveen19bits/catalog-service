package com.bookshop.catalogservice.persistence;

import java.util.Optional;

import com.bookshop.catalogservice.domain.Book;
import org.springframework.data.jdbc.repository.query.Modifying;
import org.springframework.data.jdbc.repository.query.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public interface BookRepository extends CrudRepository<Book,Long> {

	Optional<Book> findByIsbn(String isbn);
	boolean existsByIsbn(String isbn);
	@Modifying
	@Transactional
	@Query("delete from Book where isbn = :isbn")
	void deleteByIsbn(String isbn);

}
