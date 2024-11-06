package com.taggeselle.order.orders;

import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
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
