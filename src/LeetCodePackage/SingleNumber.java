package LeetCodePackage;

public class SingleNumber {
    public int singleNumber(int[] arrayOfNums){
        int currentIndex = 0;
        for(int i = 0; i < arrayOfNums.length; i++ ){
            currentIndex^= arrayOfNums[i];
        }
        return currentIndex;

    }

    public static void main(String[] args) {
        SingleNumber singleNumber = new SingleNumber();
        int[] arrayOfNums = {2,2,1};
        int result = singleNumber.singleNumber(arrayOfNums);
        System.out.println(result);

    }
}
