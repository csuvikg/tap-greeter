package com.infinitelambda.tap.tapgreeter;

import org.springframework.stereotype.Service;

@Service
public class GreetService {
    final
    CapitalizerCallerService capitalizer;

    public GreetService(CapitalizerCallerService capitalizer) {
        this.capitalizer = capitalizer;
    }

    public String greet(String name) {
        return "Hey " + capitalizer.getCapitalizedWord(name) + "!";
    }
}
