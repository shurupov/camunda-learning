package ru.otpbank.camunda.learning.config;

import org.camunda.bpm.spring.boot.starter.rest.CamundaJerseyResourceConfig;
import org.springframework.stereotype.Component;

/*
* https://stackoverflow.com/questions/35184310/spring-boot-jersey-setup-cors
* */
@Component
public class JerseyConfig extends CamundaJerseyResourceConfig {

    public JerseyConfig() {
        register(CORSResponseFilter.class);
    }
}
