package ru.otpbank.camunda.learning.config;

import org.camunda.bpm.spring.boot.starter.rest.CamundaJerseyResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends CamundaJerseyResourceConfig {

    public JerseyConfig() {
        register(CORSResponseFilter.class);
    }
}
