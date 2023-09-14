import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter Principal");
        int principal = scanner.nextInt();

        System.out.println("Enter Rate");
        int rate = scanner.nextInt();

        System.out.println("Enter Time");
        int time = scanner.nextInt();

       int product =  principal * rate * time /100;

       System.out.println("The Simple Interest is"+ ' ' + product);
    }
}
