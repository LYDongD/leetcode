public class RemoveElement {

//    Given nums = [3,2,2,3], val = 3,
//
//    Your function should return length = 2, with the first two elements of nums being 2.
//
//    It doesn't matter what you leave beyond the returned length.


    public static int removeElement(int[] nums, int val) {

        int unmatchLatestIndex = -1;
        for (int i = 0; i < nums.length; i++) {
            //update the un_match_latest_index and replace the element
            if (nums[i] != val) {
                unmatchLatestIndex++;
                nums[unmatchLatestIndex] = nums[i];
            }
        }

        return unmatchLatestIndex + 1;
    }

    public static void main(String args[]) {
        int[] nums =  new int[]{2};
        int length = removeElement(nums, 2);
        System.out.println(length);
        for (int i = 0; i < length; i++){
            System.out.print(nums[i]);
            System.out.print(" ");
        }
    }
}
