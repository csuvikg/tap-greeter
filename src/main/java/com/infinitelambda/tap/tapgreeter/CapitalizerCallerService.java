package com.infinitelambda.tap.tapgreeter;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CapitalizerCallerService {
    private final RestTemplate rest;
    private static final String URL = "http://lab.iflambda.com:5000/capitalize/";

    public CapitalizerCallerService(RestTemplateBuilder restTemplateBuilder) {
        this.rest = restTemplateBuilder.build();
    }

    public String getCapitalizedWord(String word) {
        return rest.getForObject(URL + word, String.class);
    }
}
