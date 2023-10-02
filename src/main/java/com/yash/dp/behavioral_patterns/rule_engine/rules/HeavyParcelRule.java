package com.yash.dp.behavioral_patterns.rule_engine.rules;
import static com.yash.dp.behavioral_patterns.rule_engine.Constants.HEAVY_PARCEL_WEIGHT;

import com.yash.dp.behavioral_patterns.rule_engine.Parcel;
import com.yash.dp.behavioral_patterns.rule_engine.ParcelCostRule;

import static com.yash.dp.behavioral_patterns.rule_engine.Constants.HEAVY_PARCEL_MULT_FACTOR;


public class HeavyParcelRule implements ParcelCostRule<Parcel, Double> {

	@Override
	public Double process(Parcel parcel) {
		return parcel.getWeight() * HEAVY_PARCEL_MULT_FACTOR;
	}

	@Override
	public boolean matches(Parcel parcel) {
		return parcel.getWeight() > HEAVY_PARCEL_WEIGHT;
	}

}
