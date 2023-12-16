package javaChapterExercises;

public class ChapterFourTwentyTwo {
    public static void main(String[] args) {
        System.out.print("N");
        System.out.print("    ");
        System.out.print("N2");
        System.out.print("    ");
        System.out.print("N3");
        System.out.print("   ");
        System.out.print("N4");

        System.out.println();

        for(int i = 1; i <= 5; i++) {

            System.out.print(i);
            System.out.print("     ");


            int N2 =  i * i;
            System.out.print(N2);
            System.out.print("     ");

            int N3 = N2 * i;
            System.out.print(N3);
            System.out.print("    ");

            int N4 = N3 * i;
            System.out.print(N4);


            System.out.println();





        }




    }
}