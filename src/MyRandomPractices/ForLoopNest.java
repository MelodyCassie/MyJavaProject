package MyRandomPractices;
public class ForLoopNest {
//local variable
private static int printStars(int numberOfStars) {


    for (int count = 0; count < numberOfStars; count++) {
        System.out.print("* ");

    }

    return numberOfStars;
}

    public static void main(String[] args) {
        int input = printStars(100);
        System.out.println(input);
    }

 }

