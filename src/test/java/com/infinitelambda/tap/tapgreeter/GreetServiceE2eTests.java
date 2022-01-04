package com.infinitelambda.tap.tapgreeter;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
public class GreetServiceE2eTests {

    @Autowired
    GreetService service;

    @Test
    void greetingReturnedWithCapitalization() {
        // Given
        String name = "test";

        // When
        String greeting = service.greet(name);

        // Then
        assertEquals("Hey Test!", greeting);
    }
}
