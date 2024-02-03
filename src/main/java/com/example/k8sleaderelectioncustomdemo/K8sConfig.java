package com.example.k8sleaderelectioncustomdemo;

import io.fabric8.kubernetes.client.KubernetesClient;
import io.fabric8.kubernetes.client.KubernetesClientBuilder;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class K8sConfig {

    @Bean
    @ConditionalOnMissingBean
    public KubernetesClient kubernetesClient() throws Exception {
        System.out.println("K8sConfig.kubernetesClient:70");
        KubernetesClientBuilder kubernetesClientBuilder = new KubernetesClientBuilder();
        return kubernetesClientBuilder.build();
    }


}
