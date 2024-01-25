package JohnatansTasks;


public class NotDuplicateArray {
    public static void main(String[] args) {
        NotDuplicateArray notDuplicateArray = new NotDuplicateArray();
        int[] arrayOfNums = {2,2,2,3,3,5};
        int result = notDuplicateArray.findSingleNumber(arrayOfNums);
        System.out.println(result);

    }
    public int findSingleNumber(int[] arrayOfNums){

        int currentIndex = 0;
        for(int i = 0; i < arrayOfNums.length; i++){
            currentIndex ^= arrayOfNums[i];
        }
        return currentIndex;


    }
}
