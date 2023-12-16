package javaChapterExercises;
import java.util.Scanner;
public class ChapterFourTwentyThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        int secondLargest = 0;
        int firstLargest = 0;

        for(int count = 1; count <= 10; count++){
            System.out.println("Enter value: ");
            int values = scanner.nextInt();

            if(values > firstLargest){
               secondLargest = firstLargest;
                firstLargest = values;
            }
            if (values > secondLargest  && values < firstLargest) {
                secondLargest = values;

            }
        }
        System.out.println("The First largest value entered is: "+firstLargest);
        System.out.println("The Second largest value entered is: "+secondLargest);

    }
}