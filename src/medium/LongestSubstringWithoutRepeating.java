package medium;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        String s = "aab";
        // substring 'abc' hasn't repeat char, and answer is 3, bc length is 3

        ArrayList sequence = new ArrayList();

        for (int i = 0; i < s.length(); i++) {
            Set set = new HashSet();
            set.add(s.charAt(i));
            sequence.add(i);

            for (int j = i + 1; j <= s.length(); j++) {

                if (j >= s.length()) {
                    if (s.charAt(j-1) != s.charAt(i)) {
                        sequence.add(j);
                        break;
                    } else {
                        sequence.add(i);
                        break;
                    }
                } else {
                    if (!set.add(s.charAt(j))) {
                        sequence.add(i);
                        break;
                    }
                }
            }
        }

        ArrayList<String> result = new ArrayList<>();
        int res;

        if (s.compareToIgnoreCase("") == 0) {
            res = 0;

        } else if (s.compareToIgnoreCase("") == 2) {

            if (s.charAt(0)!=s.charAt(1)) {
                res = 2;
            } else res = 1;

        } else {
                res = 1;
                for (int i = 1; i < sequence.size(); i++) {
                    int x = (int) sequence.get(i - 1);
                    int y = (int) sequence.get(i);
                    i++;

                    String resString = s.substring(x, y);
                    result.add(resString);
                    System.out.println(resString);

                    int length = resString.length();
                    if (res < length)
                        res = length;

                }
            }

        System.out.println("answer: " + res);
        String test = "ab";
        System.out.println("correct answer: " + test.length());
    }
}
