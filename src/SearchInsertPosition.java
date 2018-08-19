public class SearchInsertPosition {

//    Example 1:
//
//    Input: [1,3,5,6], 5
//    Output: 2
//    Example 2:
//
//    Input: [1,3,5,6], 2
//    Output: 1
//    Example 3:
//
//    Input: [1,3,5,6], 7
//    Output: 4
//    Example 4:
//
//    Input: [1,3,5,6], 0
//    Output: 0


    public static int searchInsert(int[] nums, int target) {

        //empty handle
        if (nums.length == 0) {
            return -1;
        }

        int left = 0;
        int right = nums.length - 1;

        //binary search
        while (left != right) {
            int middle = (left + right) / 2;
            if (nums[middle] == target) {
                return middle;
            } else if (nums[middle] < target) {
                left = middle + 1;
            } else {
                right = middle;
            }
        }

        //last compare
        if (nums[left] >= target) {
            return left;
        } else {
            return right + 1;
        }
    }

    public static void main(String args[]) {
         int[] test = new int[]{1,3,5,6};
         System.out.println(searchInsert(test, 5));
        System.out.println(searchInsert(test, 2));
        System.out.println(searchInsert(test, 7));
        System.out.println(searchInsert(test, 0));
    }
}
