
public class RemoveDuplicate {


//    Given nums = [0,0,1,1,1,2,2,3,3,4],
//
//    Your function should return length = 5, with the first five elements of nums being modified to 0, 1, 2, 3, and 4 respectively.
//
//    It doesn't matter what values are set beyond the returned length.


    public static int removeDuplicates(int[] nums) {

        if (nums.length == 0) {
            return 0;
        }

        int noDuplicateIndex = 0;
        for (int i = 1; i < nums.length; i++) {

            //update noDuplicateIndex
            if (nums[noDuplicateIndex] != nums[i]) {
                noDuplicateIndex++;
                nums[noDuplicateIndex] = nums[i];
            }
        }

        return noDuplicateIndex + 1;
    }


    public static void main(String args[]) {

        int[] nums = new int[]{1,1,2};

        int length = removeDuplicates(nums);

        for (int i = 0 ; i < length; i++){
            System.out.print(nums[i]);
            System.out.print(" ");
        }
    }
}
