package cc.kiarma.learndesignpattern.observer;

public class Main {

    public static void main(String[] args) {
        WeatherData weatherData = new WeatherData();
        new GeneralDisplay(weatherData);
        new StatisticDisplay(weatherData);
        new ForecastDisplay(weatherData);
        weatherData.setTemperature(32.3);
        weatherData.notifyObservers();
        weatherData.setTemperature(32.3);
        weatherData.notifyObservers();
    }
}
