package ru.otpbank.camunda.learning.delegate;

import lombok.extern.slf4j.Slf4j;
import org.camunda.bpm.engine.delegate.DelegateExecution;
import org.camunda.bpm.engine.delegate.JavaDelegate;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class OfficeDeliveryPerformed implements JavaDelegate {
    @Override
    public void execute(DelegateExecution execution) throws Exception {
        log.info("Office deliver performed");
    }
}
