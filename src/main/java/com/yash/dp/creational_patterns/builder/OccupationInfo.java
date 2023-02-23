package com.yash.dp.creational_patterns.builder;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class OccupationInfo {


	//optional
	private String occupationNature;
	
	private String designation;
	
	private Long yearsOfOccupation;
	
	//optional
	private String typeOfCompany;
	
	private String companyName;

	private OccupationInfo(String occupationNature, String designation, Long yearsOfOccupation,
			String typeOfCompany, String companyName) {
		super();
		this.occupationNature = occupationNature;
		this.designation = designation;
		this.yearsOfOccupation = yearsOfOccupation;
		this.typeOfCompany = typeOfCompany;
		this.companyName = companyName;
	}
	
	public static OccupationInfoBuilder builder() {
		return new OccupationInfo.OccupationInfoBuilder();
	}
	
	public static class OccupationInfoBuilder {
		
		private String designation;		
		private String companyName;
		
		//optional
		private Long yearsOfOccupation;
		private String typeOfCompany;
		private String occupationNature;
		
		public OccupationInfoBuilder() {
			
		}
		
		public OccupationInfoBuilder(String designation, String companyName) {
			this.designation = designation;
			this.companyName = companyName;
		}
		
		public OccupationInfoBuilder yearsOfOccupation(Long years) {
			this.yearsOfOccupation = years;
			return this;
		}
		
		public OccupationInfoBuilder typeOfCompany(String companyType) {
			this.typeOfCompany = companyType;
			return this;
		}
		
		public OccupationInfoBuilder occupationNature(String occupationNature) {
			this.occupationNature = occupationNature;
			return this;
		}
		
		public OccupationInfoBuilder designation(String designation) {
			this.designation = designation;
			return this;
		}
		
		public OccupationInfoBuilder companyName(String companyName) {
			this.companyName = companyName;
			return this;
		}
		
		public OccupationInfo build() {
			return new OccupationInfo(occupationNature, designation, yearsOfOccupation, typeOfCompany, companyName);
		}
		
	}
}
