package com.yash.dp.behavioral_patterns.observer;


// Display avg.max/min temperature, humidity and pressure
public class StatisticsDisplay implements DisplayElement, Observer {

	private WeatherData weatherData;
	
	
	private float avgTemp;
	private float avgHumidity;
	private float averagePressure;
	
	
	private float minTemp;
	private float minPressure;
	private float minHumidity;
	
	
	private float maxTemp;
	private float maxPressure;
	private float maxHumidity;
	
	private int updateCount = 0;
	
	public StatisticsDisplay(WeatherData weatherData) {
		this.weatherData = weatherData;
		this.avgTemp = 0;
		this.avgHumidity = 0;
		this.averagePressure = 0;
		this.maxHumidity = 0;
		this.maxPressure = 0;
		this.maxTemp = 0;
		this.minHumidity = Float.MAX_VALUE;
		this.minPressure = Float.MAX_VALUE;
		this.minTemp = Float.MAX_VALUE;
		
		weatherData.registerObserver(this);
	}
	
	
	@Override
	public void update(float temp, float humidity, float pressure) {
		updateCount++;
		this.maxTemp = Math.max(this.maxTemp, temp);
		this.maxHumidity = Math.max(this.maxHumidity, humidity);
		this.maxPressure = Math.max(this.maxPressure, pressure);
		this.minTemp = Math.min(this.minTemp, temp);
		this.minHumidity = Math.min(this.minHumidity, humidity);
		this.minPressure = Math.min(this.minPressure, pressure);
		this.minTemp = Math.min(this.minTemp, temp);
		this.minHumidity = Math.min(this.minHumidity, humidity);
		this.minPressure = Math.min(this.minPressure, pressure);
		
		this.avgTemp = (this.avgTemp * (updateCount - 1) + temp) / updateCount;
		this.avgHumidity = (this.avgHumidity * (updateCount - 1) + humidity) / updateCount;
		this.averagePressure = (this.averagePressure * (updateCount - 1) + pressure) / updateCount;
		
		
		display();
	}

	@Override
	public void display() {
		System.out.println("++++++++++++++++++++++++++++++ Statistics ++++++++++++++++++++++++++++++"
				+ "\n+\t\tAverage/Max/Min Temperature: "+
				this.avgTemp+", " + this.maxTemp +", " + this.minTemp + 
				"\n+\t\tAverage/Max/Min Humidity: " +
				this.avgHumidity + ", " + this.maxHumidity + ", " + this.minHumidity +
				"\n+\t\tAverage/Max/Min Pressure: " +
				this.averagePressure + ", " + this.maxPressure + ", " + this.minPressure
				);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++\n\n");
	}
	
	@Override
	public void unregister() {
		this.weatherData.removeObserver(this);
	}

}
