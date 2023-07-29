package medium;

public class MinimumSizeSubarraySum {
    public static void main(String[] args) {
        //input
        int target = 7;
        int[] nums = {2,3,1,2,4,3};

        int k = 0;
        int resultLength = Integer.MAX_VALUE;

        for (int i = 0; i < nums.length; i++) {
            k = i + 1;
            int currentSum = nums[i] + nums[k];

            while (currentSum < target && k < nums.length) {
                currentSum = currentSum + nums[k];
                k++;

            }

            int currentLength = k - i + 1;
            if (resultLength > currentLength)
                resultLength = currentLength;

            i = k;
        }
        System.out.println(resultLength);
    }
}
