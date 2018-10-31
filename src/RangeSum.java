public class RangeSum {

    int[] sums;

    public RangeSum(int[] nums) {

        //dummy node for nums[0], default 0
        sums = new int[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            sums[i + 1] = sums[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return sums[j + 1] - sums[i];
    }

    public static void main(String args[]) {
        int[] nums = new int[]{-2, 0, 3, -5, 2, -1};
        System.out.println(new RangeSum(nums).sumRange(0,2));
    }
}
