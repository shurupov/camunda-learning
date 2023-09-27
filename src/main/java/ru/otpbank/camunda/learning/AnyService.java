package ru.otpbank.camunda.learning;

import org.springframework.stereotype.Service;

import java.util.Random;

@Service
public class AnyService {

    private final static Random RANDOM = new Random();

    public String getSomething() {
        return "something";
    }

    public Integer calcSomething() {
        return RANDOM.nextInt();
    }

    public String append(String stringValue, Integer intValue) {
        return stringValue + " " + intValue;
    }
}
