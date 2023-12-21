package JFC;

import java.util.Scanner;

public class JfcTwoProject {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        double sideZ;

        System.out.println("Enter side x: ");
        double sideX = input.nextDouble();

        System.out.println("Enter side y: ");
        double sideY = input.nextDouble();

        sideZ = Math.sqrt((sideX*sideX)+(sideY*sideY));
        double roundDown = Math.floor(sideZ);
        System.out.println("The hypotenuse of the triangle is " + roundDown);



    }
}
