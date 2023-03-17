package org.chris.example.quickdemo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
@SpringBootApplication
public class QuickDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(QuickDemoApplication.class, args);
    }

    @Bean
    CommandLineRunner runner() {

        return args -> {

            log.info("started");

            CH a = new CH();

            a.setId("1");
            a.setName("n");

            CH b = new CH();

            b.setId("2");
            b.setName("n");

            System.err.println(a.equals(b));

        };
    }

}
