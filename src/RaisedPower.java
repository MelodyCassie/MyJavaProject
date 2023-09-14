import java.util.Scanner;

public class RaisedPower {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a Whole Number");
        int whole = scanner.nextInt();

        System.out.println("Enter an Exponential");
        int exponential = scanner.nextInt();

        int result=1;
        int index = 1;

        for (index = 1; index <= exponential; index++) {
            result = result * whole * index;
        }
        System.out.println(result);
    }
}
