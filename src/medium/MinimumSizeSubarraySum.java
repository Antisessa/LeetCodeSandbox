package medium;

import java.util.ArrayList;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        //input
        int target = 1_000_000_000;
//        int[] nums = {1,2,3,4,5};

        int[] nums = new int[10000];

        for (int i = 0; i < nums.length; i++) {
            nums[i] = 10000;
        }


        int k = 0;
        int currentLength = 0;
        int resultLength = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length && currentLength != 1; i++) {
            int currentSum = nums[i];

            if(currentSum < target && i!= nums.length-1) {
                k = i + 1;
                currentSum = nums[i] + nums[k];

                while (currentSum < target && k < nums.length - 1) {
                    k++;
                    currentSum = currentSum + nums[k];
                }

                if (currentSum >= target)
                    currentLength = k - i + 1;
//                else if(currentSum >= target && i == 0) {
//                    currentLength = k - 1;

            } else {
                if (currentSum >= target)
                currentLength = 1;
            }

            if (resultLength > currentLength)
                resultLength = currentLength;
        }
        System.out.println(resultLength);
    }
}
