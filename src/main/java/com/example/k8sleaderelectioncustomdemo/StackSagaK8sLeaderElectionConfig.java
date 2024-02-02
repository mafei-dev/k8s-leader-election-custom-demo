package com.example.k8sleaderelectioncustomdemo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.time.Duration;
import java.util.StringJoiner;

@Configuration
@ConfigurationProperties(prefix = "stacksaga.k8s.leader-election")
public class StackSagaK8sLeaderElectionConfig {

    /**
     * appNamespace
     */
    private String appNamespace="default";
    /**
     * appName
     */
    private String appName;
    /**
     * leaseDuration
     */
    private Duration leaseDuration;
    /**
     * renewDeadline
     */
    private Duration renewDeadline;
    /**
     * retryPeriod
     */
    private Duration retryPeriod;

    public StackSagaK8sLeaderElectionConfig() {
    }

    public String getAppNamespace() {
        return appNamespace;
    }

    public void setAppNamespace(String appNamespace) {
        this.appNamespace = appNamespace;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public Duration getLeaseDuration() {
        return leaseDuration;
    }

    public void setLeaseDuration(Duration leaseDuration) {
        this.leaseDuration = leaseDuration;
    }

    public Duration getRenewDeadline() {
        return renewDeadline;
    }

    public void setRenewDeadline(Duration renewDeadline) {
        this.renewDeadline = renewDeadline;
    }

    public Duration getRetryPeriod() {
        return retryPeriod;
    }

    public void setRetryPeriod(Duration retryPeriod) {
        this.retryPeriod = retryPeriod;
    }

    @Override
    public String toString() {
        return new StringJoiner(", ", StackSagaK8sLeaderElectionConfig.class.getSimpleName() + "[", "]")
                .add("appNamespace='" + appNamespace + "'")
                .add("appName='" + appName + "'")
                .add("leaseDuration=" + leaseDuration)
                .add("renewDeadline=" + renewDeadline)
                .add("retryPeriod=" + retryPeriod)
                .toString();
    }
}
