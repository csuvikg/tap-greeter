package com.infinitelambda.tap.tapgreeter;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;

@ExtendWith(MockitoExtension.class)
public class GreetServiceUnitTests {
    @Mock
    private CapitalizerCallerService capitalizerCallerService;

    @InjectMocks
    GreetService service;

    @Test
    void greetingReturned() {
        // Given
        String name = "Test";

        // When
        Mockito.when(capitalizerCallerService.getCapitalizedWord(anyString())).thenReturn(name);
        String greeting = service.greet(name);

        // Then
        assertEquals("Hey Test!", greeting);
    }
}
