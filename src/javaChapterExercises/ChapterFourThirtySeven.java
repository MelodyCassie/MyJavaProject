package javaChapterExercises;

import java.util.Scanner;

public class ChapterFourThirtySeven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the x and y coordinate for point one: ");
        int x1 = scanner.nextInt();
        int y1 = scanner.nextInt();

        System.out.println("Enter the x and y coordinate for point two: ");
        int x2 = scanner.nextInt();
        int y2 = scanner.nextInt();

        if (x1 == x2){
            System.out.println("The point are located on a line perpendicular to y axis.");
        } else if (y1 == y2) {
            System.out.println("The point are located on a line perpendicular to x axis.");

        }
        else
            System.out.println("The point are not located on a line perpendicular to any axis.");
    }
}
