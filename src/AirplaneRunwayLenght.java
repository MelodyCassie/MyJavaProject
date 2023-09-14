import java.util.Scanner;

public class AirplaneRunwayLenght {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Airplanes Takeoff Speed: ");
        double takeoffSpeed = scanner .nextDouble();

        System.out.println("Enter Airplanes Acceleration: ");
        double acceleration = scanner.nextDouble();

        double speed = 60;
        double power = 2;
        double accelerate = 3.5;
        double times = 2;

        double speedMultiply = speed * speed;
        double accelerateTimes = accelerate * times;

        double lenght = speedMultiply / accelerateTimes;

        System.out.println("THE MINIMUM RUNWAY LENGTH OF THE AIRPLANE IS: " +  lenght);
    }
}
