import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class IntersectionOfTwoArrays2 {

//    Given two arrays, write a function to compute their intersection.
//
//            Example 1:
//
//    Input: nums1 = [1,2,2,1], nums2 = [2,2]
//    Output: [2,2]
//    Example 2:
//
//    Input: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
//    Output: [4,9]
//    Note:
//
//    Each element in the result should appear as many times as it shows in both arrays.
//    The result can be in any order.
//    Follow up:
//
//    What if the given array is already sorted? How would you optimize your algorithm?
//    What if nums1's size is small compared to nums2's size? Which algorithm is better?
//    What if elements of nums2 are stored on disk, and the memory is limited such that you cannot load all elements into the memory at once?

    public static int[] intersect(int[] nums1, int[] nums2) {
        if (nums1 == null || nums2 == null) return null;

        Set<Integer> numSet = new HashSet<>();
        int[] minNums = nums1.length <= nums2.length ? nums1 : nums2;
        int[] maxNums = nums1.length > nums2.length ? nums1 : nums2;

        for (int num : minNums) {
            numSet.add(num);
        }

        List<Integer> intersectionList = new ArrayList<>();
        for (int num : maxNums) {
            if (numSet.contains(num)) {
                intersectionList.add(num);
            }
        }

        int[] intersectionNums = new int[intersectionList.size()];
        int i = 0;
        for (Integer num : intersectionList) {
            intersectionNums[i++] = num;
        }

        return intersectionNums;
    }

    public static void main(String args[]) {
//        int[] nums = intersect(new int[]{1,2,2,1}, new int[]{2,2});
        int[] nums = intersect(new int[]{4,9,5}, new int[]{9,4,9,8,4});
        for (int num : nums){
            System.out.print(num);
        }
    }
}
