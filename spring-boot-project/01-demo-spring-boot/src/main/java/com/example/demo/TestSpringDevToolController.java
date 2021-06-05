package com.example.demo;

import com.example.demo.model.Greeting;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestSpringDevToolController {
    @GetMapping("/test-dev-tool")
    public Greeting apiGetTest() {
        return new Greeting(123, "Hello WOrld 123 1221 asdfasdf3 asdf");
    }
}
