package Assignments;

public class FunctionThatCollectsABinaryAndReturnsADecimal {
        public static int changeToDecimal(int binary) {
            int decimal = 0;
            int binaryDigitPlace = 1;

            while (binary > 0) {
                int lastDigit = binary % 10;
                decimal += lastDigit * binaryDigitPlace;
                binary /= 10;
                binaryDigitPlace *= 2;
            }

            return decimal;
        }

        public static void main(String[] args) {
            int decimalResult = changeToDecimal(100);
            System.out.println(decimalResult);
        }
}








