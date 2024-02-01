package com.example._28_aspect_oriented_programming;// AppConfig.java
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@ComponentScan(basePackages = "com.example._28_aspect_oriented_programming")
@EnableAspectJAutoProxy
public class AppConfig {
    // Spring konfigürasyonu
}
