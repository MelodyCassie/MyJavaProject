package MyRandomPractices;

public class Power {
    public static int raiseToPower(int base, int exponential) {
        int product = 0;
        int index = 1;


        for (index = 1; index <= exponential; index++) {
            product += base;
         }
        return product;
    }
    public static void main(String[] args) {
        int result = raiseToPower(10,10);
        System.out.println(result);
    }
}

