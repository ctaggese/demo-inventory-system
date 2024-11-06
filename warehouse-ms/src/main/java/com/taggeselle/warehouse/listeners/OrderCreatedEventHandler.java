package com.taggeselle.warehouse.listeners;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaHandler;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;


@Component
@KafkaListener(topics = "order-created-events-topic")
public class OrderCreatedEventHandler {

    private final Logger LOGGER = LoggerFactory.getLogger(this.getClass());

    @KafkaHandler
    public void handle(OrderCreatedEvent orderCreatedEvent){
        System.out.println("Order created event received: " + orderCreatedEvent.getOrderId());
    }
}
