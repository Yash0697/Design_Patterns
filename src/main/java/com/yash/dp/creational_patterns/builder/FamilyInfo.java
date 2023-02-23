package com.yash.dp.creational_patterns.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class FamilyInfo {

	private String relation;
	private boolean isBloodRelative;
	
	private FamilyInfo(String relation, boolean isBloodRelative) {
		this.relation = relation;
		this.isBloodRelative = isBloodRelative;
	}
	
	public static FamilyInfoBuilder builder() {
		return new FamilyInfo.FamilyInfoBuilder();
	}
	
	public static class FamilyInfoBuilder {
		private String relation;
		private boolean isBloodRelative;
		
		public FamilyInfoBuilder relation(String relation) {
			this.relation = relation;
			return this;
		}
		
		public FamilyInfoBuilder isBloodRelative(boolean isBloodRelative) {
			this.isBloodRelative = isBloodRelative;
			return this;
		}
		
		public FamilyInfo build() {
			return new FamilyInfo(relation, isBloodRelative);
		}
	}
}
