package com.yash.dp.behavioral_patterns.rule_engine.rules;
import static com.yash.dp.behavioral_patterns.rule_engine.Constants.REJECT_PARCEL_WEIGHT;

import com.yash.dp.behavioral_patterns.rule_engine.Parcel;
import com.yash.dp.behavioral_patterns.rule_engine.ParcelCostRule;;

public class RejectParcelRule implements ParcelCostRule<Parcel, Double> {

	@Override
	public Double process(Parcel parcel) {
		return null;
	}

	@Override
	public boolean matches(Parcel parcel) {
		return parcel.getWeight() > REJECT_PARCEL_WEIGHT;
	}

}
