import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
//
//    Given a non-negative integer numRows, generate the first numRows of Pascal's triangle.
//
//
//    In Pascal's triangle, each number is the sum of the two numbers directly above it.
//
//    Example:
//
//    Input: 5
//    Output:
//            [
//            [1],
//            [1,1],
//            [1,2,1],
//            [1,3,3,1],
//            [1,4,6,4,1]
//            ]


    public static List<List<Integer>> generate(int numRows) {

        List<List<Integer>> triangleList = new ArrayList<>();
        for (int i = 0; i < numRows; i++){
            List<Integer> rowList = new ArrayList<>();

            if (i == 0){
                rowList.add(1);
            }else {

                //add the first element
                rowList.add(1);

                for (int j = 1; j < i; j++){

                    //add the element according to last array
                    List<Integer> lastRowList = triangleList.get(i - 1);
                    rowList.add(lastRowList.get(j) + lastRowList.get(j - 1));

                }

                //add the last element
                rowList.add(1);

            }

            triangleList.add(rowList);
        }

        return triangleList;
    }

    public static void main(String args[]) throws Exception{
        System.out.println(generate(5));
    }

}
