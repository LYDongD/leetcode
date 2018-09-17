import java.util.HashMap;
import java.util.Map;

public class MajorityElement {

//    Given an array of size n, find the majority element. The majority element is the element that appears more than ⌊ n/2 ⌋ times.
//
//    You may assume that the array is non-empty and the majority element always exist in the array.
//
//    Example 1:
//
//    Input: [3,2,3]
//    Output: 3
//    Example 2:
//
//    Input: [2,2,1,1,1,2,2]
//    Output: 2

    public static int majorityElement(int[] nums) {

        int count = 0;
        int majority = 0;
        for (int num : nums) {
            if (count == 0) {
                majority = num;
                count++;
                continue;
            }

            if (majority == num) {
                count++;
            } else {
                count--;
            }
        }

        return majority;
    }


    public static void main(String args[]) throws Exception {
        int[] nums = new int[]{2, 2, 1, 1, 1, 2, 2};
        System.out.println(majorityElement(nums));

    }

}
