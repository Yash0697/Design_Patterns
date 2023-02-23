package com.yash.dp.behavioral_patterns.template_method;

public class CardPaymentOrderProcess extends OrderProcess {


	@Override
	public void pay() {
		Double totalPrice = this.getOrder().getTotalPrice();
		System.out.println("Please enter your card details for the payment of rs "+ totalPrice);

	}

}
