package FunctionsAssignmentAndPractices;

public class FunctionForQuotient {
    public static double calculateQuotient(int numerator, int denominator) {
        if (denominator == 0) {
            return 0.0;
        } else {
            double quotient = (double) numerator / denominator;
            return Math.round(quotient * 100.0) / 100.0;
        }
    }

    public static void main(String[] args) {

        double result = calculateQuotient(4,7);
        System.out.println(result);
    }
}
