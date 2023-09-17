package javaChapterExercises;
public class ForLoopNest {
//local variable
private static void printStars(int numberOfStars) {


    for (int count = 0; count < numberOfStars; count++) {
        printStars(numberOfStars);
        System.out.print("* ");
    }
  }
 }

