package MrFemiTasks;

import java.util.Arrays;

public class ArrangeArray {
    public static void main(String[] args) {
        int[] arrayOfNums = {-3, 2,3,4,5,6,7,8};
        System.out.println(Arrays.toString(arrangeArray(arrayOfNums)));

    }
    public static int[] arrangeArray(int[] arrayOfNums){
        for(int i = 0; i < arrayOfNums.length; i++) {
            arrayOfNums[i] *= arrayOfNums[i];
        }
        for(int i = 0; i < arrayOfNums.length - 1; i+=2){
             if(arrayOfNums[i] > arrayOfNums[i + 1]) {
                 int temp = arrayOfNums[i + 1];
                 arrayOfNums[i + 1] = arrayOfNums[i];
                 arrayOfNums[i] = temp;
             }

        }
        return arrayOfNums;
    }
}
