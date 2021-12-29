package com.demo.restservice.events.subscription;

import org.springframework.context.ApplicationEvent;

public class SubscriptionCreateEvent extends ApplicationEvent {

    private String subscriptionId;

    public String getSubscriptionId() {
        return subscriptionId;
    }

    public SubscriptionCreateEvent(Object source, String subscriptionId) {
        super(source);
        this.subscriptionId = subscriptionId;
    }
}