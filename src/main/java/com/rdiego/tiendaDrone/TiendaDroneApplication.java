package com.rdiego.tiendaDrone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TiendaDroneApplication {

	public static void main(String[] args) {
		SpringApplication.run(TiendaDroneApplication.class, args);
		System.out.println("\nBackend MongoDb, Security Spring y GraphQL listo...!!");
	}

}
