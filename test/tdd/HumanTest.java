package tdd;

import tdd.Human;

public class HumanTest{
    public static void main(String[] args) {
       Human yuko = new Human();


        yuko.setName("Melody");
        String myName = yuko.getName();
        System.out.println(myName);


        yuko.setAge(24);
        int myAge = yuko.getAge();
        System.out.println(myAge);


        yuko.setPhoneNumber("334455");
       String myNumber =yuko.getPhoneNumber();
        System.out.println(myNumber);



    }
}
