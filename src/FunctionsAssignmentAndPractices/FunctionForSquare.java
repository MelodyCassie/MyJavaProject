package FunctionsAssignmentAndPractices;

public class FunctionForSquare {
    public static int countFactors(int num) {
        int count = 0;

        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int factorCount = countFactors(10);
        System.out.println(factorCount);
    }
}