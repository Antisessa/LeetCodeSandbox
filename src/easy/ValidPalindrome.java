package easy;

import java.util.ArrayList;

public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "a.";

        boolean res = false;

        if (s == " " || s.length() == 0) {
            res = true;
        } else {
            char[] chars = s.toCharArray();

            ArrayList charToArray = new ArrayList();

            for (int i = 0; i < chars.length; i++) {
                if (Character.isAlphabetic(chars[i]) || Character.isDigit(chars[i])) {
                    charToArray.add(Character.toLowerCase(chars[i]));
                }
            }

            if (charToArray.size() == 0) {
                res = true;

            } else if (charToArray.size() == 1) {
                res = true;

            } else {

                ArrayList reverseArray = new ArrayList();

                for (int i = charToArray.size() - 1; i >= 0; i--) {
                    reverseArray.add(charToArray.get(i));
                }

                System.out.println(charToArray.toString());
                System.out.println(reverseArray.toString());
                if (charToArray.equals(reverseArray))
                    res = true;
            }
        }
        System.out.println(res);
    }
}
