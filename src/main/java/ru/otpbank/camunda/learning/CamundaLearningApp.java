package ru.otpbank.camunda.learning;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CamundaLearningApp {

  public static void main(String... args) {

    System.out.println("CamundaLearningApp.main");

    SpringApplication.run(CamundaLearningApp.class, args);
  }

}