package com.taggeselle.order.orders;

import jakarta.persistence.*;
import jdk.jshell.Snippet;
import lombok.*;

@Entity
@Table(name = "T_ORDERS")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "PRODUCT_ID")
    private String  productId;

    @Column(name = "AMOUNT")
    private Integer amount;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ORDER_STATUS_ID",insertable = false, updatable = false)
    private OrderStatus status;

    @Column(name = "ORDER_STATUS_ID")
    private String orderStatusId;
}
