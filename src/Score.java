//Write a java program prompting the user to enter scores ranging from 0 and 100 where 90-100 is A, 80-89 is B, 70-79 is C, 60-69 is D, less than 60 Print F with the pseudocode
import java.util.Scanner;
public class Score {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("ENTER A STUDENTS SCORE FROM 0 - 100" + ' ');
        int score = scanner.nextInt();

        if (score >= 90 && score <= 100) {
            System.out.println("A");
        }
        if (score >= 80 && score <= 89) {
            System.out.println("B");
        }
        if (score >= 70 && score <= 79) {
            System.out.println("C");
        }
        if (score < 60) {
            System.out.println("F");
            }
        }
    }
