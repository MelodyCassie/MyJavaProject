package JavaScriptTasks;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAdd {
    public static void main(String[] args) {

        int[] arr = {2,3,5,6,7,2};
        ArrayList<Integer> result = addNums(arr);
        System.out.println(Arrays.toString(result.toArray()));
    }
    public static ArrayList<Integer> addNums(int[] arr){

        ArrayList<Integer> plus = new ArrayList<>();

        for(int i = 0; i <= arr.length -1; i+=2) {

//            int firstIndex = arr[i];
//            int secondIndex = arr[i + 1];

            int storeLastIndex = arr.length-1;
            plus.add(arr[i] + arr[i + 1]);
            if(arr.length % 2 != 0){
                plus.add(arr[storeLastIndex]);
            }
           else System.out.println();        }
        return plus ;
    }
}
