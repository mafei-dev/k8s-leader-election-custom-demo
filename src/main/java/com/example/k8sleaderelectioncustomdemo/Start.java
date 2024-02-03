package com.example.k8sleaderelectioncustomdemo;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class Start implements ApplicationListener<ApplicationStartedEvent> {

    private final StackSagaK8sLeaderElectionConfig config;

    public Start(StackSagaK8sLeaderElectionConfig config) {
        this.config = config;
    }


    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {

    }
}
