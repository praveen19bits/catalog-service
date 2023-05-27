package com.bookshop.catalogservice;

import com.bookshop.catalogservice.config.BookShopProperties;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class HomeController {

	private final BookShopProperties bookShopProperties;

	@GetMapping("/")
	public String getGreeting() {
		return bookShopProperties.getGreeting();
	}

}
