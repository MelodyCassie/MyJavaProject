package JohnatansTasks;

public class NotDuplicateTwo {

    public static void main(String[] args) {
        NotDuplicateTwo notDuplicateTwo = new NotDuplicateTwo();
        int[] arrayOfNums = {2,2,3,1,3};
        int result = notDuplicateTwo.findSingleNumber(arrayOfNums);
        System.out.println(result);

    }

    public int findSingleNumber(int[] arrayOfNums) {
        int currentIndex = 0;
        int counter = 0;
        for (int index = 0; index < arrayOfNums.length; index++) {
            for (int indices = 0; indices < arrayOfNums.length; indices++) {
                if (arrayOfNums[index] == arrayOfNums[indices]) {
                    counter += 1;
                }
            }
            if(counter ==  1){
                currentIndex = arrayOfNums[index];
            }
            counter = 0;
        }
        return currentIndex;
    }
}