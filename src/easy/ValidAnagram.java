package easy;

import java.util.ArrayList;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        ArrayList array1 = new ArrayList();
        ArrayList array2 = new ArrayList();

        for (char c: sChar) {
            array1.add(c);
        }
        for (char c: tChar) {
            array2.add(c);
        }

        for (int i = 0; i < array1.size(); i++) {
            if(array1.contains(array2.get(i))) {
                array1.
            }

        }

    }
}
