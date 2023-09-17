package FunctionsAssignmentAndPractices;

public class FunctionForEvenAndOddNumbers {
    public static boolean checkIfNumberIsEvenOrOdd(int condition) {
        if (condition % 2 == 0) {
            return true;
        }
        else
            return false;
    }

    public static void main(String[] args) {
        boolean check = checkIfNumberIsEvenOrOdd(8);
        System.out.println(check);
    }
}

