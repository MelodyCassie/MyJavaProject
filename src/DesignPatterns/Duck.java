package DesignPatterns;

public class Duck {

    private Flyable fly;
    private Quackable quack;

    public Duck(Flyable fly,Quackable quack){
        this.fly = fly;
        this.quack = quack;
    }

    public void fly(){
        fly.fly();
    }
    public void quack(){
        quack.quack();

    }
}
