package com.yash.dp.creational_patterns.builder;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AddressInfo {

	private Integer pinCode;

	private String street;

	private String state;

	private String city;

	private String country;

	private AddressInfo(Integer pinCode, String street, String state, String city, String country) {
		super();
		this.pinCode = pinCode;
		this.street = street;
		this.state = state;
		this.city = city;
		this.country = country;
	}
	
	public static AddressInfoBuilder builder() {
		return new AddressInfo.AddressInfoBuilder();
	}
	
	public static class AddressInfoBuilder {
		private Integer pinCode;
		private String street;
		private String state;
		private String city;
		private String country;
		
		public AddressInfoBuilder pinCode(Integer pinCode) {
			this.pinCode = pinCode;
			return this;
		}
		
		public AddressInfoBuilder street(String street) {
			this.street = street;
			return this;
		}
		
		public AddressInfoBuilder state(String state) {
			this.state = state;
			return this;
		}
		
		public AddressInfoBuilder city(String city) {
			this.city = city;
			return this;
		}
		
		public AddressInfoBuilder country(String country) {
			this.country = country;
			return this;
		}
		
		public AddressInfo build() {
			return new AddressInfo(pinCode, street, state, city, country);
		}
	}
}
