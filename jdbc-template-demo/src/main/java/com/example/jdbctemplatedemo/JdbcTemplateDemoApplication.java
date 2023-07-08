package com.example.jdbctemplatedemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class JdbcTemplateDemoApplication {


    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(JdbcTemplateDemoApplication.class, args);

    }

}
