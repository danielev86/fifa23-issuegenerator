package com.danielev86.fifa23issuefront;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@ComponentScan({"com.danielev86"})
@SpringBootApplication
public class Fifa23IssuefrontApplication {

    public static void main(String[] args) {
        SpringApplication.run(Fifa23IssuefrontApplication.class, args);
    }

}
