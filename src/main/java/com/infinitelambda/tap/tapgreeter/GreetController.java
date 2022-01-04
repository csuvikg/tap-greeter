package com.infinitelambda.tap.tapgreeter;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetController {
    final GreetService service;

    public GreetController(GreetService service) {
        this.service = service;
    }

    @GetMapping("/greet/{name}")
    public ResponseEntity<String> greet(@PathVariable String name) {
        return ResponseEntity.ok(service.greet(name));
    }
}
