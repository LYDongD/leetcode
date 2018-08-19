import java.util.HashMap;
import java.util.Map;

public class IndexOf {

//    Example 1:
//
//    Input: haystack = "hello", needle = "ll"
//    Output: 2
//    Example 2:
//
//    Input: haystack = "aaaaa", needle = "bba"
//    Output: -1


    public static int strStr(String haystack, String needle) {

        //empty handle
        if (needle.length() == 0) {
            return 0;
        }

        //length check
        if (haystack.length() < needle.length()) {
            return -1;
        }

        char[] haystackArray = haystack.toCharArray();
        char[] needleArray = needle.toCharArray();
        for (int i = 0; i < haystackArray.length; i++) {

            //find the first needle character
            if (haystackArray[i] == needleArray[0]) {

                //length check
                int haystackRestLength = haystackArray.length - i;
                if (haystackRestLength < needleArray.length) {
                    return -1;
                }

                //compare the rest needle character
                boolean needleFound = true;
                for (int j = 0, k = i; j < needle.length(); j++, k++) {

                    //needle fail, break to find another needle
                    if (needleArray[j] != haystackArray[k]) {
                        needleFound = false;
                        break;
                    }
                }

                if (needleFound) {
                    return i;
                }
            }
        }

        return -1;
    }

    public static int strStrForKMP(String haystack, String needle) {

        //empty handle
        if (needle.length() == 0) {
            return 0;
        }

        //prepare the needl back
        int[] backTable = getNeedleBackTable(needle);

        //prepare partial match table
        int i= 0;
        int j = 0;
        while (i < haystack.length()) {

            //forward haystack index and needle index
            if (j == -1 || haystack.charAt(i) == needle.charAt(j)){
                j++;
                i++;

                //needle all match
                if (j == needle.length()){
                    return i - j;
                }
            }else { //just back needle index
                j = backTable[j];
            }
        }

        return -1;
    }



    public static int[] getNeedleBackTable(String str) {

        int[] back = new int[str.length()];

        int j = 0;
        int k = -1;
        back[j] = k;

        while (j < str.length() - 1) {

            if (k == -1 || str.charAt(j) == str.charAt(k)) {
                back[++j] = ++k;
            } else {
                k = back[k];
            }
        }
        return back;
    }


    public static void main(String args[]) {


//        System.out.println(getBackArray("aba"));


//        System.out.println(configurePartialMatchTabel("issip").toString());

//            System.out.println(calNext("abab"));

        System.out.println(strStrForKMP("BBCABCDABABCDABCDABDE", "ABCDABD"));

        System.out.println(strStrForKMP("babbbbbabb", "bbab"));
        System.out.println(strStrForKMP("babbbbbabb", ""));
//
        System.out.println(strStrForKMP("abbbbbaabbaabaabbbaaaaabbabbbabbbbbaababaabbaabbbbbababaababbbbaaabbbbabaabaaaabbbbabbbaabbbaabbaaabaabaaaaaaaa",
                "abbbaababbbabbbabbbbbabaaaaaaabaabaabbbbaabab"));


    }
}
