package com.yash.dp.behavioral_patterns.observer;

public interface Observer {

	public void update(float temp, float humidity, float pressure);
	public void unregister();
}
