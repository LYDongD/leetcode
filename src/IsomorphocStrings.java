import java.util.HashMap;
import java.util.Map;

public class IsomorphocStrings {
//
//    Given two strings s and t, determine if they are isomorphic.
//
//    Two strings are isomorphic if the characters in s can be replaced to get t.
//
//    All occurrences of a character must be replaced with another character while preserving the order of characters. No two characters may map to the same character but a character may map to itself.
//
//    Example 1:
//
//    Input: s = "egg", t = "add"
//    Output: true
//    Example 2:
//
//    Input: s = "foo", t = "bar"
//    Output: false
//    Example 3:
//
//    Input: s = "paper", t = "title"
//    Output: true
//    Note:
//    You may assume both s and t have the same length.

    public static boolean isIsomorphic(String s, String t) {

        if (s == null || t == null || s.length() != t.length()) {
            return false;
        }

        Map<Character, Character> stCharTable = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            //a character should map to the same character
            if (stCharTable.containsKey(s.charAt(i))){
                if (stCharTable.get(s.charAt(i)) != t.charAt(i)){
                    return false;
                }
            }else if (stCharTable.containsValue(t.charAt(i))){ //two characters can not map to the same character
                return false;
            }

            stCharTable.put(s.charAt(i), t.charAt(i));

        }

        return true;
    }

    public static void main(String args[]) {
        System.out.println(isIsomorphic("ab" , "aa"));
        System.out.println(isIsomorphic("" , ""));
    }
}
