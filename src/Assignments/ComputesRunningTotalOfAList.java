package Assignments;
import java.util.ArrayList;
import java.util.List;
public class ComputesRunningTotalOfAList {


    public class RunningTotal {
        public static List<Integer> computeRunningTotal(List<Integer> numbers) {
            List<Integer> runningTotal = new ArrayList<>();
            int total = 0;

            for (int number : numbers) {
                total += number;
                runningTotal.add(total);
            }

            return runningTotal;
        }

        public static void main(String[] args) {
            List<Integer> numbers = List.of(1, 2, 3, 4, 5);
            List<Integer> result = computeRunningTotal(numbers);
            System.out.println("Running Total: " + result);
        }
    }

}
