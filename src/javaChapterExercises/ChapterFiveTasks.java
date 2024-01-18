package javaChapterExercises;

import java.util.Arrays;
import java.util.Scanner;

public class ChapterFiveTasks {
    public static void main(String[] args) {
        int sum = 0;
        for(int i = 1; i <= 99; i+=2){
            sum+=i;
        }
        System.out.println(sum);

        System.out.println("_________________________________________________");

        double value = Math.pow(2.5, 3);
        System.out.println(value);

        System.out.println("__________________________________________________");


        int i = 1;
        while (i <= 20){
            System.out.println(i);
            if(i % 5 == 0)
                System.out.println();
            else
                System.out.print('\t');
            i++;
        }


        System.out.println("___________________________________________");

        for(int j = 1; j <= 20; j++){
            System.out.println(j);
            if(j % 5 == 0)
                System.out.println();
            else
                System.out.print("\t");
        }

        System.out.println("______________________________________________");


        for(int k = 1; k != 10; k++){
            System.out.println((double) k / 10);
        }

        System.out.println("_______________________________________________");

        int count = 1;
        while(count <= 10)
            System.out.println(count++);


        System.out.println("_______________________________________________");
        System.out.println("_______________________________________________");

        for(int j = 19; j >= 1; j--){
            System.out.print(j + " ");
        }

        System.out.println("________________________________________________");
        System.out.println("________________________________________________");

        int counter = 0;
        do {
            System.out.println(counter+=2);
        }
        while (counter <= 51);

        System.out.println("________________________________________________");
        System.out.println("________________________________________________");


        Scanner scanner = new Scanner(System.in);
        for(int j = 1; j < 3; j++){
            for(int k = 1; k < 5; k++)
                System.out.print("*");
            System.out.println("\n#####");
        }


    }
}
