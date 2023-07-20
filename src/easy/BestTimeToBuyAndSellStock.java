package easy;

public class BestTimeToBuyAndSellStock {
    public static void main(String[] args) {
        int[] prices = {3,2,6,5,0,3};

        int minprice = Integer.MAX_VALUE; // Максимальное значение для int
        int maxprofit = 0; // Переменная для результата

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice) // Если следующее число меньше чем минимальное, то присваиваем его минимальным
                minprice = prices[i];

            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
            // Если разница между следующим числом и минимальным известным больше чем профит, присваиваем его
        }
        System.out.println(maxprofit);
    }
}
