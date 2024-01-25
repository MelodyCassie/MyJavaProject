package JohnathansTask;

import java.util.ArrayList;
import java.util.Arrays;
public class ArrayPlusOne {
        public static void main(String[] args) {
            ArrayPlusOne arrayPlusOne = new ArrayPlusOne();
            int[] arrayOfNums = {4, 3, 2, 1};
            int[] result = arrayPlusOne.addOne(arrayOfNums);
            System.out.println(Arrays.toString(result));
        }

        public int[] addOne(int[] arrayOfNums) {
            String number =  "";
            for(int count = 0; count< arrayOfNums.length;count++){
                String result =  String.valueOf(arrayOfNums[count]);
                number += result;
            }
            int result = Integer.parseInt(number) + 1;
            String r = String.valueOf(result);

            int[] newArray = new int[r.length() ];
            for(int i = 0; i < r.length(); i++){
                int num = Integer.parseInt(String.valueOf(r.charAt(i)));
               newArray[i] = num;
            }
            return newArray;
        }


}
