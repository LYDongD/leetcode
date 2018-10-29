public class ReverseString {

    public static String reverseString(String s) {
        if (s == null) return null;
        char[] characters = s.toCharArray();
        for(int i = 0; i < characters.length / 2; i++){
            char tmp = characters[i];
            characters[i] = characters[characters.length - i - 1];
            characters[characters.length - i - 1] = tmp;
        }

        return new String(characters);
    }

    public static void main(String args[]) throws Exception{
        System.out.println(reverseString("A man, a plan, a canal: Panama"));
    }
}
