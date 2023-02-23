package com.yash.dp.behavioral_patterns.command;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Light {// acts as receiver
	
	private boolean isOn;
	
	public void on() {
		this.isOn = true;
		System.out.println("Light turned on");
	}
	
	public void off() {
		this.isOn = false;
		System.out.println("Light turned off");
	}
	
}
