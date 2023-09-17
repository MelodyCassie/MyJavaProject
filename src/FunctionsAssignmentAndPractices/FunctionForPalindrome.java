package FunctionsAssignmentAndPractices;

public class FunctionForPalindrome {
    public static boolean checkIfPalindrome(int number) {
            int originalNumber = number;
            int reverseNumber = 0;

            while (number > 0) {
                int lastDigit = number % 10;
                reverseNumber = reverseNumber * 10 + lastDigit;
                number /= 10;
            }

            return originalNumber == reverseNumber;
        }

        public static void main(String[] args) {
            boolean result = checkIfPalindrome(54145);
            System.out.println(result);
        }
    }
