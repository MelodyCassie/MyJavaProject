import java.util.List;
import java.util.ArrayList;

public class functionThatReturnsHighestAndLowest {
    public static int sumListWithoutValue(List<Integer> numbers) {
        int sum = 0;
        for (int number : numbers) {
                sum += number;

        }
        return sum;
    }

    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(3);
        numbers.add(4);
        numbers.add(1);
        numbers.add(2);
        int ten = numbers.get(3) + numbers.get(4) + numbers.get(1)+numbers.get(2);
        int twelve = numbers.get(5) + numbers.get(4) + numbers.get(1) + numbers.get(2);
        int eleven = numbers.get(5) + numbers.get(3) + numbers.get(1) + numbers.get(2);
        int fourteen = numbers.get(5) + numbers.get(4) + numbers.get(3) + numbers.get(2);
        int thirteen = numbers.get(5) + numbers.get(1) + numbers.get(4) + numbers.get(3);

        System.out.println(fourteen);
        System.out.println(ten);
    }
}

