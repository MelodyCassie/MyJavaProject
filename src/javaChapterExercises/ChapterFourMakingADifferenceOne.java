package javaChapterExercises;

import java.util.Scanner;

public class ChapterFourMakingADifferenceOne {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a four digit integer: ");
        String fourDigitInteger = scanner.nextLine();

        while (!(fourDigitInteger.length() == 4)){

            System.out.println("Enter a four digit integer!\n Try Again..");
            fourDigitInteger = scanner.nextLine();
        }
        int[] numericEncryptedDigits = new int[4];

        for(int i = 0; i < fourDigitInteger.length(); i++) {
            int numericFourDigitInteger = Character.getNumericValue(fourDigitInteger.charAt(i));
            int encryptedDigit = (numericFourDigitInteger + 7) % 100;

            numericEncryptedDigits[i] = encryptedDigit;
        }

              int temp = numericEncryptedDigits[0];
              numericEncryptedDigits[0] = numericEncryptedDigits[2];
              numericEncryptedDigits[2] = temp;

              temp = numericEncryptedDigits[1];
              numericEncryptedDigits[1] = numericEncryptedDigits[3];
              numericEncryptedDigits[3] = temp;


              for(int digits : numericEncryptedDigits){
                  System.out.print(digits);
              }



    }
}
