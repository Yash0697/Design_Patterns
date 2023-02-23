package com.yash.dp.behavioral_patterns.command;

public class CeilingFanHighCommand implements Command {
	
	private CeilingFan ceilingFan;
	private int prevSpeed;
	

	public CeilingFanHighCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		this.prevSpeed = ceilingFan.getSpeed();
		ceilingFan.high();
	}

	@Override
	public void undo() {
		if(prevSpeed == CeilingFan.HIGH)
			ceilingFan.high();
		
		else if(prevSpeed == CeilingFan.MEDIUM)
			ceilingFan.medium();
		
		else if(prevSpeed == CeilingFan.LOW)
			ceilingFan.low();
		else
			ceilingFan.off();
		this.prevSpeed = CeilingFan.HIGH;
	}

}
