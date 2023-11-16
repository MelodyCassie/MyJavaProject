package MyIdeas;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Time {
    private String getHour;

    public static void main(String... args) {
        Time time;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter hour");
        int hour = 0;

        try{
            hour= scanner.nextInt();
            time = new Time();
            System.out.println("Hour is "+ time .getHour);
        }
        catch(InputMismatchException joy){
            System.out.println("Oga get sense");
            main();
        }
        catch (IllegalAccessError ex){
            System.out.println("Oga type correct hour");
            main();
        }
        catch (Exception joy){
            System.out.println(joy.getMessage());
            main();
        }
    }
}


