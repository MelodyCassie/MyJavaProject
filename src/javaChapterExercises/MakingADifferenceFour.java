package javaChapterExercises;

import java.util.Scanner;

public class MakingADifferenceFour {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter four digit integer: ");
        int fourDigitInput = scanner.nextInt();

        int encryptionResult = encrypt(fourDigitInput);

        System.out.println("Encrypted Result: " + encryptionResult);

    }
    static int encrypt(int data){
        int digit1 = data / 1000;
        int digit2 = (data % 1000) / 100;
        int digit3 = (data % 100) / 10;
        int digit4 = data % 10;

        digit1 = (digit1 + 7) % 10;
        digit2 = (digit2 + 7) % 10;
        digit3 = (digit3 + 7) % 10;
        digit4 = (digit4 + 7) % 10;

        return digit3 * 1000 + digit4 * 100 + digit1 * 10 + digit2;
    }
    static int decrypt(int data){
        int digit1 = data / 1000;
        int digit2 = (data % 1000) / 100;
        int digit3 = (data % 100) / 10;
        int digit4 = data % 10;

        int decryptedData = digit3 * 1000 +digit4 * 100 + digit1 * 10 + digit2;

        digit1 = (digit1 - 7 + 10) % 10;
        digit2 = (digit2 - 7 + 10) % 10;
        digit3 = (digit3 - 7 + 10) % 10;
        digit4 = (digit4 - 7 + 10) % 10;

        return decryptedData;

    }
}