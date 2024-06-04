package assignment;

public class AirConditioner {
    private boolean isOn;
    private int temperature = 16;

    public boolean isAirConditionerOn() {
        return isOn;

    }

    public void turnOn() {
        isOn = true;
    }

    public void turnOff() {
        isOn = false;
    }

    public int getTemperature() {
        return temperature;
    }

    public void increaseTemperature() {
        if(isOn && temperature < 30 ) {
            temperature++;
        }
    }

    public void toggle(){
        isOn = !isOn;
    }

    public void decreaseTemperature() {
        if(temperature > 16 ) {
            temperature--;
        }

    }
}
