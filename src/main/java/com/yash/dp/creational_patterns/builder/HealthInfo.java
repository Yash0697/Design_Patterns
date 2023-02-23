package com.yash.dp.creational_patterns.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class HealthInfo {

	
	private String disease;

	private boolean isCured;

	private String organAffected;

	private HealthInfo(String disease, boolean isCured, String organAffected) {
		this.disease = disease;
		this.isCured = isCured;
		this.organAffected = organAffected;
	}
	
	public static HealthInfoBuilder builder() {
		return new HealthInfo.HealthInfoBuilder();
	}
	
	public static class HealthInfoBuilder {	
		
		private String disease;
		private boolean isCured;
		private String organAffected;
		
		public HealthInfoBuilder disease(String disease) {
			this.disease(disease);
			return this;
		}
		
		public HealthInfoBuilder isCured(boolean isCured) {
			this.isCured = isCured;
			return this;
		}
		
		public HealthInfoBuilder organAffected(String organAffected) {
			this.organAffected = organAffected;
			return this;
		}
		
		public HealthInfo build() {
			return new HealthInfo(disease, isCured, organAffected);
		}
		
		
		
	}
	
}
