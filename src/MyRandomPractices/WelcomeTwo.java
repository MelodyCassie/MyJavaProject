package MyRandomPractices;

import java.util.Scanner;
public class WelcomeTwo{
    public static void main(String[] args) {

        Scanner name = new Scanner(System.in);

        System.out.println("Enter first name: ");
        String name1 = name.nextLine();

        System.out.println("Enter last name: ");
        String name2 = name.nextLine();

        System.out.printf("Hello  %s %s" + "  " ,name1 ,name2 );



    }


}
