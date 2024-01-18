package javaChapterExercises;

public class ChapterFiveFifteen {
    public static void main(String[] args) {
        patternA();
        patternB();
        patternC();
        patternD();
    }

    private static void patternD() {
    }

    private static void patternC() {
    }

    private static void patternB() {
        for(int row = 10; row >= 10; row--){}

    }


    public static void patternA() {
        for (int row = 1; row <= 10; row++) {
            for (int column = 1; column <= row; column++) {
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
