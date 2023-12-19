package javaChapterExercises;

import javax.management.StringValueExp;
import java.util.Scanner;

public class ChapterFourThirtyTwo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter binary digits of 0s and 1s:  ");
        String binaryDigits = input.nextLine();

//        while(binaryDigits < 0 || binaryDigits > 1){
//            System.out.println("Binary numbers consists of only 0s and 1s.\n Enter binary digits of 0s and 1s:  ");
//            binaryDigits = input.nextInt();
//        }

        int decimalEquivalent = 0;
        for(int i = binaryDigits.length()-1; i >= 0; i--){
            int extract = binaryDigits.charAt(i) - '0';

            decimalEquivalent += (int) (extract * Math.pow(2,binaryDigits.length() - 1 - i));

        }
        System.out.println("This is the decimal equivalent  " + decimalEquivalent);
    }
}
