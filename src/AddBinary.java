public class AddBinary {

//    Given two binary strings, return their sum (also a binary string).
//
//    The input strings are both non-empty and contains only characters 1 or 0.
//
//    Example 1:
//
//    Input: a = "11", b = "1"
//    Output: "100"
//    Example 2:
//
//    Input: a = "1010", b = "1011"
//    Output: "10101"


    public static String addBinary(String a, String b) {

        int cursorA = a.length() - 1;
        int cursorB = b.length() - 1;
        StringBuilder result = new StringBuilder();
        boolean nextIndexAddOne = false;

        while (cursorA >= 0 || cursorB >= 0) {

            if (cursorA >= 0 && cursorB >= 0) {

                if (a.charAt(cursorA) != b.charAt(cursorB)) {
                    result.insert(0, nextIndexAddOne ? "0" : "1");
                } else if (a.charAt(cursorA) == '0') {
                    result.insert(0, nextIndexAddOne ? "1" : "0");
                    nextIndexAddOne = false;
                } else {
                    result.insert(0, nextIndexAddOne ? "1" : "0");
                    nextIndexAddOne = true;
                }

                cursorA--;
                cursorB--;

            } else if (cursorB < 0) {

                if (a.charAt(cursorA) == '0') {
                    result.insert(0, nextIndexAddOne ? "1" : "0");
                    nextIndexAddOne = false;
                } else {
                    result.insert(0, nextIndexAddOne ? "0" : "1");
                }

                cursorA--;
            } else {

                if (b.charAt(cursorB) == '0') {
                    result.insert(0, nextIndexAddOne ? "1" : "0");
                    nextIndexAddOne = false;
                } else {
                    result.insert(0, nextIndexAddOne ? "0" : "1");
                }
                cursorB--;
            }
        }

        if (nextIndexAddOne) {
            result.insert(0, "1");
        }

        return result.toString();
    }


    public static void main(String args[]) {
        System.out.println(addBinary("11", "1"));
    }
}
