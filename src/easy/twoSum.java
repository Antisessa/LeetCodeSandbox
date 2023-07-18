package easy;

import java.util.Arrays;

public class twoSum {
    public static void main(String[] args) {
        int[] nums = {15, 11, 7, 2};
        int target = 9;
        int res = 0;
        int x = 0, y = 0;
        for (int i = 0; i < nums.length; i++) {
            int var1 = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                res = var1 + nums[j];
                if (res == target) {
                    x = i;
                    y = j;
                    break;
                }
            }
            if (res == target) {
                break;
            }
        }
        int[] result = {x, y};
        System.out.println(Arrays.toString(result));
    }


    public static int[] addInt(int[] series, int newInt){
        int[] newSeries = new int[series.length + 1];
        for (int i = 0; i < series.length; i++) {
            newSeries[i] = series[i];
        }
        newSeries[newSeries.length - 1] = newInt;

        return newSeries;
    }
}