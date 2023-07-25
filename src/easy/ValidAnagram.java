package easy;

import java.util.ArrayList;

public class ValidAnagram {
    public static void main(String[] args) {
        String s = "anagram";
        String t = "nagaram";

        boolean result = false;

        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        if (sChar.length != tChar.length) {

        } else {
            ArrayList array1 = new ArrayList();
            ArrayList array2 = new ArrayList();

            for (char c : sChar) {
                array1.add(c);
            }
            for (char c : tChar) {
                array2.add(c);
            }

            int size = array1.size();
            for (int i = 0; i < size; i++) {
                if (array1.contains(array2.get(0))) {
                    array1.remove(array2.get(0));
                    array2.remove(0);
                }
            }

            if (array1.size() == 0 && array2.size() == 0) {
                result = true;
            }
            System.out.println(result);
        }
    }
}
