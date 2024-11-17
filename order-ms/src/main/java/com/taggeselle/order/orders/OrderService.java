package com.taggeselle.order.orders;

import java.util.List;
import java.util.Optional;

public interface OrderService {
    Long createOrder(CreateOrderRequestModel createOrderRequestModel);
    Optional<Order> getOrderById(Long id);
    List<Order> getOrders();
}
