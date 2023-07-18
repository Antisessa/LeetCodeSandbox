import java.util.ArrayList;

public class test {
    public static void main(String[] args) {
        String s = "([)]"; // size = 4

        boolean result = true;

        if (s.length() % 2 == 0) {
            ArrayList var1 = new ArrayList();

            for (int i = 0; i < s.length(); i++) {
                var1.add(String.valueOf(s.charAt(i)));
            }

            for (int i = 0; i <= var1.size() / 2 - 1; i++) {
                String x = String.valueOf(var1.get(i));

                for (int j = i + 1; j < var1.size(); j++) {
                    String y = String.valueOf(var1.get(j));
                    if (((x.equals("{") && y.equals("}"))) ||
                            (x.equals("[") && y.equals("]")) ||
                            (x.equals("(") && y.equals(")"))) {
                        System.out.println("Detected pair " + x + y);
                        var1.remove(j);
                        var1.remove(i);
                        i--;
                        break;
                    }
                }
            }

            if (var1.size() >= 1)
                result = false;
        } else result = false;

        System.out.println(result);
    }
}
