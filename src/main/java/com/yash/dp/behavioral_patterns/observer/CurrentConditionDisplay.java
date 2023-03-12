package com.yash.dp.behavioral_patterns.observer;

import lombok.Getter;

public class CurrentConditionDisplay implements Observer, DisplayElement {
	
	private float temperature;
	private float humidity;
	private float pressure;
	@Getter
	private WeatherData weatherData;
	
	public CurrentConditionDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver(this);
	}

	@Override
	public void display() {
		System.out.println("++++++++++++++ Current Conditions +++++++++++++++ \n+\t\tTemperature: " + temperature + 
				" degrees\n+\t\tPressure: " + pressure + "\n+\t\tHumidity: " + humidity + "%"
				);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++\n\n");
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		this.temperature = temp;
		this.pressure = pressure;
		this.humidity = humidity;
		display();
	}

	@Override
	public void unregister() {
		this.weatherData.removeObserver(this); //can we make use of Functional Interface here??
		
	}
	
}
