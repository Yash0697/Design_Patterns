package com.yash.dp.behavioral_patterns.command;

public class CommandTest { // client

	public static void main(String[] args) {
		RemoteControl remote = new RemoteControl();
		Light light = new Light();
		LightOnCommand lightOnCommand = new LightOnCommand(light);
		LightOffCommand lightOffommand = new LightOffCommand(light);

		CeilingFan ceilingFanGuestRoom = new CeilingFan("Guest Room");
		CeilingFan ceilingFanLivingRoom = new CeilingFan("Living Room");

		// living room ceiling fan has just on and off features
		CeilingFanOnCommand ceilingFanLivingRoomOn = new CeilingFanOnCommand(ceilingFanLivingRoom);
		CeilingFanOffCommand ceilingFanLivingRoomOff = new CeilingFanOffCommand(ceilingFanLivingRoom);

		// we can control speed of a guest room ceiling fan
		CeilingFanHighCommand ceilingFanHighCommand = new CeilingFanHighCommand(ceilingFanGuestRoom);
		CeilingFanMediumCommand ceilingFanMediumCommand = new CeilingFanMediumCommand(ceilingFanGuestRoom);
		CeilingFanOffCommand ceilingFanGuestRoomOff = new CeilingFanOffCommand(ceilingFanGuestRoom);

		// we need two set of commands for guest room ceiling fan
		remote.setCommand(0, lightOnCommand, lightOffommand);
		remote.setCommand(1, ceilingFanLivingRoomOn, ceilingFanLivingRoomOff);

		remote.setCommand(2, ceilingFanHighCommand, ceilingFanGuestRoomOff);
		remote.setCommand(3, ceilingFanMediumCommand, ceilingFanGuestRoomOff);

		System.out.println(remote);
		remote.pressOnButtom(0);
		remote.pressOnButtom(1);
		
		remote.pressOnButtom(2);
		remote.pressUndoButton();

		remote.pressOnButtom(3);
		
		try {
			Thread.sleep(5000);

			remote.pressUndoButton();
			Thread.sleep(5000);
			remote.pressOffButtom(2);
			remote.pressOffButtom(0);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}
