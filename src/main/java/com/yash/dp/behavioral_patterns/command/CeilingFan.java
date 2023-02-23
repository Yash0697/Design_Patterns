package com.yash.dp.behavioral_patterns.command;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CeilingFan {
	private boolean isOn;
	public static final int HIGH = 5;
	public static final int MEDIUM = 3;
	public static final int LOW = 1;
	public static final int OFF = 0;
	
	private int speed;
	private String location;
	
	public CeilingFan() {
		
	}
	
	public CeilingFan(String location) {
		this.location = location;
		speed = OFF;
	}
	

	public void on() {
		this.isOn = true;
		this.speed = LOW;
		System.out.println("Ceiling fan at " + this.location + " is running now at speed " + speed);
	}

	public void off() {
		this.isOn = false;
		System.out.println("Ceiling fan at " + this.location + " is turned off");
	}
	
	public void high() {
		this.speed = HIGH;
		System.out.println("ceiling fan at " + this.location + " is running at speed "+speed);
	}
	
	public void medium() {
		this.speed = MEDIUM;
		System.out.println("ceiling fan at " + this.location + " is running at speed "+speed);
	}
	
	public void low() {
		this.speed = LOW;
	}
	
}
