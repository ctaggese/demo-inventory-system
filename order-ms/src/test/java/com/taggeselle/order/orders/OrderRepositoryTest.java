package com.taggeselle.order.orders;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

@DataJpaTest
public class OrderRepositoryTest {

    @Autowired
    private OrderRepository orderRepository;

    @Test
    public void testSaveOrder() {
        Order order = Order.builder()
                .orderStatusId("1")
                .productId("1")
                .amount(20)
                .build();
        Order newOrder = orderRepository.save(order);
        Order order1 = orderRepository.findById(newOrder.getId()).get();
        assertNotNull(order1);
        assertEquals("1", order1.getOrderStatusId());
        assertEquals(20, order1.getAmount());
    }
}
