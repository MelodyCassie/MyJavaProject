package javaChapterExercises;

public class ChapterFiveThirteen {
    public static void main(String[] args) {

        long n = 1;
        long sum = 0;
        System.out.println("n\tSum");

        while (n <= 100){

            sum+=n;
            System.out.printf("%d\t%d%n", n, sum);
            ++n;

        }

    }
}
