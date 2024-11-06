package com.taggeselle.warehouse.listeners;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class OrderCreatedEvent {

    private String orderId;
    private String productId;
    private Integer amount;

    public String getOrderId() {
        return orderId;
    }

    public String getProductId() {
        return productId;
    }

    public Integer getAmount() {
        return amount;
    }
}
