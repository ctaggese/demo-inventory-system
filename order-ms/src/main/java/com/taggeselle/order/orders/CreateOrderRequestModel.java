package com.taggeselle.order.orders;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CreateOrderRequestModel {

    private String productId;
    private Integer amount;

}
