public class TwoSum {


//    Given an array of integers that is already sorted in ascending order, find two numbers such that they add up to a specific target number.
//
//    The function twoSum should return indices of the two numbers such that they add up to the target, where index1 must be less than index2.
//
//            Note:
//
//    Your returned answers (both index1 and index2) are not zero-based.
//    You may assume that each input would have exactly one solution and you may not use the same element twice.
//    Example:
//
//    Input: numbers = [2,7,11,15], target = 9
//    Output: [1,2]
//    Explanation: The sum of 2 and 7 is 9. Therefore index1 = 1, index2 = 2.


    public static int[] twoSum(int[] numbers, int target) {

        if (numbers == null) return null;

        int low = 0;
        int high = numbers.length - 1;

        while (low != high) {
            if (numbers[low] + numbers[high] < target) {
                low++;
            } else if (numbers[low] + numbers[high] > target) {
                high--;
            } else {
                return new int[]{low + 1, high + 1};
            }
        }

        return null;
    }

    public static void main(String args[]) {

        int[] nums = new int[]{2,7,11,15};
        int[] result = twoSum(nums, 23);
        if (result != null){
            for (int i = 0; i < result.length; i++){
                System.out.println(result[i]);
            }
        }
    }
}
