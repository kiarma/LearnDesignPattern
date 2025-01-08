package cc.kiarma.learndesignpattern.observer;

import java.util.Observable;


public class WeatherData extends Observable {

    private double temperature;

    private double humidity;

    private double pressurea;

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressurea() {
        return pressurea;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        setChanged();
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
        setChanged();
    }

    public void setPressurea(double pressurea) {
        this.pressurea = pressurea;
        setChanged();
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressurea=" + pressurea +
                '}';
    }
}
