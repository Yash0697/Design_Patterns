package com.yash.dp.behavioral_patterns.rule_engine;

public interface ParcelCostRule<P, C> {
	
	C process(P parcel);
	boolean matches(P parcel);
}
