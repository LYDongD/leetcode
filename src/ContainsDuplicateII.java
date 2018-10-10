import java.util.HashMap;
import java.util.Map;

public class ContainsDuplicateII {

//    Given an array of integers and an integer k, find out whether there are two distinct indices i and j in the array such that nums[i] = nums[j] and the absolute difference between i and j is at most k.
//
//    Example 1:
//
//    Input: nums = [1,2,3,1], k = 3
//    Output: true
//    Example 2:
//
//    Input: nums = [1,0,1,1], k = 1
//    Output: true
//    Example 3:
//
//    Input: nums = [1,2,3,1,2,3], k = 2
//    Output: false


    public boolean containsNearbyDuplicate(int[] nums, int k) {

        Map<Integer, Integer> numsMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (numsMap.containsKey(nums[i])) {
                if (i - numsMap.get(nums[i]) <= k) {
                    return true;
                }
            }

            numsMap.put(nums[i], i);
        }

        return false;
    }

    public static void main(String args[]) {
        int[] nums = new int[]{1,2,3,1};
        System.out.println(new ContainsDuplicateII().containsNearbyDuplicate(nums, 3));

        int[] nums2 = new int[]{1,0,1,1};
        System.out.println(new ContainsDuplicateII().containsNearbyDuplicate(nums2, 1));

        int[] nums3 = new int[]{1,2,3,1,2,3};
        System.out.println(new ContainsDuplicateII().containsNearbyDuplicate(nums3, 2));
    }
}
