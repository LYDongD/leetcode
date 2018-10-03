import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class HappyNumber {

//    Write an algorithm to determine if a number is "happy".
//
//    A happy number is a number defined by the following process: Starting with any positive integer, replace the number by the sum of the squares of its digits, and repeat the process until the number equals 1 (where it will stay), or it loops endlessly in a cycle which does not include 1. Those numbers for which this process ends in 1 are happy numbers.
//
//            Example:
//
//    Input: 19
//    Output: true
//    Explanation:
//            12 + 92 = 82
//            82 + 22 = 68
//            62 + 82 = 100
//            12 + 02 + 02 = 1

    //假设数I，经过多次处理后达到数a, 再经过若干次处理后回到数a, 则形成了一个loop，如果loop内未出现1，则永远不会出现1,说明I不是happy number
    //处理数是有上限的，假设为[2,N], 无限次操作后，在有限范围内，一定会发生重复，从而形成loop
    //假设经过若干次处理后到达一个很大的数O1，它有D位数，假设这个数是9999, 那么下一个数是 9^2 * D < 100D < O1
    public static boolean isHappy(int n) {
        Set<Integer> historyNum = new HashSet<>();
        while (true) {
            int sum = 0;
            while (n != 0) {
                sum += (n % 10) * (n % 10);
                n = n / 10;
            }

            if (sum == 1) {
                return true;
            }

            if (historyNum.contains(sum)) {
                return false;
            }

            historyNum.add(sum);
            n = sum;
        }
    }

    public static void main(String args[]) {
        System.out.println(isHappy(20));
    }
}
