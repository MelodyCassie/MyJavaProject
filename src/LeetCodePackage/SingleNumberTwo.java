package LeetCodePackage;

public class SingleNumberTwo {
    public int singleNumber(int[] nums){
        int singleCheck = 0;
        int num = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != singleCheck){
                num = singleCheck;

            }

        }
        return num;
    }


    public static void main(String[] args) {
        SingleNumberTwo singleNumberTwo = new SingleNumberTwo();

        int[] nums = {2,2,3,2};
        int result = singleNumberTwo.singleNumber(nums);

        System.out.println(result);

    }
}
