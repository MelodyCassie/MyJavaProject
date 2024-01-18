package javaChapterExercises;

public class CompoundInterest {
    public static void main(String[] args) {

        double deposit = 1000;
        double interest = 0.05;

        System.out.printf("%s%20s%n", "Year", "Amount on deposit");

        for(int year = 0; year <= 10; year ++){
            double total = deposit * Math.pow(1.0 + interest,year);

            System.out.printf("%4d%,20.2f%n", year,total);


        }
    }
}
