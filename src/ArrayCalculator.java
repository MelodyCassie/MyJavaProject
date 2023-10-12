import org.jetbrains.annotations.NotNull;

import static java.math.BigInteger.ZERO;

public class ArrayCalculator {
        public int sum(@NotNull int @NotNull [] numbers){
            int sum = 0;
            for(int index = ZERO.intValue(); index < numbers.length; index++){
                sum += numbers[index];
        }
        return sum;
    }

    public double multiply(int[] numbers) {
            int product = 1;
            for(int i = ZERO.intValue(); i < numbers.length; i++){
                product *= numbers[i];
            }
            return product;
    }

    public int average(int[] ints) {
            return sum (ints) / ints.length;

            }

    public int[] swap(int[] numbers) {
            int temp = 0;
            for(int index = 0; index < numbers.length; index++) {
                if (index < numbers.length - 3) {
                    temp = numbers[index];
                    numbers[index] = numbers[index + 2];
                    numbers[index + 2] = temp;
                }
            }
            return numbers;
        }
}


