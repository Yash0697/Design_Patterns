package com.yash.dp.behavioral_patterns.command;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Setter
@AllArgsConstructor
@Getter
public class RemoteControl { // acts as invoker
	private Command[] onCommands;
	private Command[] offCommands;
	private Command undoCommand;
	// 4 operations
	
	public RemoteControl() {
		onCommands = new Command[4];
		offCommands = new Command[4];
		// initialy remote has none of the 4 commands set
		Command noCommand = new NoCommand();
		for(int i = 0; i < 4; i++) {
			onCommands[i] = noCommand;
			offCommands[i] = noCommand;
		}
		undoCommand = noCommand;
	}
	
	public void setCommand(int slot, Command onCommand, Command offCommand) {
		// set the device on and off feature in one slot of the remote control
		onCommands[slot] = onCommand;
		offCommands[slot] = offCommand;
	}
	
	public void pressOnButtom(int slot) {
		onCommands[slot].execute();
		undoCommand = onCommands[slot];
	}
	
	public void pressOffButtom(int slot) {
		offCommands[slot].execute();
		undoCommand = offCommands[slot];
	}
	
	// for the action done in last button press, undo the action
	public void pressUndoButton() {
		undoCommand.undo();
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("*************** Remote Control ***************\n");
		for(int i = 0; i < onCommands.length; i++) {
			sb.append("[slot " + i + " onCommands ]" + onCommands[i].getClass().getName());
			sb.append("[slot " + i + " offCommands]" + offCommands[i].getClass().getName());
			sb.append("\n");
		}
		return sb.toString();
	}
	
	
	
}
