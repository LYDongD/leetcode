import java.util.HashSet;
import java.util.Set;

public class ReverseVowelsOfString {

//    Write a function that takes a string as input and reverse only the vowels of a string.
//
//            Example 1:
//
//    Input: "hello"
//    Output: "holle"
//    Example 2:
//
//    Input: "leetcode"
//    Output: "leotcede"
//    Note:
//    The vowels does not include the letter "y".

    public static String reverseVowels(String s) {
        if (s == null) return null;

        Set<Character> vowelSet = new HashSet<>();
        vowelSet.add('a');
        vowelSet.add('A');
        vowelSet.add('e');
        vowelSet.add('E');
        vowelSet.add('i');
        vowelSet.add('I');
        vowelSet.add('o');
        vowelSet.add('O');
        vowelSet.add('u');
        vowelSet.add('U');

        char[] chars = s.toCharArray();
        int low = 0;
        int high = chars.length - 1;
        while (low < high){

            if (vowelSet.contains(s.charAt(low)) && vowelSet.contains(s.charAt(high))){
                char tmp = chars[low];
                chars[low] = chars[high];
                chars[high] = tmp;

                low++;
                high--;
            }else if (!vowelSet.contains(s.charAt(low))){
                low++;
            }else if (!vowelSet.contains(s.charAt(high))){
                high--;
            }
        }

        return new String(chars);
    }

    public static void main(String args[]) {
        System.out.println(reverseVowels("leetcode"));
    }
}
