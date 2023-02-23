package com.yash.dp.behavioral_patterns.command;

import lombok.Getter;

@Getter
public class TV {

	private boolean isOn;
	private String channel;
	private String location;
	
	public TV() {}
	
	public TV(String location) {
		this.channel = "Doordarshan";
		this.location = location;
	}
	
	public void on() {
		this.isOn = true;
		System.out.println("You are watching channel " + this.channel + " on tv at " + this.location);
	}
	
	public void off() {
		this.isOn = false;
		System.out.println("TV at " + this.location + " is turned off");
	}
	
	public void setChannel(String channel) {
		this.channel = channel;
		System.out.println("You are now watching channel " + this.channel + " on tv at " + this.location);
	}
	
}
