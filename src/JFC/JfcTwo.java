package JFC;
import java.util.Random;

public class JfcTwo {
    public static void main(String[] args) {

        Random randomNumbers = new Random();

        int firstRandomNums = randomNumbers.nextInt(10) + 5;
        System.out.println(firstRandomNums);

        double secondRandomNums = randomNumbers.nextDouble();
        System.out.println(secondRandomNums);

        boolean thirdRandom = randomNumbers.nextBoolean();
        System.out.println(thirdRandom);

    }
}
