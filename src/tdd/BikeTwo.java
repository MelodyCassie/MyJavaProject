package tdd;

public class BikeTwo {
    private boolean toggleOn;
    private int speed;


    public void setToggleOn(boolean toggleOn){
        this.toggleOn = toggleOn;
    }
    public boolean getToggleOn() {
       return true;
    }

    public int getSpeed(){
        return speed;
    }
    public void setSpeed(int speed){
        this.speed = speed;
    }


    public int gearOne(int input, int plusOne){
        return input + plusOne;
    }
    public int gearTwo(int input, int plusTwo){
        return input + plusTwo;
    }
    public int plusThree(int input, int plusThree){
        return input + plusThree;
    }
    public int plusFour(int input, int plusFour){
        return  input + plusFour;
    }

    public int minusOne(int input, int minusOne){
        return input - minusOne;
    }
    public int minusTwo(int input, int minusTwo ){
        return input - minusTwo;
    }
    public int minusThree(int input , int minusThree){
        return input - minusThree;
    }
    public int minusFour(int input, int minusFour){
        return input - minusFour;
    }
    public int plusSix(int input, int plusSix){
        return input + plusSix;
    }

    public int plusThreePlus(int input , int plusThreePlus){
        return input + plusThreePlus;
    }
    public int plusFourPlus(int input, int plusFourPlus){
        return input + plusFourPlus;
    }
}


