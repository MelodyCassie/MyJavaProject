package MrFemiTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class OddArray {

    public static void main(String[] args) {
        int[] arrayOfNums = {2,3,-1,7,8,6};
        System.out.println(Arrays.toString(convertToOdd(arrayOfNums)));
    }
    public static int[] convertToOdd(int[] arrayOfNums){

        ArrayList<Integer> newArray = new ArrayList<>();
        for(int i = 0; i < arrayOfNums.length; i++){
            if(i % 2 == 1)
                newArray.add(arrayOfNums[i]);
        }
        int[] oddArray = new int[newArray.size()];
        for(int j = 0; j < newArray.size(); j++){
            oddArray[j]  = newArray.get(j);
        }
        return oddArray;
    }
}
