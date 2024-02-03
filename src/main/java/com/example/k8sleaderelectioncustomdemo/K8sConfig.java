package com.example.k8sleaderelectioncustomdemo;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.util.Config;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class K8sConfig {
    @Bean
    @ConditionalOnMissingBean
    public ApiClient kubernetesApiClient() throws Exception {
        System.out.println("K8sConfig.kubernetesApiClient:6");
        ApiClient apiClient = Config.defaultClient();
        io.kubernetes.client.openapi.Configuration.setDefaultApiClient(apiClient);
        return apiClient;
    }

/*    @Bean
    @ConditionalOnMissingBean
    public KubernetesClient kubernetesClient() throws Exception {
        System.out.println("K8sConfig.kubernetesClient");
        KubernetesClientBuilder kubernetesClientBuilder = new KubernetesClientBuilder();
        return kubernetesClientBuilder.build();
    }*/


}
