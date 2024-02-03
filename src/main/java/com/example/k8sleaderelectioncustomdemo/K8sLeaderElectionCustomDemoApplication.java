package com.example.k8sleaderelectioncustomdemo;

import com.example.k8sleaderelectioncustomdemo.lader.Fabric8LeaderAutoConfiguration;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@SpringBootApplication()
@RestController
@Import({Start.class, Fabric8LeaderAutoConfiguration.class})
public class K8sLeaderElectionCustomDemoApplication {


    public static void main(String[] args) throws IOException {
        SpringApplication.run(
                K8sLeaderElectionCustomDemoApplication.class,
                args);

    }

    @GetMapping
    public void test() {

    }
}
