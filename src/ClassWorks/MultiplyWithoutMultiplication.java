package ClassWorks;
public class MultiplyWithoutMultiplication {
    public static int multiply(int base, int exponent) {
        if (exponent < 0) {
         int reciprocal = 1 / base;
         int result = 1;
         for (int count = 0; count > exponent; count--) {
             result *= reciprocal;
         }
          return result;
        }

        int product = 0;
        for (int count = 0; count < exponent; count++) {
            product += base;
        }
        return product;
    }

    public static void main(String[] args) {
        int result = multiply(5, -2);
        System.out.println(result);
    }
}
