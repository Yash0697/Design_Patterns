package com.yash.dp.behavioral_patterns.command;

public class CeilingFanOnCommand implements Command {

	private CeilingFan ceilingFan;

	public CeilingFanOnCommand(CeilingFan ceilingFan) {
		this.ceilingFan = ceilingFan;
	}

	@Override
	public void execute() {
		ceilingFan.on();
	}

	@Override
	public void undo() {
		ceilingFan.off();
	}

}
