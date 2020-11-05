package com.coursecube.bookprice;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class StartMyBookPriceMS implements CommandLineRunner {
    static final Logger log = LoggerFactory.getLogger(StartMyBookPriceMS.class);

    public static void main(String[] args) {
        SpringApplication.run(StartMyBookPriceMS.class, args);
    }

    @Override
    public void run(String... args) {
        //Start-UP Tasks
        log.info(" MyBookPrice - Launched.... ");
    }

}
