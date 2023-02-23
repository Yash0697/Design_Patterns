package com.yash.dp.behavioral_patterns.chain_of_responsibility;

public enum RUPEEDENOMINATIONS {

	RUPEES500(500),
	RUPEES200(200),
	RUPEES100(100);
//	RUPEES50(50),
//	RUPEES20(20),
//	RUPEES10(10);

	private final int value;
	RUPEEDENOMINATIONS(final int value) {
		this.value = value;
	}
	
	public int getValue() { return value; }
}
