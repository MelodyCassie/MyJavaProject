package javaChapterExercises;

public class ChapterFourSix {
    public static void main(String[] args) {
        int sum = 0;
        int x = 1;
        sum+=x;
        System.out.println("The Sum Is: " + sum );

        while(x <= 10){
            sum += x;
            ++x;
        }
        System.out.println(sum);



    }

}
