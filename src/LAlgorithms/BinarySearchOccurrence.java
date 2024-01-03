package LAlgorithms;
public class BinarySearchOccurrence {
    public static int lastOccurrenceCheck(int[] arrayOfNums, int targetValue){
        int start = 0;
        int stop = arrayOfNums.length - 1;
        while (start <= stop) {
            int mid = start + (stop - start) / 2;

            if (arrayOfNums[mid] == targetValue){
                if(mid == 0 || arrayOfNums[mid - 1] != targetValue){
                    return mid;
                }
                else {
                    stop = mid - 1;
                }

            } else if (arrayOfNums[mid] < targetValue) {
                start = mid + 1;
            }
            else stop = mid - 1;



        }
        return -1;


    }

    public static void main(String[] args) {
        int[] arrayOfNums = {2,3,4,5,2,3,4,2,2,3,4,5};
        int targetValue = 5;
        int result = lastOccurrenceCheck(arrayOfNums, targetValue);
        System.out.println(result);


    }
}
