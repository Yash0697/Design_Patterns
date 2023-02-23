package com.yash.dp.behavioral_patterns.chain_of_responsibility;

public class Rupees100Dispenser implements CurrencyDispenseChain {

	private static final int HUNDRED = RUPEEDENOMINATIONS.RUPEES100.getValue();

	@Override
	public void setNextChain(CurrencyDispenseChain nextChain) {
	}

	@Override
	public boolean dispense(Currency currency) {
		boolean isDispensed = true;
		if (currency.getAmount() >= HUNDRED) {
			int numOfNotes = currency.getAmount() / HUNDRED;
			int remainingAmount = currency.getAmount() % HUNDRED;
			System.out.println("Dispensing " + numOfNotes + " notes of 100rs");
			if (remainingAmount > 0)
				return false;

		} else
			return false;
		return isDispensed;
	}

}
