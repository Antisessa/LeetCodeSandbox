package easy;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strings = {"flower","flow","flight"};

        int minLength = Integer.MAX_VALUE;
        int matches = 0;

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() < minLength)
                minLength = strings[i].length();
        }

        for (int i = 0; i < minLength; i++) {
            char c = strings[0].charAt(i);

            for (int j = 0; j < strings.length; j++) {
                if (strings[j].charAt(i) == c) {
                    matches++;
                } else {

                }
            }
        }
    }
}
