public class maxSubArray {

//    Given an integer array nums, find the contiguous subarray (containing at least one number) which has the largest sum and return its sum.
//
//    Example:
//
//    Input: [-2,1,-3,4,-1,2,1,-5,4],
//    Output: 6
//    Explanation: [4,-1,2,1] has the largest sum = 6.
//    Follow up:
//
//    If you have figured out the O(n) solution, try coding another solution using the divide and conquer approach, which is more subtle.


    public static int maxSubArray(int[] nums) {

        return maxSubArray(nums, 0, nums.length - 1);
    }

    public static int maxSubArray(int[] nums, int left, int right) {


        if (left > right){
            return Integer.MIN_VALUE;
        }

        //the end of divide
        if (left == right){
            return nums[left];
        }

        //divide into 2 parts
        int middle = (left + right) / 2;

        // calculate left, right and middle max sum
        int leftMaxSum = maxSubArray(nums, left, middle - 1);
        int rightMaxSum = maxSubArray(nums, middle + 1, right);

        //calculate the middleMaxSum
        int middleMaxSum = nums[middle];
        int middleSum = middleMaxSum;

        for (int i = middle - 1; i >= left; i--) {
            middleSum += nums[i];
            if (middleSum > middleMaxSum){
                middleMaxSum = middleSum;
            }
        }

        middleSum = middleMaxSum;
        for (int j = middle + 1; j <= right; j++) {
            middleSum += nums[j];
            if (middleSum > middleMaxSum){
                middleMaxSum = middleSum;
            }
        }

        return Math.max(Math.max(leftMaxSum, rightMaxSum), middleMaxSum);
    }


    public static void main(String args[]) {

        int[] nums = new int[]{8,-19,5,-4,20};
        System.out.println(maxSubArray(nums));
    }
}
