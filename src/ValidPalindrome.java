public class ValidPalindrome {

//    Given a string, determine if it is a palindrome, considering only alphanumeric characters and ignoring cases.
//
//    Note: For the purpose of this problem, we define empty string as valid palindrome.
//
//            Example 1:
//
//    Input: "A man, a plan, a canal: Panama"
//    Output: true
//    Example 2:
//
//    Input: "race a car"
//    Output: false


    public static boolean isPalindrome(String s) {

        if (s.length() == 0){
            return true;
        }

        int leftToRight = 0;
        int rightToLeft = s.length() - 1;

        while (leftToRight != rightToLeft){

            if (!Character.isLetterOrDigit(s.charAt(leftToRight))){
                leftToRight++;
                continue;
            }

            if (!Character.isLetterOrDigit(s.charAt(rightToLeft))){
                rightToLeft--;
                continue;
            }

            if (Character.toLowerCase(s.charAt(leftToRight)) != Character.toLowerCase(s.charAt(rightToLeft))){
                return false;
            }

            leftToRight++;
            rightToLeft--;

            if (leftToRight > rightToLeft){
                break;
            }
        }

        return true;
    }

    public static void main(String args[]) throws Exception{
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }

}
