import java.util.HashSet;
import java.util.Set;

public class IntersectionOfTwoArrays {

//    Given two arrays, write a function to compute their intersection.
//
//            Example 1:
//
//    Input: nums1 = [1,2,2,1], nums2 = [2,2]
//    Output: [2]
//    Example 2:
//
//    Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//    Output: [9,4]
//    Note:
//
//    Each element in the result must be unique.
//    The result can be in any order.

    public static int[] intersection(int[] nums1, int[] nums2) {

        if (nums1 == null || nums2 == null) return null;

        Set<Integer> numSet = new HashSet<>();
        for (int num : nums1) {
            numSet.add(num);
        }

        Set<Integer> reusltSet = new HashSet<>();
        for (int num : nums2) {
            if (numSet.contains(num)) {
                reusltSet.add(num);
            }
        }

        int[] nums = new int[reusltSet.size()];
        int i = 0;
        for (Integer num : reusltSet) {
            nums[i++] = num;
        }

        return nums;
    }

    public static void main(String args[]) {
//        int[] nums = intersection(new int[]{1,2,2,1}, new int[]{2,2});
        int[] nums = intersection(new int[]{4,9,5}, new int[]{9,4,9,8,4});
        for (int num : nums){
            System.out.print(num);
        }
    }

}
