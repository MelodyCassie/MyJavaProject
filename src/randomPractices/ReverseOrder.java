package randomPractices;

public class ReverseOrder {


    public static void main(String[] args) {

        int number = 547;
        int reverse = 0;

        while (number != 0){
            int divisor = number % 10;
            reverse = reverse * 10 + divisor;
            number/= 10;
        }
        System.out.println(reverse);



    }
 }

