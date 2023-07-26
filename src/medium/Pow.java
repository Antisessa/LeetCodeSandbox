package medium;

import java.math.BigDecimal;

public class Pow {
    public static void main(String[] args) {
        double var = -1.00000;
        int n = 20;
        //two diff result, bc it's cheating for using Math.pow(double a, double b)

        double multiple = var;
        if (var == 1.00000 || var == 0.00000) {

        } else {
            if (n > 0) {
                for (int i = 1; i < n; i++) {
                    var = var * multiple;
                }

            } else if (n == 0) {
                var = 1.00;

            } else {
                if (n <= -20) {
                    var = 0.00000;
                } else {
                    for (int i = n + 1; i < 0; i++) {
                        var = var * multiple;
                    }
                    var = 1 / var;
                }
            }
        }
        System.out.printf("%.5f\n", var);
    }
}
