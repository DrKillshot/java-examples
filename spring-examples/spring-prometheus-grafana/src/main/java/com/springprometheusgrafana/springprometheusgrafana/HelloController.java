package com.springprometheusgrafana.springprometheusgrafana;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/hello")
public class HelloController {

    @GetMapping
    public String getHello() throws InterruptedException {
        Thread.sleep(waitingTimeBetween(100, 1000));
        return "Hello from Spring Boot!";
    }

    @PostMapping
    public String postHello() throws InterruptedException {
        Thread.sleep(waitingTimeBetween(500, 1500));
        return "Hello from Spring Boot!";
    }

    @PutMapping
    public String putHello() throws InterruptedException {
        Thread.sleep(waitingTimeBetween(100, 200));
        return "Hello from Spring Boot!";
    }

    @DeleteMapping
    public String deleteHello() throws InterruptedException {
        Thread.sleep(waitingTimeBetween(1000, 2000));
        return "Hello from Spring Boot!";
    }

    private long waitingTimeBetween(int min, int max) {
        return (long) (min + Math.random() * (max - min));
    }
}
