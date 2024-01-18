package javaChapterExercises;
import java.util.Scanner;

public class ChapterFiveSixteen {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        StringBuilder barOfAsterisks = new StringBuilder();
            while(count < 5) {

                System.out.println("Enter a number btw 1 - 30: ");
                int numbers = input.nextInt();

                if(numbers >= 1 && numbers <= 30) {
                    count++;


                    String asterisks = "*".repeat(numbers);
                    barOfAsterisks.append(asterisks).append("\n");
                }
            }
        System.out.println(barOfAsterisks);



    }
}
