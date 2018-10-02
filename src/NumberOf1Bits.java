public class NumberOf1Bits {

//    Write a function that takes an unsigned integer and returns the number of '1' bits it has (also known as the Hamming weight).
//
//    Example 1:
//
//    Input: 11
//    Output: 3
//    Explanation: Integer 11 has binary representation 00000000000000000000000000001011
//    Example 2:
//
//    Input: 128
//    Output: 1
//    Explanation: Integer 128 has binary representation 00000000000000000000000010000000

    public static int hammingWeight(int n) {

        int count = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                count++;
            }

            n = n >>> 1;
        }

        return count;

    }

    public static void main(String args[]) {
        System.out.println(hammingWeight(11));
        System.out.println(hammingWeight(128));
    }
}
