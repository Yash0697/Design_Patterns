package com.yash.dp.behavioral_patterns.chain_of_responsibility;

public class ATM {
	
	private CurrencyDispenseChain currencyDispenseChain;
	
	public ATM() {
		this.currencyDispenseChain = new Rupees500Dispenser();
		CurrencyDispenseChain hundredRuppesDispenser = new Rupees100Dispenser();
		CurrencyDispenseChain twoHundredRuppesDispenser = new Rupees200Dispenser();
		this.currencyDispenseChain.setNextChain(twoHundredRuppesDispenser);
		twoHundredRuppesDispenser.setNextChain(hundredRuppesDispenser);
	}

	public static void main(String[] args) {
		ATM atm = new ATM();
		Currency currency = new Currency(1301);
		boolean isDispensed = atm.currencyDispenseChain.dispense(currency);
		if(!isDispensed) System.out.println("Currency could not be dispensed");
	}

}
