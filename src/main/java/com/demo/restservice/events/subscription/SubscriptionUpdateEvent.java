package com.demo.restservice.events.subscription;

import org.springframework.context.ApplicationEvent;

public class SubscriptionUpdateEvent extends ApplicationEvent {

    private String subscriptionId;

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public SubscriptionUpdateEvent(Object source, String subscriptionId) {
        super(source);
        this.subscriptionId = subscriptionId;
    }
}
