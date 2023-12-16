package javaChapterExercises;

public class ChapterFourTwentyFive {
    public static void main(String[] args) {
        int count = 1;

        while (count <= 20){
            System.out.println(count % 3 == 1 ? "########" : "++++++++" );
            ++count;
        }
    }
}
