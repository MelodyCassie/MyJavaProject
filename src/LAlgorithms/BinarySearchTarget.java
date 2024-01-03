package LAlgorithms;

public class BinarySearchTarget {
    public static int check(int[] arr, int targetValue){
        int start = 0;
        int stop = arr.length - 1;
        int mid = start + stop / 2;

        for(int i = 0; i < arr.length; i ++){
            if (arr[mid] == targetValue)
                return mid;
            else if (arr[mid] < targetValue)
                return start = mid + 1;
            else return stop = mid - 1;
        }
        return -1;

    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,5,4,5,6,7,5,7};
        int targetValue = 4;
        int result = check(arr,targetValue);
        System.out.println(result);
    }
}
