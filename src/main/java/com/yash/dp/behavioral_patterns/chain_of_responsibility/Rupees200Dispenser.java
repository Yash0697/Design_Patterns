package com.yash.dp.behavioral_patterns.chain_of_responsibility;

public class Rupees200Dispenser implements CurrencyDispenseChain {

private static final int TWO_HUNDRED = RUPEEDENOMINATIONS.RUPEES200.getValue();
	
	private CurrencyDispenseChain nextChain;
	@Override
	public void setNextChain(CurrencyDispenseChain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public boolean dispense(Currency currency) {
		boolean isDispensed = true;
		if(currency.getAmount() >= TWO_HUNDRED) {
			int numOfNotes = currency.getAmount() / TWO_HUNDRED;
			int remainingAmount = currency.getAmount() % TWO_HUNDRED;
			System.out.println("Dispensing "+numOfNotes+" notes of 200rs");
			if(remainingAmount > 0) 
				isDispensed = this.nextChain.dispense(new Currency(remainingAmount));
				
		}
		else 
			isDispensed = this.nextChain.dispense(currency);
		return isDispensed;
	}

}
