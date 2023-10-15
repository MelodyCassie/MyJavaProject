package Assignments;

import java.util.Scanner;

public class StudentsGradeCalculator {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("How many students do you have? ");
        int numberOfStudents = input.nextInt();

        System.out.println("How many subjects are they offering? ");
        int numberOfSubjects = input.nextInt();

            System.out.println("""
                    Saving >>>>>>>>>>>>>>>>>>
                    Saved Successfully.
                    """);

       int [][] studentAnalysis = new int[numberOfStudents][numberOfSubjects];

       for(int i = 0; i < numberOfStudents; i++){
           for(int j = 0; j < numberOfSubjects; j++){
               System.out.println("Entering score for student " + (i + 1) + "..." );
               System.out.println(" ");
               System.out.print("Enter student" + "  " + (i + 1) + " " + "score for subject " + (j + 1) + " :");
               studentAnalysis[i][j] = input.nextInt();


           }
           System.out.println("  ");
       }

       System.out.println("==========================================================================");
       System.out.print("STUDENT" + "     ");



       for(int k = 0 ; k < numberOfSubjects; k++) {
           System.out.print("SUB" + (k + 1) + "     ");
       }
       System.out.print("TOT" + "     ");
       System.out.print("AVE" + "     ");
       System.out.println("POS" + "     ");

       System.out.println("==============================================================================");


        int tot = 0;
        int average = 0;

        for(int s = 0; s < numberOfStudents; s++){
            System.out.print("STUDENT " + (s + 1) + "     " );
            for(int count = 0; count < numberOfStudents; count++) {
                for (int index = 0; index < numberOfSubjects; index++) {

                    System.out.print(studentAnalysis[count][index]);
                    System.out.print("  ");

                    tot += studentAnalysis[count][index];


                }
            }
            System.out.print("the sum "+tot);


                average = tot / studentAnalysis.length;
                System.out.print("the average "+average);

       }


    }
}

