package com.example._28_aspect_oriented_programming;// MyServiceImpl.java
import org.springframework.stereotype.Service;

@Service
public class MyServiceImpl implements MyService {
    @Override
    public String getMessage() {
        return "Hello, AOP!";
    }
}
