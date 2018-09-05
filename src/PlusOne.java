import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

public class PlusOne {

//    Given a non-empty array of digits representing a non-negative integer, plus one to the integer.
//
//    The digits are stored such that the most significant digit is at the head of the list, and each element in the array contain a single digit.
//
//    You may assume the integer does not contain any leading zero, except the number 0 itself.
//
//            Example 1:
//
//    Input: [1,2,3]
//    Output: [1,2,4]
//    Explanation: The array represents the integer 123.
//    Example 2:
//
//    Input: [4,3,2,1]
//    Output: [4,3,2,2]
//    Explanation: The array represents the integer 4321.


    public static int[] plusOne(int[] digits) {

        Stack<Integer> stack = plusOne(digits, new Stack<>(), digits.length - 1);

        int[] result = new int[stack.size()];
        int i = 0;
        while (!stack.isEmpty()) {
            result[i] = stack.pop();
            i++;
        }
        return result;

    }

    public static Stack<Integer> plusOne(int[] digits, Stack<Integer> stack, Integer lastIndex) {

        //base condition
        if (lastIndex == 0) {
            if (digits[lastIndex] == 9) {
                stack.push(0);
                stack.push(1);
            } else {
                stack.push(digits[lastIndex] + 1);
            }

            return stack;
        }

        //D&C
        if (digits[lastIndex] == 9) {
            stack.push(0);
            return plusOne(digits, stack, lastIndex - 1);
        } else {
            stack.push(digits[lastIndex] + 1);
            for (int i = lastIndex - 1; i >= 0; i--) {
                stack.push(digits[i]);
            }
            return stack;
        }
    }

    public static void main(String args[]) {

        int[] input = new int[]{9,9,9,9};
        int[] outPut = plusOne(input);
        for (int i = 0; i< outPut.length; i++){
            System.out.print(outPut[i]);
        }
    }


}
