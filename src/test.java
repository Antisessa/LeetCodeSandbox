import medium.ListNode;

import java.util.*;

public class test {
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5};
        int target = 11;

        int ans = Integer.MAX_VALUE, j = 0, sum = 0;
        for(int i=0; i < nums.length; i++)
        {
            sum += nums[i];
            if(sum>=target)
            {
                while(sum>=target)
                {
                    j++;
                    sum-=nums[j];
                }
                ans = Math.min (ans, i-j+2);
            }
        }
        if (ans == nums.length + 1)
            ans = 0;

        System.out.println(ans);
    }
}