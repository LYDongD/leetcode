import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class ContainsDuplicate {

//    Given an array of integers, find if the array contains any duplicates.
//
//    Your function should return true if any value appears at least twice in the array, and it should return false if every element is distinct.
//
//    Example 1:
//
//    Input: [1,2,3,1]
//    Output: true
//    Example 2:
//
//    Input: [1,2,3,4]
//    Output: false
//    Example 3:
//
//    Input: [1,1,1,3,3,4,3,2,4,2]
//    Output: true

    public boolean containsDuplicate(int[] nums) {
        Set<Integer> numSet = new HashSet<>();
        for (int num : nums) {
            if (numSet.contains(num)) {
                return true;
            } else {
                numSet.add(num);
            }
        }
        return false;
    }

    public static void main(String args[]) {
        int[] nums = new int[]{1,2,3,1};
        int[] nums1 = new int[]{1,2,3,4};
        int[] nums2 = new int[]{1,1,1,3,3,4,3,2,4,2};
        System.out.println(new ContainsDuplicate().containsDuplicate(nums));
        System.out.println(new ContainsDuplicate().containsDuplicate(nums1));
        System.out.println(new ContainsDuplicate().containsDuplicate(nums2));
    }

}
