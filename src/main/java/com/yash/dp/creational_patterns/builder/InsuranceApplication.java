package com.yash.dp.creational_patterns.builder;

import java.util.List;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InsuranceApplication {

		private Long referenceId;
		
		private String companyId;
		
		private String insuranceType;
			
		private List<OccupationInfo> occupationInfo;
		
		private AddressInfo addressInfo;
		
		private List<FamilyInfo> familyInfo;
		
		private HealthInfo healthInfo;
		
		private InsuranceApplication(Long referenceId, String companyId, String insuranceType,
				List<OccupationInfo> occupationInfo, AddressInfo addressInfo, List<FamilyInfo> familyInfo,
				HealthInfo healthInfo) {
			this.referenceId = referenceId;
			this.companyId = companyId;
			this.insuranceType = insuranceType;
			this.occupationInfo = occupationInfo;
			this.addressInfo = addressInfo;
			this.familyInfo = familyInfo;
			this.healthInfo = healthInfo;
		}
		
		public static InsuranceApplicationBuilder builder() {
			return new InsuranceApplication.InsuranceApplicationBuilder();
		}
		
		public static class InsuranceApplicationBuilder {
			private Long referenceId;
			private String companyId;
			private String insuranceType;
			private List<OccupationInfo> occupationInfo;
			private AddressInfo addressInfo;
			private List<FamilyInfo> familyInfo;
			private HealthInfo healthInfo;
			public InsuranceApplicationBuilder referenceId(Long referenceId) {
				this.referenceId = referenceId;
				return this;
			}
			public InsuranceApplicationBuilder companyId(String companyId) {
				this.companyId = companyId;
				return this;
			}
			public InsuranceApplicationBuilder insuranceType(String insuranceType) {
				this.insuranceType = insuranceType;
				return this;
			}
			public InsuranceApplicationBuilder occupationInfo(List<OccupationInfo> occupationInfo) {
				this.occupationInfo = occupationInfo;
				return this;
			}
			public InsuranceApplicationBuilder addressInfo(AddressInfo addressInfo) {
				this.addressInfo = addressInfo;
				return this;
			}
			public InsuranceApplicationBuilder familyInfo(List<FamilyInfo> familyInfo) {
				this.familyInfo = familyInfo;
				return this;
			}
			public InsuranceApplicationBuilder healthInfo(HealthInfo healthInfo) {
				this.healthInfo = healthInfo;
				return this;
			}
			
			public InsuranceApplication build() {
				return new InsuranceApplication(referenceId, 
						companyId, 
						insuranceType, 
						occupationInfo, 
						addressInfo, 
						familyInfo, 
						healthInfo);
			}
			

		}
		
}
