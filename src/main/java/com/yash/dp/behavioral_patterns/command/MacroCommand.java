package com.yash.dp.behavioral_patterns.command;

/*
 * To execute multiple commands at once. For example
 *  there are guests at home, turn on ceiling fan, light, 
 *  turn on stereo etc
 *  */

public class MacroCommand implements Command {
	
	private Command[] commands;
	
	public MacroCommand(Command[] commands)
	{
		this.commands = commands;
	}

	@Override
	public void execute() {
		
		for(int i = 0; i < commands.length; i++) {
			commands[i].execute();
		}

	}

	@Override
	public void undo() {
		for(int i = 0; i < commands.length; i++) {
			commands[i].undo();
		}
	}
	
	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer();
		sb.append("*************** Remote Control ***************\n");
		for(int i = 0; i < commands.length; i++) {
			sb.append("[slot " + i + " commands] " + commands[i].getClass().getSimpleName());
			sb.append("\n");
		}
		return sb.toString();
	}

}
