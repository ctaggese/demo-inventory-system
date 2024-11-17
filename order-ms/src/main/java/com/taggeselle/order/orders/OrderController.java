package com.taggeselle.order.orders;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import java.net.URI;
import java.util.List;

@RestController
@RequestMapping( path = "api/orders", produces = "application/json")
public class OrderController {

    @Autowired
    private OrderService orderService;

    @GetMapping()
    public List<Order> getAllOrders() {
        return this.orderService.getOrders();
    }


    @GetMapping("/{id}")
    public ResponseEntity<Order> getOrder(@PathVariable Long id) {
        var order = this.orderService.getOrderById(id);
        if(order.isPresent()){
            return ResponseEntity.ok(order.get());
        }
        return ResponseEntity.notFound().build();
    }

    @PostMapping
    public ResponseEntity<Void> createOrder(@RequestBody  CreateOrderRequestModel createOrderRequestModel) {

        Long orderId = this.orderService.createOrder(createOrderRequestModel);

        URI location = ServletUriComponentsBuilder
                .fromCurrentRequestUri()
                .path("/{id}")
                .buildAndExpand(orderId)
                .toUri();

        return ResponseEntity.created(location).build();

    }
}
