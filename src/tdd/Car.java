package tdd;

public class Car {
    private String name;
    private boolean isOn;
    private String year;
    private String model;
    private double price;

    public Car(String name, boolean isOn, String year,String model, double price){
    }

    public Car() {

    }

    public void setName(String name){
        this. name = name;
    }

    public String getName(){
        return name;
    }

    public void setIsOn(boolean isOn)  {
        this.isOn = isOn;
    }
    public boolean getIsOn() {
        return isOn;
    }

    public void setYear(String year){
        this.year = year;
    }
    public String getYear(){
        return year;
    }

    public void setModel(String model){
        this.model = model;
    }
    public String getModel(){
        return model;
    }
    public void setPrice(){
        this.price = price;
    }
    public double getPrice(){
        return price;
    }
    public String yearNumber(String year){
        return year;
    }
    public int priceRange(int price){
        return price;

    }
}
