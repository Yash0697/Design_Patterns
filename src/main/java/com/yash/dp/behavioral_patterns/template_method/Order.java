package com.yash.dp.behavioral_patterns.template_method;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@Builder
public class Order {

    private List<OrderItem> ordersList;
    private Double totalPrice;
}
