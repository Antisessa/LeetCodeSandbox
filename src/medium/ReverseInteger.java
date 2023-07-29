package medium;

public class ReverseInteger {
    public static void main(String[] args) {
//        Input: x = 123
//        Output: 321
        int x = 9_646_324_351;

        String s = String.valueOf(x);

        char[] chars = s.toCharArray();

        StringBuilder sb = new StringBuilder();

        boolean isNegattive = false;
        for (int i = chars.length-1; i >= 0; i--) {
            if (chars[i] == '-') {
                isNegattive = true;
            } else {
                sb.append(chars[i]);
            }
        }

        int result = Integer.parseInt(sb.toString());
        if(isNegattive)
            result = result * -1;
        System.out.println(result);
    }
}
