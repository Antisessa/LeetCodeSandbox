package easy;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {7, 2, 5, 3, 6, 4, 1, 5, 7};
        int min = prices[0];
        int max = 0;
        int nMin=0, nMax=0, result=0;

        for (int i = 0; i < prices.length; i++) {
            int c = prices[i];

            if (c < min) {
                min = c;
                nMin = i;
            }
        }

        for (int i = nMin; i < prices.length; i++) {
            int c = prices[i];

            if (c > max) {
                max = c;
                nMax = i;
            }
        }
        result = prices[nMax] - prices[nMin];
        System.out.println(min + " " + max + " " + result);
    }
}
