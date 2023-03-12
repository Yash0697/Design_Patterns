package com.yash.dp.behavioral_patterns.observer;

import java.util.ArrayList;
import java.util.List;

// This is the subject that stores the state
public class WeatherData implements Subject {
	
	private List<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;
	
	public WeatherData() {
		observers = new ArrayList<Observer>();
	}

	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void removeObserver(Observer o) {
		observers.remove(o);
	}

	@Override
	public void notifyObservers() {
		observers.stream().forEach(o -> o.update(temperature, humidity, pressure));
	}
	
	public void measurementsChanged() {
		notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.pressure = pressure;
		this.humidity = humidity;
		measurementsChanged();
	}

}
