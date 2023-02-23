package com.yash.dp.behavioral_patterns.template_method;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CashOnDeliveryWithGiftOrderProcess extends OrderProcess {

	
	

	@Override
	public void addGift() {
		System.out.println("adding gift to your COD order");
		this.getOrder().setTotalPrice(this.getOrder().getTotalPrice() + 150);
	}

	@Override
	public void pay() {
		Double totalPrice = this.getOrder().getTotalPrice();
		System.out.println("Pay "+ totalPrice + " to our delivery partner when you receive your order.");
		
	}
	
	@Override
	public boolean containsGift() {
    	String answer = takeUserInput();
    	if(answer.toLowerCase().equals("y")) {
    		return true;
    	}
    	return false;
    }
    
	private String takeUserInput() {
		String answer = null;
		System.out.println("Do you want to add a gift voucher of 150 rs? yes[Y] or no[N] ");
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		try {
			answer = br.readLine();
		} catch(IOException e) {
			System.out.println("Error while reading your answer. Try again");
		}
		return answer;
	}
}
