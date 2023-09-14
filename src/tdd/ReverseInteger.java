package tdd;

public class ReverseInteger {
public int reverse(int number){
    int reversal = 0;

    while ( number!= 0){
        int modulo = number % 10;
        reversal = reversal * 10 + modulo;
        number/= 10;
    }
    return reversal;

}

}
