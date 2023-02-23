package com.yash.dp.behavioral_patterns.template_method;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class OrderItem {
	private String name;
    private String itemId;
    private Integer quantity;
    private Double unitPrice;
    private String category;
    private String description;
}
