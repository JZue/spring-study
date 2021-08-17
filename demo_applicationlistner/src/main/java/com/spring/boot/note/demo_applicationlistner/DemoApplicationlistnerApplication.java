package com.spring.boot.note.demo_applicationlistner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoApplicationlistnerApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(DemoApplicationlistnerApplication.class, args);
        run.publishEvent(new MyApplicationEvent("MyApplicationEvent"));
        run.publishEvent("payload event");

    }

}
