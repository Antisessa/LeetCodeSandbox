package easy;

public class PowerOfFour {
    public static void main(String[] args) {
        int n = 5;

        boolean isPowerOfFour = false;

        if(n < 1) {
            while(n < 1) {
                n *= 4;
            }
            isPowerOfFour = n == 1;

        } else if (n > 1) {
            while(n > 1) {
                n /= 4;
            }

            isPowerOfFour = n == 1;
        } else if (n == 0) {
            isPowerOfFour = true;
        }

        System.out.println(isPowerOfFour);
    }
}
