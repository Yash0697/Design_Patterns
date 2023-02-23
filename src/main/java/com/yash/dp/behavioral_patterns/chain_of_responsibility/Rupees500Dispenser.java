package com.yash.dp.behavioral_patterns.chain_of_responsibility;

public class Rupees500Dispenser implements CurrencyDispenseChain {

	private static final int FIVE_HUNDRED = RUPEEDENOMINATIONS.RUPEES500.getValue();

	private CurrencyDispenseChain nextChain;

	@Override
	public void setNextChain(CurrencyDispenseChain nextChain) {
		this.nextChain = nextChain;
	}

	@Override
	public boolean dispense(Currency currency) {
		boolean isDispensed = true;
		if (currency.getAmount() >= FIVE_HUNDRED) {
			int numOfNotes = currency.getAmount() / FIVE_HUNDRED;
			int remainingAmount = currency.getAmount() % FIVE_HUNDRED;
			System.out.println("Dispensing " + numOfNotes + " notes of 500rs");
			if (remainingAmount > 0)
				isDispensed = this.nextChain.dispense(new Currency(remainingAmount));

		} else {
			isDispensed = this.nextChain.dispense(currency);
		}
		return isDispensed;
	}

}
