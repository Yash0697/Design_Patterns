package com.yash.dp.behavioral_patterns.rule_engine.rules;
import static com.yash.dp.behavioral_patterns.rule_engine.Constants.MEDIUM_PARCEL_VOLUME;

import com.yash.dp.behavioral_patterns.rule_engine.Parcel;
import com.yash.dp.behavioral_patterns.rule_engine.ParcelCostRule;

import static com.yash.dp.behavioral_patterns.rule_engine.Constants.MEDIUM_PARCEL_MULT_FACTOR;

public class MediumParcelRule implements ParcelCostRule<Parcel, Double> {

	@Override
	public Double process(Parcel parcel) {
		Double volume = getVolume(parcel);
		return volume * MEDIUM_PARCEL_MULT_FACTOR;
	}

	@Override
	public boolean matches(Parcel parcel) {
		Double volume = getVolume(parcel);
		return volume < MEDIUM_PARCEL_VOLUME;
	}
	
	private double getVolume(Parcel parcel) {
		return parcel.getHeight() * parcel.getLength() * parcel.getWeight();
	}

}
