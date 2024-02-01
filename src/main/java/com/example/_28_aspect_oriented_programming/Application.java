package com.example._28_aspect_oriented_programming;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class)) {
            MyService myService = context.getBean(MyService.class);
            myService.getMessage();

        }catch (Exception e) {
            e.printStackTrace();
        }
    }
}