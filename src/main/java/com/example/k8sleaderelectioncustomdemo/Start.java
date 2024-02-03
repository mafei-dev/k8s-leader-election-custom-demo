package com.example.k8sleaderelectioncustomdemo;

import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.integration.leader.event.OnGrantedEvent;
import org.springframework.integration.leader.event.OnRevokedEvent;
import org.springframework.stereotype.Component;

@Component
public class Start implements ApplicationListener<ApplicationStartedEvent> {




    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {

    }

    @EventListener
    public void handleEvent(OnRevokedEvent event) {
        System.out.printf("'%s' leadership revoked%n", event.getRole());
    }

    @EventListener
    public void handleEvent(OnGrantedEvent event) {
        System.out.printf("'%s' leadership granted%n", event.getRole());
    }
}
