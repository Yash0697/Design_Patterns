package com.yash.dp.behavioral_patterns.rule_engine.rules;
import static com.yash.dp.behavioral_patterns.rule_engine.Constants.LARGE_PARCEL_MULT_FACTOR;

import com.yash.dp.behavioral_patterns.rule_engine.Parcel;
import com.yash.dp.behavioral_patterns.rule_engine.ParcelCostRule;
public class LargeParcelRule implements ParcelCostRule<Parcel, Double> {

	@Override
	public Double process(Parcel parcel) {
		Double volume = getVolume(parcel);
		return volume * LARGE_PARCEL_MULT_FACTOR;
	}

	@Override
	public boolean matches(Parcel parcel) {
		return true;
	}

	private double getVolume(Parcel parcel) {
		return parcel.getHeight() * parcel.getLength() * parcel.getWeight();
	}
}
