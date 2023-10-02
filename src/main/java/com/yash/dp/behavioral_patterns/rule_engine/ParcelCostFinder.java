package com.yash.dp.behavioral_patterns.rule_engine;

public class ParcelCostFinder {

	public static void main(String[] args) {
		ParcelCostRuleEngine ruleEngine = new ParcelCostRuleEngine();
		Parcel parcel = new Parcel(12.0, 10.0, 15.0, 25);
		Double cost = ruleEngine.getCost(parcel);
		System.out.printf("cost is  %.2f\n",cost);
		parcel = new Parcel(8.0, 10.0, 15.0, 8);
		cost = ruleEngine.getCost(parcel);
		System.out.printf("cost is  %.2f\n",cost);
		parcel = new Parcel(12.0, 10.0, 15.0, 8);
		cost = ruleEngine.getCost(parcel);
		System.out.printf("cost is  %.2f\n",cost);
	}

}
