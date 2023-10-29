package MyRandomPractices;

public class FizzBuzz {
    public static void main(String[] args) {
        int count = 0;
        for(count = 1; count <= 50; count++){
            if(count % 3 == 0 && count % 5 == 0){
                System.out.println("FIZZBUZZ");
            }
            else if (count % 3 == 0){
                System.out.println("FIZZ");
            }
            else if (count % 5 == 0){
                System.out.println("BUZZ");
            }
            else
                System.out.println(count);


        }

    }

}
