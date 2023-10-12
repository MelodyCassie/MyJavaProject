import java.util.Arrays;

public class FunctionThatReturnsMinAndMaxOfSum {
        public static void main(String[] args) {
            int[] numbers = {5, 3, 4, 1, 2};
            int[] result = findMinMax(numbers);

            System.out.println("Minimum: " + result[0]);
            System.out.println("Maximum: " + result[1]);
        }

        public static int[] findMinMax(int[] numbers) {
            int min = numbers[0];
            int max = numbers[0];

            for (int i = 1; i < numbers.length; i++) {
                if (numbers[i] < min) {
                    min = numbers[i];
                }
                if (numbers[i] > max) {
                    max = numbers[i];
                }
            }

            int[] result = {min, max};
            return result;
        }
    }


