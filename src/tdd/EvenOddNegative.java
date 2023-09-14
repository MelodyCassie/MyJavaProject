package tdd;

public class EvenOddNegative {
    public boolean evenOddOrNegative(int input){
        if (input % 2 == 0) {
            System.out.println(+input + "  Is an Even Number");
        } else if (input <= 0) {
            System.out.println(+ input + "  Is a Negative Number");
        }
        else {
        System.out.println(+ input + "  Is an Odd Number ");
        }
        return true;

    }

}
