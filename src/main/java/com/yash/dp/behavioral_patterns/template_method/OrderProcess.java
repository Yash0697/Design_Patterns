package com.yash.dp.behavioral_patterns.template_method;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public abstract class OrderProcess {

    private Address address;
    private Order order;
    
    public final void createAndProcessOrder(Order order, Address address) {
    	selectItems(order);
    	if(containsGift())
    		addGift();
    	selectDeliveryAddress(address);
    	pay();
    }
    public final void selectItems(Order order) {
        System.out.println("Selecting order items...");
        this.order = order;
        Double totalAmount = 0.0;
        for(OrderItem orderItem: order.getOrdersList()) {
        	totalAmount += orderItem.getUnitPrice() * orderItem.getQuantity();
        }
        this.order.setTotalPrice(totalAmount);
    }

    public void addGift() {} // this is hook

    public final void selectDeliveryAddress(Address address) {
    	System.out.println("Selecting addres for delivery...");
        this.address = address;
    }
    
    public boolean containsGift() {
    	return false;
    }
    
	public abstract void pay();



}
