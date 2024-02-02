package com.example.k8sleaderelectioncustomdemo;

import io.kubernetes.client.extended.leaderelection.LeaderElectionConfig;
import io.kubernetes.client.extended.leaderelection.LeaderElector;
import io.kubernetes.client.extended.leaderelection.resourcelock.EndpointsLock;
import org.springframework.boot.context.event.ApplicationStartedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

import java.time.Duration;
import java.util.UUID;

@Component
public class Start implements ApplicationListener<ApplicationStartedEvent> {



    @Override
    public void onApplicationEvent(ApplicationStartedEvent event) {
        /*System.out.println("Start.init");
        String appNamespace = "default";
        String appName = "k8s-leader-election-custom-demo";
        String lockHolderIdentityName = UUID.randomUUID().toString(); // Anything unique
        EndpointsLock lock = new EndpointsLock(appNamespace, appName, lockHolderIdentityName);
        LeaderElectionConfig leaderElectionConfig =
                new LeaderElectionConfig(lock, Duration.ofMillis(15000),
                        Duration.ofMillis(10000),
                        Duration.ofMillis(5000)
                );

        try (LeaderElector leaderElector = new LeaderElector(leaderElectionConfig)) {
            leaderElector.run(
                    () -> {
                        System.out.println("Do something when getting leadership.");
                    },
                    () -> {
                        System.out.println("Do something when losing leadership.");
                    });
        }*/
    }
}
