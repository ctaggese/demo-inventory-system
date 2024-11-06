package com.taggeselle.order.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import java.util.Optional;


@Service
public class OrderServiceImpl implements OrderService {


    private OrderRepository orderRepository;

    @Autowired
    KafkaTemplate<String, OrderCreatedEvent> kafkaTemplate;


    @Autowired
    public void OrderService(OrderRepository orderRepository) {
        this.orderRepository = orderRepository;
    }

    @Override
    public Long createOrder(CreateOrderRequestModel createOrderRequestModel) {

        Order order = Order.builder()
                .productId(createOrderRequestModel.getProductId())
                .amount(createOrderRequestModel.getAmount())
                .orderStatusId("1")
                .build();

        Order savedOrder = orderRepository.save(order);

        OrderCreatedEvent orderCreatedEvent = OrderCreatedEvent.builder()
                .orderId(String.valueOf(savedOrder.getId()))
                .amount(createOrderRequestModel.getAmount())
                .productId(createOrderRequestModel.getProductId())
                .build();

        this.kafkaTemplate.send("order-created-events-topic", "1", orderCreatedEvent);


        return order.getId();
    }

    @Override
    public Optional<Order> getOrderById(Long id) {
        return orderRepository.findById(id);
    }
}
