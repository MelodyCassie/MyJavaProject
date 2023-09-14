package tdd;

public class Bike {
    public Bike Boolean;
    private String name;
    private boolean isOn;
    private String balance;

    public void setName(String name) {
        this.name = name ;
    }
    public void setOn(Boolean isOn) {
        this.isOn = isOn ;
    }
    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getName() {
        return name;
    }
    public String getBalance() {
        return balance;
    }
    public boolean getIsOn() {
        return isOn;
    }

    public void isOn() {
    }
}
