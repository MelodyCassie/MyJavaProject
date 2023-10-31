package MyArrayPractice;

import java.util.ArrayList;
import java.util.Arrays;

public class CommonElementInArrays {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {30, 40, 50, 60, 70};

        int[] commonElement = findCommonElements(array1,array2);
        System.out.println(Arrays.toString(commonElement));

    }

    public static int[] findCommonElements(int[] array1, int[] array2) {
        ArrayList<Integer> commonElements = new ArrayList<>();

        for(int i = 0; i < array1.length; i++){
            for(int j = 0; j < array2.length; j++){
                if (array1[i] == array2[j]){
                    commonElements.add(array1[i]);
                }
            }
        }
        int[] resultArray = new int[commonElements.size()];
        for(int k = 0; k < commonElements.size(); k++){
            resultArray[k] = commonElements.get(k);
        }
        return resultArray;


    }
}
