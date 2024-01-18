package MrFemiTasks;

import java.util.ArrayList;

public class ArrayPosition {
        public static void main(String[] args) {
            int[] arrayOfNums = {1, 3, 2, -7};
            System.out.println(checkOccurrence(arrayOfNums));
        }

        public static ArrayList<Integer> checkOccurrence(int[] arrayOfNums) {
            ArrayList<Integer> arrayList = new ArrayList<>();

            for (int i = 0; i < arrayOfNums.length; i++) {
                int count = 0;

                for (int j = 0; j < arrayOfNums.length; j++) {
                    if (arrayOfNums[j] < arrayOfNums[i]) {
                        count++;
                    }
                }

                arrayList.add(count);
            }
            return arrayList;
        }

}
