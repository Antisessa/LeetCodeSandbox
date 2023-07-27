package medium;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.TreeSet;

public class ThreeSum {
    public static void main(String[] args) {
        int[] nums = {-1, -1, -1, -3, -7, -20, 10, -1, 8, 7, 6, 7, 10, 0, 1, 2, -1, -4, -7, -8, -10, 20, 3, 1};

        Arrays.sort(nums);

        List<List<Integer>> ans = new ArrayList<>();

        for (int i = 0; i < nums.length - 2; i++) {

            // Skip duplicate elements for i
            if (i > 0 && nums[i] == nums[i - 1]) {
                continue;
            }

            int j = i+1;
            int k = nums.length - 1;

            while(j < k) {
                int sum = nums[i] + nums[j] + nums[k];

                if(sum == 0) {
                    ans.add(Arrays.asList(nums[i], nums[j], nums[k]));

                    // Skip duplicate elements for j
                    while(j < k && nums[j] == nums[j + 1]) {
                        j++;
                    }

                    // Skip duplicate elements for j
                    while(j < k && nums[k] == nums[k - 1]) {
                        k--;
                    }

                    //move pointers
                    j++;
                    k--;
                } else if (sum < 0) {
                    j++;

                } else if (sum > 0) {
                    k--;
                }

            }
        }
        System.out.println(ans);
    }
    }
