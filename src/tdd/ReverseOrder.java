package tdd;

public class ReverseOrder {
    public static int reverse(int input){
        int reversal = 0;

        while (input != 0){
            int modulo = input % 10;
            reversal = reversal * 10 + modulo;
            input/=10;
        }
        return reversal;

    }
}
