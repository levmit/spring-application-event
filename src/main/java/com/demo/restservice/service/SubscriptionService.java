package com.demo.restservice.service;

import com.demo.restservice.events.subscription.SubscriptionCreateEvent;
import com.demo.restservice.events.subscription.SubscriptionUpdateEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Service;

@Service
public class SubscriptionService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher publisher;

    public void setApplicationEventPublisher(ApplicationEventPublisher publisher) {
        this.publisher = publisher;
    }

    public void createSubscription(String subscriptionId) {
        publisher.publishEvent(new SubscriptionCreateEvent(this, subscriptionId));
    }

    public void updateSubscription(String subscriptionId) {
        publisher.publishEvent(new SubscriptionUpdateEvent(this, subscriptionId));
    }
}
