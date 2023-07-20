package easy;

import java.util.ArrayList;

public class PalindromeNumber {
    public static void main(String[] args) {
        int x = 121;
        String xString = String.valueOf(x);
        char[] xChar = xString.toCharArray();

        ArrayList xArray = new ArrayList();
        for (char c: xChar) {
            xArray.add(c);
        }

        ArrayList yArray = new ArrayList();
        for (int i = xChar.length-1; i >= 0 ; i--) {
            yArray.add(xChar[i]);
        }
        boolean result = xArray.equals(yArray);
        System.out.println(result);
        System.out.println(xArray);
        System.out.println(yArray);

    }
}
