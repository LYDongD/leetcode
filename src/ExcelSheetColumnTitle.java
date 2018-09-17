public class ExcelSheetColumnTitle {

//    Given a positive integer, return its corresponding column title as appear in an Excel sheet.
//
//    For example:
//
//            1 -> A
//    2 -> B
//    3 -> C
//    ...
//            26 -> Z
//    27 -> AA
//    28 -> AB
//    ...
//    Example 1:
//
//    Input: 1
//    Output: "A"
//    Example 2:
//
//    Input: 28
//    Output: "AB"
//    Example 3:
//
//    Input: 701
//    Output: "ZY"

    public static String convertToTitle(int n) {

        String charTable = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        StringBuilder result = new StringBuilder();
        while (n > 0){

            boolean lastCharacter = n % 26 == 0;

            int charIndex = lastCharacter ? 26 : n % 26;
            result.insert(0, charTable.charAt(charIndex -1));

            n = lastCharacter ? (n - 26) / 26 : n / 26;
        }

        return result.toString();
    }

    public static String convertToTitle2(int n) {

        String charTable = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        StringBuilder result = new StringBuilder();

        while (n > 0){
            n--;
            result.insert(0, charTable.charAt(n % 26));
            n = n / 26;
        }

        return result.toString();
    }




    public static void main(String args[]) throws Exception{
        System.out.println(convertToTitle2(24568));
    }



}
