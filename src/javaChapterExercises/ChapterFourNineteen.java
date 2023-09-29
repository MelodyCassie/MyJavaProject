package javaChapterExercises;

import java.util.Scanner;

public class ChapterFourNineteen {
    public static double checkSalesPersonsEarnings(double itemValue) {

            double earnings = itemValue * 0.09 + 200;
            return earnings;
    }


    public static void main(String[] args) {
        double calculate = checkSalesPersonsEarnings(345);
        System.out.println(calculate);

    }
}