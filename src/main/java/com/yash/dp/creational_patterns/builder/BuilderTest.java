package com.yash.dp.creational_patterns.builder;

import java.util.ArrayList;
import java.util.List;

public class BuilderTest {

	public static void main(String[] args) {
		
		AddressInfo addressInfo = AddressInfo.builder()
				.city("New Delhi")
				.country("India")
				.pinCode(120112)
				.state("Delhi")
				.build();
		
		List<FamilyInfo> familyInfo = new ArrayList<>();
		familyInfo.add(FamilyInfo.builder()
				.relation("Brother")
				.isBloodRelative(true)
				.build());
		List<OccupationInfo> occupationInfo = new ArrayList<>();
		occupationInfo.add(OccupationInfo.builder()
				.typeOfCompany("Private Witholding")
				.designation("Manager")
				.companyName("ABC Infra Ltd.")
				.build());
		InsuranceApplication application = InsuranceApplication.builder()
				.referenceId(12345678L)
				.companyId("2e1f3adbf")
				.addressInfo(addressInfo)
				.familyInfo(familyInfo)
				.occupationInfo(occupationInfo)
				.build();
		
		System.out.println("OccupationInfo of insurance application: \n"+ application.getOccupationInfo().get(0).toString());
	}

}
