package com.example.k8sleaderelectioncustomdemo;

import io.kubernetes.client.extended.leaderelection.LeaderElectionConfig;
import io.kubernetes.client.extended.leaderelection.LeaderElector;
import io.kubernetes.client.extended.leaderelection.resourcelock.EndpointsLock;
import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.Configuration;
import io.kubernetes.client.util.Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import java.io.IOException;
import java.time.Duration;

@SpringBootApplication()
@Import(K8sConfig.class)
public class K8sLeaderElectionCustomDemoApplication {


    public static void main(String[] args) throws IOException {
        SpringApplication.run(
                K8sLeaderElectionCustomDemoApplication.class,
                args);

    }
}
