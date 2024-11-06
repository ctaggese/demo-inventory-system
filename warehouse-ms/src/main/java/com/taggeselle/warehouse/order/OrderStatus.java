package com.taggeselle.warehouse.order;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Table(name = "T_ORDER_STATUS")
@Entity
@Getter
@Setter
public class OrderStatus {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "STATUS")
    private String status;
}
