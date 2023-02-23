package com.yash.dp.behavioral_patterns.template_method;

import java.util.ArrayList;
import java.util.List;

public class TemplateMethodTest {

	public static void main(String[] args) {
		List<OrderItem> orders = new ArrayList<>();
		orders.add(OrderItem.builder()
			.category("Electronics")
			.description("Mobile Phone with Camera")
			.itemId("7e7df8")
			.name("Mobile")
			.unitPrice(12321.0)
			.quantity(2)
			.build());
	   Order order = Order.builder()
			   .ordersList(orders)
			   .build();
	   Address address = Address.builder()
			   .city("Delhi")
			   .street("street")
			   .pinCode(120112)
			   .build();
	   CashOnDeliveryWithGiftOrderProcess cashOnDeliveryWithGiftOrderProcess = new CashOnDeliveryWithGiftOrderProcess();
	   System.out.println("processing cash on delivery order");
	   cashOnDeliveryWithGiftOrderProcess.createAndProcessOrder(order, address);
	   System.out.println("processing order with card payment ");
	   CardPaymentOrderProcess cardPaymentOrderProcess = new CardPaymentOrderProcess();
	   cardPaymentOrderProcess.createAndProcessOrder(order, address);
	   
	}

}
