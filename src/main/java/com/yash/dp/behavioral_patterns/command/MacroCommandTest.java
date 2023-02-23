package com.yash.dp.behavioral_patterns.command;

public class MacroCommandTest {
	
	private static final String GUEST_ROOM = "Guest Room";

	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();
		
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffCommand = new LightOffCommand(light);

		CeilingFan ceilingFanGuestRoom = new CeilingFan(GUEST_ROOM);


		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFanGuestRoom);
		CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFanGuestRoom);
		CeilingFanOffCommand ceilingFanGuestRoomOff = new CeilingFanOffCommand(ceilingFanGuestRoom);
		
		TV tv = new TV(GUEST_ROOM);
		
		TVOnCommand tvOnCommand = new TVOnCommand(tv);
		TVOffCommand tvOffCommand = new TVOffCommand(tv);
		ChangeTVChannelCommand changeTVChannelCommand = new ChangeTVChannelCommand(tv, "Discovery");
		

		Command[] onCommands = {lightOnCommand, ceilingFanHighCommand,
				ceilingFanMediumCommand, tvOnCommand, changeTVChannelCommand};
		
		Command[] offCommands = {lightOffCommand, ceilingFanGuestRoomOff,
				 tvOffCommand};
		
		MacroCommand onMacroCommand = new MacroCommand(onCommands);
		MacroCommand offMacroCommand = new MacroCommand(offCommands);
		
		remote.setCommand(0, onMacroCommand, offMacroCommand);
		
		System.out.println(" OnCommands ");
		System.out.println(onMacroCommand);
		System.out.println(" Off Commands ");
		System.out.println(onMacroCommand);
		System.out.println("\n****************Turning on Devices in Guest Room******************");
		remote.pressOnButtom(0);
		
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("\n****************Turning off devices Guest Room******************");
		
		remote.pressOffButtom(0);

	}

}
