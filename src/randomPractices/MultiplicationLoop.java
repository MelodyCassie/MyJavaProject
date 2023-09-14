package randomPractices;
public class MultiplicationLoop {
    public static void main(String[] args) {
        int input = 8;
        System.out.print("The Multiplication Table of 8 is: " + input);

        for (int index = 0; index <= 12; index++) {
            int result = input * index;

            System.out.println(input + "*" + index + "*" + result);
        }
    }
}

