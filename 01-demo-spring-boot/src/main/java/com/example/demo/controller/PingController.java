package com.example.demo.controller;

import com.example.demo.model.Ping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PingController {
    @GetMapping("/ping")
    public Ping apiPing() {
        return new Ping();
    }
}
