import java.util.Scanner;

public class RaiseToPower {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a base Number:");
        int base = scanner.nextInt();

        System.out.println("Enter Exponential Number:");
        int exponential = scanner.nextInt();

        int result = 0;

        for (int count = 1; count <= exponential; count++) {
            result = (exponential * base);
        }

        System.out.println(result);
    }
}
