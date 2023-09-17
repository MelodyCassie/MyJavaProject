package FunctionsAssignmentAndPractices;

public class FunctionForFactorial {
    public static int checkIfFactorial(int number){
        int factorial = 1;
        int count = 1;

        for(count = 1; count <= number; count+=1){
            factorial *= count;
        }
        return factorial;
    }

    public static void main(String[] args) {
        int result = checkIfFactorial(5);
        System.out.print(result);
    }
}
