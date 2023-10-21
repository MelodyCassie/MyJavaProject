package Taskss;

public class FunctionOfStringsThatReturnInt {
    public static int countStringNumbers(String[] arrayOfStrings) {
        int holdsAllNumbersInString = 0;

        for(String str : arrayOfStrings){
            for(int count = 0; count < str.length(); count++){
                char number = str.charAt(count);
                if (number >= '0' && number <= '9'){
                    holdsAllNumbersInString ++;
                }
            }
        }
        return holdsAllNumbersInString;
    }

    public static void main(String[] args) {
        String[] arrayOfStrings = {"melly245","melody888","melody848"};
        int totalCount = countStringNumbers(arrayOfStrings);
        System.out.println("the sum of all the numbers in this string of array is" + totalCount);


    }
}

