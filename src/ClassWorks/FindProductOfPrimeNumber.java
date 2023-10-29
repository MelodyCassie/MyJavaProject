package ClassWorks;

import java.util.ArrayList;

public class FindProductOfPrimeNumber {
    public static void main(String[] args) {
        int number = 100;
        int[] primeFactorProduct = primeFactorsProduct(number);

        System.out.println("Prime Factor Product of " + number + ":");
        for (int factor : primeFactorProduct) {
            System.out.print(factor + " ");
        }
    }
    public static int[] primeFactorsProduct(int number) {
        ArrayList<Integer> primeFactors = new ArrayList<>();
        int num = number;

        while (num % 2 == 0) {
            primeFactors.add(2);
            num /= 2;
        }

        for (int i = 3; i * i <= num; i += 2) {
            while (num % i == 0) {
                primeFactors.add(i);
                num /= i;
            }
        }

        if (num > 2) {
            primeFactors.add(num);
        }

        int product = 1;
        for (int factor : primeFactors) {
            product *= factor;
        }

        int[] productArray = new int[primeFactors.size()];
        for (int i = 0; i < primeFactors.size(); i++) {
            productArray[i] = primeFactors.get(i);
        }
        return productArray;
    }
}
