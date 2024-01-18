package MrFemiTasks;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        TwoSum twoSum = new TwoSum();
        int[] arrayOfNums = {2,7,11,15};
        int target = 9;
        int[] result = twoSum.checkToSum(arrayOfNums,target);
        System.out.println(result[0] + result[1]);

    }

    public int[] checkToSum(int[] arrayOfNums, int target){

        Map<Integer, Integer> integerMap = new HashMap<>();

        for(int i = 0; i < arrayOfNums.length; i++){
            int check = target - arrayOfNums[i];
            if(integerMap.containsKey(check)){
                return new int[] {
                        integerMap.get(check),i

                };
            }
            integerMap.put(arrayOfNums[i],i);
        }
        throw new IllegalArgumentException("No two sum solution...");
    }
}
