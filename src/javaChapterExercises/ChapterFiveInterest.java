package javaChapterExercises;

public class ChapterFiveInterest {
    public static void main(String[] args) {
        double initialAmount = 1000;
        double interest = 0.05;

        for(int year = 1; year <= 10; year++){


            double amount = initialAmount * Math.pow(1.0 + interest, year);
            System.out.printf("%4d%,20.2f%n", year, amount);
        }


    }

}
