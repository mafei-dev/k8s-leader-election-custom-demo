package com.example.k8sleaderelectioncustomdemo;

import io.kubernetes.client.openapi.ApiClient;
import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1Pod;
import io.kubernetes.client.openapi.models.V1PodList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@SpringBootApplication()
@RestController
@Import(Start.class)
public class K8sLeaderElectionCustomDemoApplication {


    public static void main(String[] args) throws IOException {
        SpringApplication.run(
                K8sLeaderElectionCustomDemoApplication.class,
                args);

    }

    @GetMapping
    public void test() {
        try {
            // Load the Kubernetes config from default location or from KUBECONFIG environment variable

            // Create an instance of the CoreV1Api
            CoreV1Api api = new CoreV1Api();

            // List all pods in the default namespace
            V1PodList podList = api.listNamespacedPod("default", null, null, null, null, null, null, null, null, null, null);

            // Iterate through the list of pods
            for (V1Pod pod : podList.getItems()) {
                System.out.println("Pod Name: " + pod.getMetadata().getName());
                System.out.println("Namespace: " + pod.getMetadata().getNamespace());
                System.out.println("Status: " + pod.getStatus().getPhase());
                System.out.println("--------------");
            }
        } catch (ApiException e) {
            System.err.println("Error interacting with Kubernetes API: " + e.getResponseBody());
        }
    }
}
