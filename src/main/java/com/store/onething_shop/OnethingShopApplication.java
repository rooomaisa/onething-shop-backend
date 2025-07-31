package com.store.onething_shop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.store.onething_shop.model.Product;
import com.store.onething_shop.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class OnethingShopApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnethingShopApplication.class, args);
	}

	@Bean
	CommandLineRunner seed(ProductRepository repo) {
		return args -> {
			if (repo.count() == 0) {
				repo.save(new Product(
						"Minimal Line Art Poster A3",
						"Black & white line art, digital print.",
						1999 // €19.99 in cents
				));
			}
		};
	}

}
