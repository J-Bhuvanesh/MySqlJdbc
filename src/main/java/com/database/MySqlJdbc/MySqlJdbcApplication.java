package com.database.MySqlJdbc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

public class MySqlJdbcApplication {
	public static void main(String[] args) {
		SpringApplication.run(MySqlJdbcApplication.class, args);
		System.out.println("Server started successfully in gradle......");
	}

}
