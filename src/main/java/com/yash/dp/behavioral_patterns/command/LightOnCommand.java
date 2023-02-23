package com.yash.dp.behavioral_patterns.command;

public class LightOnCommand implements Command { // actual command
	
	private Light light;
	
	
	public LightOnCommand(Light light) { 
		this.light = light;
	}

	@Override
	public void execute() {
		this.light.on();
	}

	@Override
	public void undo() {
		light.off();
	}

}
