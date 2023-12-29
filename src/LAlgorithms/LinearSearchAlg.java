package LAlgorithms;

public class LinearSearchAlg {
    public static int search(int[] arr, int target){
        int count = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target)
                count ++;

        }
        return count;

    }

    public static void main(String[] args) {
        int[] arr = {2,3,5,7,8,7,6,4,4,5,4,5};
        int target = 4;

        int result = search(arr,target);
        System.out.println(result);

    }




}
