package javaChapterExercises;

public class ChapterFiveTwelve {
    public static void main(String[] args) {

        int integers = 1;
        int sum = 0;

        while (integers <= 30) {
            if (integers % 3 == 0)
                sum += integers;

            ++integers;
        }
        System.out.println("The sum of the integers divisible by 3 are " + sum);
    }
}
