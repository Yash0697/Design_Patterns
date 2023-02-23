package com.yash.dp.behavioral_patterns.command;

public class ChangeTVChannelCommand implements Command {

	private TV tv;
	private String prevChannel;
	private String channel;
	
	public ChangeTVChannelCommand(TV tv, String channel) {
		this.tv = tv;
		this.channel = channel;
	}

	@Override
	public void execute() {
		this.prevChannel = this.tv.getChannel();
		this.tv.setChannel(this.channel);
	}

	@Override
	public void undo() {
		String tempChannel = this.tv.getChannel();
		this.tv.setChannel(prevChannel);
		prevChannel = tempChannel;
	}
	
	
}
