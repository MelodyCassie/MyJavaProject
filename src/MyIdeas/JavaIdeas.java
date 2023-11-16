package MyIdeas;

import java.security.SecureRandom;

public class JavaIdeas {
    public static void main(String[] args) {
        SecureRandom randomNumbers = new SecureRandom();
        //This line creates an instance of the SecureRandom class, which
        // is used to generate random numbers. It's a more secure way to generate random
        // numbers compared to the standard Random class.

        int number = randomNumbers.nextInt(1,10);
        System.out.println("number " + number + " was generated");

        System.out.println(new SecureRandom().nextInt(1,10));
    }





}
