import java.util.*;

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

        Map<Integer, Integer> numCountMap = new HashMap<>();
        int[] minNums = nums1.length <= nums2.length ? nums1 : nums2;
        int[] maxNums = nums1.length > nums2.length ? nums1 : nums2;

        for (int num : minNums) {
           if (numCountMap.containsKey(num)){
               numCountMap.put(num, numCountMap.get(num) + 1);
           }else {
               numCountMap.put(num, 1);
           }
        }

        List<Integer> intersectionList = new ArrayList<>();
        for (int num : maxNums) {
            Integer numCount = numCountMap.get(num);
            if (numCount != null && numCount > 0) {
                intersectionList.add(num);
                numCountMap.put(num, numCount - 1);
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
