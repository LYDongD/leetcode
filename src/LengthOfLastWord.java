public class LengthOfLastWord {

//    Given a string s consists of upper/lower-case alphabets and empty space characters ' ', return the length of last word in the string.
//
//    If the last word does not exist, return 0.
//
//    Note: A word is defined as a character sequence consists of non-space characters only.
//
//            Example:
//
//    Input: "Hello World"
//    Output: 5

    public static int lengthOfLastWord(String s) {

        if (s == null || s.length() == 0) {
            return 0;
        }

        return lengthOfLastWord(s,s.length() - 1);
    }

    public static int lengthOfLastWord(String s, int lastIndex) {

        boolean lastCharacterEmpty = s.charAt(lastIndex) == 32;

        if (lastIndex == 0){
            return lastCharacterEmpty ? 0 : 1;
        }

        if (lastCharacterEmpty){
            return lengthOfLastWord(s, lastIndex - 1);

        }else {
            if (s.charAt(lastIndex - 1) == 32){
                return 1;
            }else {
                return lengthOfLastWord(s, lastIndex - 1) + 1;
            }
        }
    }

    public static void main(String args[]) {
        String s = "a ss sss";
        System.out.println(lengthOfLastWord(s));
    }

}
