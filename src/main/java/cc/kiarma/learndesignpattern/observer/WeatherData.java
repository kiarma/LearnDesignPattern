package cc.kiarma.learndesignpattern.observer;

import java.util.Observable;


public class WeatherData extends Observable {

    private double temperature;

    private double humidity;

    private double pressure;

    public double getTemperature() {
        return temperature;
    }

    public double getHumidity() {
        return humidity;
    }

    public double getPressure() {
        return pressure;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
        setChanged();
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
        setChanged();
    }

    public void setPressure(double pressure) {
        this.pressure = pressure;
        setChanged();
    }

    @Override
    public String toString() {
        return "WeatherData{" +
                "temperature=" + temperature +
                ", humidity=" + humidity +
                ", pressurea=" + pressure +
                '}';
    }
}
