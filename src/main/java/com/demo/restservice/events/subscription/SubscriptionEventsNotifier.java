package com.demo.restservice.events.subscription;


import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class SubscriptionEventsNotifier {

    @EventListener
    public void processSubscriptionCreateEvent(SubscriptionCreateEvent event) {
        System.out.println("SubscriptionCreateEvent: " + event.getSubscriptionId());
    }

    @EventListener
    public void processSubscriptionUpdateEvent(SubscriptionUpdateEvent event) {
        System.out.println("SubscriptionUpdateEvent: " + event.getSubscriptionId());
    }
}
