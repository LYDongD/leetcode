public class CountAndSay {
//
//    The count-and-say sequence is the sequence of integers with the first five terms as following:
//
//            1.     1
//            2.     11
//            3.     21
//            4.     1211
//            5.     111221
//            1 is read off as "one 1" or 11.
//            11 is read off as "two 1s" or 21.
//            21 is read off as "one 2, then one 1" or 1211.
//    Given an integer n, generate the nth term of the count-and-say sequence.
//
//    Note: Each term of the sequence of integers will be represented as a string.
//
//            Example 1:
//
//    Input: 1
//    Output: "1"
//    Example 2:
//
//    Input: 4
//    Output: "1211"


    public static String countAndSay(int n) {

        //initial
        if (n == 1) {
            return "1";
        }

        //detect n by n-1
        String lastSay = countAndSay(n - 1);

        StringBuilder currentSay = new StringBuilder();
        int count = 1;
        for (int i = 0; i < lastSay.length(); i++) {

            Character currentChar = lastSay.charAt(i);

            int nextIndex = i + 1;

            //last character handle
            if (nextIndex == lastSay.length()){
                currentSay.append(count).append(currentChar);
                break;
            }

            //compare current and next
            if (lastSay.charAt(nextIndex) != currentChar){
                currentSay.append(count).append(currentChar);
                count = 1;
            }else {
                count++;
            }
        }

        return currentSay.toString();
    }

    public static void main(String args[]) {
        System.out.println(countAndSay(1));
        System.out.println(countAndSay(2));
        System.out.println(countAndSay(3));
        System.out.println(countAndSay(4));
        System.out.println(countAndSay(5));
    }
}
