package medium;

public class Pow {
    public static void main(String[] args) {
        double x = 2.00000;
        int n = -2;

        double k = x;

        for (int i = 1; i < n; i++) {
            x = x / k;
        }
        System.out.println(x);
    }
}
