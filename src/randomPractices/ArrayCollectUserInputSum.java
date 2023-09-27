package randomPractices;

import java.util.Scanner;

public class ArrayCollectUserInputSum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] integers = new int[5];
        for(int count = 0; count < integers.length; count++){
            System.out.println("Enter Number: "+ (count +1));
            integers[count] = input.nextInt();
        }
        for(int integer : integers){
            System.out.println(integer);

            int sum = 0;
            sum += integer;

        }

    }
}
