public class ClimbStairs {

//    You are climbing a stair case. It takes n steps to reach to the top.
//
//    Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
//
//    Note: Given n will be a positive integer.
//
//    Example 1:
//
//    Input: 2
//    Output: 2
//    Explanation: There are two ways to climb to the top.
//    1. 1 step + 1 step
//    2. 2 steps

//    Example 2:
//
//    Input: 3
//    Output: 3
//    Explanation: There are three ways to climb to the top.
//    1. 1 step + 1 step + 1 step
//    2. 1 step + 2 steps
//    3. 2 steps + 1 step

    public static int climbStairs(int n) {

        if (n == 1) {
            return 1;
        }

        if (n == 2) {
            return 2;
        }

        return climbStairs(n - 1) + climbStairs(n - 2);
    }


    public static int climbStairs2(int n) {

        if (n == 1){
            return 1;
        }

        if (n == 2){
            return 2;
        }

        //start from 3
        int lastOneStairCount = 2;
        int lastTwoStairCount = 1;
        int currentStatiCount = lastOneStairCount + lastTwoStairCount;

        for (int i = 2; i < n; i++){
            currentStatiCount = lastOneStairCount + lastTwoStairCount;
            lastTwoStairCount = lastOneStairCount;
            lastOneStairCount = currentStatiCount;
        }

        return currentStatiCount;
    }

    public static void main(String args[]) {
        System.out.println(climbStairs2(2));
        System.out.println(climbStairs(2));
    }

}
