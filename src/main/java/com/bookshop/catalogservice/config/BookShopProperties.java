package com.bookshop.catalogservice.config;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "bookshop")
@Setter
@Getter
public class BookShopProperties {

	/**
	 * A message to welcome users.
	 */
	private String greeting;

}
