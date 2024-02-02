package com.example.k8sleaderelectioncustomdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import java.io.IOException;

@SpringBootApplication()
@Import(K8sConfig.class)
public class K8sLeaderElectionCustomDemoApplication {


    public static void main(String[] args) throws IOException {
        SpringApplication.run(
                K8sLeaderElectionCustomDemoApplication.class,
                args);

    }
}
