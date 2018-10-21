public class MissingNumber {

//    Given an array containing n distinct numbers taken from 0, 1, 2, ..., n, find the one that is missing from the array.
//
//            Example 1:
//
//    Input: [3,0,1]
//    Output: 2
//    Example 2:
//
//    Input: [9,6,4,2,3,5,7,0,1]
//    Output: 8
//    Note:
//    Your algorithm should run in linear runtime complexity. Could you implement it using only constant extra space complexity?

    public int missingNumber(int[] nums) {

        //count sum for no missing
        int sum = 0;
        for (int i = 0; i <= nums.length; i++){
            sum += i;
        }

        //find the miss
        for (int num : nums) {
            sum -= num;
        }
        return sum;
    }

    public static void main(String args[]) {
//        int[] nums = new int[]{9,6,4,2,3,5,7,0,1};
        int[] nums = new int[]{0, 1};
//        int[] nums = new int[]{3,0,1};
        System.out.println(new MissingNumber().missingNumber(nums));
    }
}
