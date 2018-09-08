import java.util.ArrayList;
import java.util.List;

public class PascallTriangle2 {

//    Given a non-negative index k where k ≤ 33, return the kth index row of the Pascal's triangle.
//
//    Note that the row index starts from 0.
//
//
//    In Pascal's triangle, each number is the sum of the two numbers directly above it.
//
//    Example:
//
//    Input: 3
//    Output: [1,3,3,1]
//    Follow up:
//
//    Could you optimize your algorithm to use only O(k) extra space?


    public static List<Integer> getRow(int rowIndex) {

        List<Integer> rowList = new ArrayList<>();
        rowList.add(1);
        for (int i = 1; i < rowIndex + 1; i++) {
            rowList.add(1);
            for (int j = i - 1; j > 0; j--) {
                rowList.set(j, rowList.get(j) + rowList.get(j - 1));
            }
        }
        return rowList;
    }

    public static void main(String args[]) {
        System.out.println(getRow(4));
    }
}
