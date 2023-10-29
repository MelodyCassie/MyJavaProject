package Assignments;

public class FunctionThatCollectsADecimalAndReturnsTheBinary {

    public static int changeToABinary(int decimal) {


            int binary = 0;
            int currentDigitPlace = 1;

            while(decimal > 0){

            int remainder = decimal % 2;

            binary += remainder * currentDigitPlace;
            decimal /= 2;
            currentDigitPlace *= 10;
            }
            return binary;
        }


    public static void main(String[] args) {
        int decimalToBinary = changeToABinary(4);
        System.out.println(decimalToBinary);
    }
}
