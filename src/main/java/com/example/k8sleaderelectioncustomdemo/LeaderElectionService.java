/*
package com.example.k8sleaderelectioncustomdemo;

import io.kubernetes.client.openapi.ApiException;
import io.kubernetes.client.openapi.apis.CoreV1Api;
import io.kubernetes.client.openapi.models.V1ConfigMap;
import io.kubernetes.client.openapi.models.V1ObjectMeta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class LeaderElectionService {

    private static final String LEADER_CONFIG_MAP_NAME = "leader-election-configmap";
    private static final String LEADER_KEY = "leader";

    @Autowired
    @Qualifier("ApiClientStackSaga")
    private CoreV1Api api;

    public boolean isLeader() {
        try {
            api.createNamespacedConfigMap("default", createConfigMap(), null, null, null);
            return true;
        } catch (ApiException e) {
            if (e.getCode() == 409) { // Conflict - another instance is the leader
                return false;
            } else {
                throw new RuntimeException("Error during leader election", e);
            }
        }
    }

    public void releaseLeadership() {
        try {
            api.deleteNamespacedConfigMap(LEADER_CONFIG_MAP_NAME, "default", null, null, null, null, null, null);
        } catch (ApiException e) {
            throw new RuntimeException("Error releasing leadership", e);
        }
    }

    private V1ConfigMap createConfigMap() {
        V1ConfigMap configMap = new V1ConfigMap();
        configMap.setApiVersion("v1");
        configMap.setKind("ConfigMap");
//        configMap.setMetadata(new V1ConfigMap().metadata(new V1ObjectMeta().name(LEADER_CONFIG_MAP_NAME)));
        configMap.data(Map.of(LEADER_KEY, "leader"));
        return configMap;
    }
}
*/
