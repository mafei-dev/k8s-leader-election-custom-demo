package com.example.k8sleaderelectioncustomdemo;

import io.kubernetes.client.extended.leaderelection.LeaderElectionConfig;
import io.kubernetes.client.extended.leaderelection.LeaderElector;
import io.kubernetes.client.extended.leaderelection.resourcelock.EndpointsLock;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
public class Start implements ApplicationListener<ApplicationStartedEvent> {

    private final StackSagaK8sLeaderElectionConfig config;

    public Start(StackSagaK8sLeaderElectionConfig config) {
        this.config = config;
    }


    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        System.out.println("Start.init:6");
        System.out.println("config = " + config);
        String lockHolderIdentityName = UUID.randomUUID().toString(); // Anything unique
        EndpointsLock lock = new EndpointsLock(
                config.getAppNamespace(),
                config.getAppName(),
                lockHolderIdentityName
        );
        LeaderElectionConfig leaderElectionConfig =
                new LeaderElectionConfig(lock, config.getLeaseDuration(),
                        config.getRenewDeadline(),
                        config.getRetryPeriod()
                );

        try (final LeaderElector leaderElector = new LeaderElector(leaderElectionConfig)) {
            leaderElector.run(
                    () -> {
                        System.out.println("Do something when getting leadership.");
                    },
                    () -> {
                        System.out.println("Do something when losing leadership.");
                    });
        }
    }
}
