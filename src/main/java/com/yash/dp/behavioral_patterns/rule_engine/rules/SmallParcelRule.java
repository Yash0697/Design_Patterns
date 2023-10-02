package com.yash.dp.behavioral_patterns.rule_engine.rules;
import static com.yash.dp.behavioral_patterns.rule_engine.Constants.SMALL_PARCEL_VOLUME;

import com.yash.dp.behavioral_patterns.rule_engine.Parcel;
import com.yash.dp.behavioral_patterns.rule_engine.ParcelCostRule;

import static com.yash.dp.behavioral_patterns.rule_engine.Constants.SMALL_PARCEL_MULT_FACTOR;

public class SmallParcelRule implements ParcelCostRule<Parcel, Double> {

	@Override
	public Double process(Parcel parcel) {
		double volume = getVolume(parcel);
		return volume * SMALL_PARCEL_MULT_FACTOR;
	}

	@Override
	public boolean matches(Parcel parcel) {
		double volume = getVolume(parcel);
		return volume < SMALL_PARCEL_VOLUME;
	}
	
	private double getVolume(Parcel parcel) {
		return parcel.getHeight() * parcel.getLength() * parcel.getWeight();
	}

}
