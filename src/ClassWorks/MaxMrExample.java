package ClassWorks;

public class MaxMrExample {
    public static int max(int ... somethingElse){
        int max = somethingElse[0];

        for(int index = 0; index < somethingElse.length; index++){

            if(somethingElse[index] > max){
                max = somethingElse[index];
            }

        }
        return max;
    }
    public static int max2(int[] numbers) {
        int max2 = numbers[0];
        for(int count = 0; count < numbers.length;count++){
            if(numbers[count] > max2) {
            max2 = numbers[count];
            }
        }
        return  max2;
    }



}
