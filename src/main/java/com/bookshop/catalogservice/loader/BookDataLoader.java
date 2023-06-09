package com.bookshop.catalogservice.loader;

import com.bookshop.catalogservice.domain.Book;
import com.bookshop.catalogservice.persistence.BookRepository;

import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Profile;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
@Profile("testdata")
public class BookDataLoader {

	private final BookRepository bookRepository;

	public BookDataLoader(BookRepository bookRepository) {
		this.bookRepository = bookRepository;
	}

	@EventListener(ApplicationReadyEvent.class)
	public void loadBookTestData() {
		System.out.println("In the loader, pushing data to backend...");
		bookRepository.deleteAll();
		var book1 = Book.of("1234567891", "Northern Lights", "Lyra Silverstar", 9.90);
		var book2 = Book.of("1234567892", "BookShop Journey", "Iorek Polarson", 12.90);
		bookRepository.saveAll(List.of(book1, book2));

	}

}
