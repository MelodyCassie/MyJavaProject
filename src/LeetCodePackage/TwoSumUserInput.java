package LeetCodePackage;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class TwoSumUserInput {
    public int[] twoSum (int[] arrayOfNums, int target){

        Map<Integer,Integer> map = new HashMap<>();

        for(int i = 0; i < arrayOfNums.length; i ++){
            int complement = arrayOfNums[i] - target;

            if(map.containsKey(complement)){
                return new int[]{
                        map.get(complement), i
                };
            }
            map.put(arrayOfNums[i], i);
        }
        throw new IllegalArgumentException("Not found.");

    }

    public static void main(String[] args) {
        TwoSumUserInput twoSumUserInput = new TwoSumUserInput();

        Scanner scanner = new Scanner(System.in);


        System.out.println("Enter the length of the array ");
        int lengthOfArray = scanner.nextInt();

        int[] arrayOfNums = new int[lengthOfArray];

        for(int i = 0; i < lengthOfArray; i ++){
            System.out.println("Enter element" + ( i + 1));
            arrayOfNums[i] = scanner.nextInt();
        }

        System.out.println("Enter the target number");
        int target = scanner.nextInt();


        int[] result = twoSumUserInput.twoSum(arrayOfNums, target);

        System.out.println("The answer is: " + "[" + result[0] + "," + result[1] + "]");


    }

}
