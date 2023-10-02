package com.yash.dp.behavioral_patterns.rule_engine;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.yash.dp.behavioral_patterns.rule_engine.rules.HeavyParcelRule;
import com.yash.dp.behavioral_patterns.rule_engine.rules.LargeParcelRule;
import com.yash.dp.behavioral_patterns.rule_engine.rules.MediumParcelRule;
import com.yash.dp.behavioral_patterns.rule_engine.rules.RejectParcelRule;
import com.yash.dp.behavioral_patterns.rule_engine.rules.SmallParcelRule;

public class ParcelCostRuleEngine {

	private List<ParcelCostRule<Parcel, Double>> rules;
	
	public ParcelCostRuleEngine() {
		rules = Arrays.asList(
				// order of addition of rules matter here, some rules have higher priority than others
					new RejectParcelRule(),
					new HeavyParcelRule(),
					new SmallParcelRule(),
					new MediumParcelRule(),
					new LargeParcelRule()
				);
	}
	
	public Double getCost(Parcel parcel) {
		Optional<ParcelCostRule<Parcel, Double>> optional = rules.stream()
				.filter(rule -> rule.matches(parcel))
				.findFirst();
		if(optional.isPresent()) {
			String parcelRuleName = optional.get().getClass().getSimpleName();
			System.out.println("Parcel is "+parcelRuleName.substring(0, parcelRuleName.length() - 4));
			return optional.get().process(parcel);
		}
		return new LargeParcelRule().process(parcel);
				
	}
}
