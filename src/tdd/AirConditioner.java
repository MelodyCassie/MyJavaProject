package tdd;

public class AirConditioner {
    private boolean toggleOn;
    private int increaseTemperature;
    private int decreaseTemperature;

    public void setToggleOn(boolean toggleOn){ this.toggleOn = toggleOn; }
    public boolean getToggleOn(){
        return toggleOn;
    }
    public void setIncreaseTemperature(int increaseTemperature){
        this.increaseTemperature = increaseTemperature;
    }
    public int getIncreaseTemperature(){
        return increaseTemperature;
    }
    public void setDecreaseTemperature(int decreaseTemperature){
        this.decreaseTemperature = decreaseTemperature;
    }
    public int getDecreaseTemperature(){
        return decreaseTemperature;
    }

    public int increaseBeyondDefault(int defaultTemperature, int increase){
        return defaultTemperature + increase;
    }

    public int decreaseBelowThirty(int highestTemperature, int decrease){
        return highestTemperature - decrease;

    }
    public boolean increaseBeyondThirty(boolean thirty){
        return thirty;
    }
    public boolean decreaseBelowSixteen(boolean sixteen){
        return sixteen;
    }

    }
