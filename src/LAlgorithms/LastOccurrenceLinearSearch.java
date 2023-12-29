package LAlgorithms;

public class LastOccurrenceLinearSearch {
    public static int checkLastOccurrence(int[] array, int value){
        for(int i = array.length - 1; i >= 0; i--){
            if(array[i] == value)
                return i;
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arrayOfNums = {1,2,3,1,1,2,3};
        int value = 1;
        int result = checkLastOccurrence(arrayOfNums, value);
        System.out.println(result);

    }
}
