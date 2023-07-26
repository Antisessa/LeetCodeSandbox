package easy;

public class LongestCommonPrefix {
    public static void main(String[] args) {
        String[] strings = {"dog","racecar","car"};

        int minLength = Integer.MAX_VALUE;

        for (int i = 0; i < strings.length; i++) {
            if (strings[i].length() < minLength)
                minLength = strings[i].length();
        }

        boolean switcher = true;

        StringBuilder sb = new StringBuilder("");

        for (int i = 0; i < minLength && switcher; i++) {
            char c = strings[0].charAt(i);

            for (int j = 0; j < strings.length && switcher; j++) {
                if (strings[j].charAt(i) != c) {
                    switcher = false;
                    break;
                }
            }
            if (switcher)
                sb.append(c);
        }
        System.out.println(sb.toString());
    }
}
