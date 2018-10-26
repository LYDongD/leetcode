import java.util.HashMap;
import java.util.Map;

public class WordPattern {

//    Given a pattern and a string str, find if str follows the same pattern.
//
//    Here follow means a full match, such that there is a bijection between a letter in pattern and a non-empty word in str.
//
//    Example 1:
//
//    Input: pattern = "abba", str = "dog cat cat dog"
//    Output: true
//    Example 2:
//
//    Input:pattern = "abba", str = "dog cat cat fish"
//    Output: false
//    Example 3:
//
//    Input: pattern = "aaaa", str = "dog cat cat dog"
//    Output: false
//    Example 4:
//
//    Input: pattern = "abba", str = "dog dog dog dog"
//    Output: false
//    Notes:
//    You may assume pattern contains only lowercase letters, and str contains lowercase letters separated by a single space.

    public static boolean wordPattern(String pattern, String str) {
        if (str == null || pattern == null) return false;

        String[] strs = str.split("\\s+");
        if (pattern.length() != strs.length) return false;

        Map<Character, String> patternWordMap = new HashMap<>();
        for (int patternIndex = 0; patternIndex < pattern.length(); patternIndex++) {
            Character patternChar = pattern.charAt(patternIndex);
            String word = strs[patternIndex];
            if (patternWordMap.containsKey(patternChar)) {
                if (!patternWordMap.get(patternChar).equals(word)) {
                    return false;
                }
            } else {
                if (patternWordMap.containsValue(word)) {
                    return false;
                } else {
                    patternWordMap.put(patternChar, word);
                }
            }
        }

        return true;
    }

    public static void main(String args[]) {
        System.out.println(wordPattern("abba", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog cat cat fish"));
        System.out.println(wordPattern("aaaa", "dog cat cat dog"));
        System.out.println(wordPattern("abba", "dog dog dog dog"));
    }
}
