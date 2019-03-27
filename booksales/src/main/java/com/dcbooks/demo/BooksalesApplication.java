package com.dcbooks.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class BooksalesApplication {

    public static void main(String[] args) {
        SpringApplication.run(BooksalesApplication.class, args);
        System.out.println("Your Application run successfully!");
    }

}
