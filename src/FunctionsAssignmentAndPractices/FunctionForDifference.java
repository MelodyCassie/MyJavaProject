package FunctionsAssignmentAndPractices;

public class FunctionForDifference {
        public static int calculatePositiveDifference(int one, int two) {
            int difference = Math.abs(one - two);

            return difference;
        }

        public static void main(String[] args) {

            int result = calculatePositiveDifference(3,89);
            System.out.println(result);
        }
}
