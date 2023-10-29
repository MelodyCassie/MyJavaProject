package ClassWorks;

public class ArrayOfNumbersRemoveDuplicates {

    public int[] remove(int[] numbers) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == numbers[i]) {
                numbers[i] = 0;
            }
        }
        int length = countUniqueValuesArray(numbers);
        numbers = StripArray(numbers, length);
        return numbers;
    }

    private int[] StripArray(int[] numbers, int length) {

    int [] array = new int[length];
    int count = 0;
    for(int i = 0; i < numbers.length; i++){
        if(numbers [i] != 0) {
            array[count] = numbers[i];
            count++;

        }
    }
    return array;
    }

    private int countUniqueValuesArray(int[] numbers) {
        int length = 0;
        return length;
    }
}



