package com.yash.dp.behavioral_patterns.observer;

public class WeatherStation {

	@SuppressWarnings("unused")
	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		StatisticsDisplay statisticsDisplay = new StatisticsDisplay(weatherData);
		
		weatherData.setMeasurements(40.2f, 60, 32.8f);
		weatherData.setMeasurements(41.1f, 64.4f, 30.4f);
		weatherData.setMeasurements(40.8f, 62.9f, 30.1f);
	}

}
