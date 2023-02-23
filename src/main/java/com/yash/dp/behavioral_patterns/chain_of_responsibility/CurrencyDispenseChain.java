package com.yash.dp.behavioral_patterns.chain_of_responsibility;

public interface CurrencyDispenseChain {

	void setNextChain(CurrencyDispenseChain nextChain);
	boolean dispense(Currency currency);
}
