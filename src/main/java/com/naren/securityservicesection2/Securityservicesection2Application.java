package com.naren.securityservicesection2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScans({ @ComponentScan("com.naren.controller"), @ComponentScan("com.naren.config") })
public class Securityservicesection2Application {

    public static void main(String[] args) {
        SpringApplication.run(Securityservicesection2Application.class, args);
    }

}
