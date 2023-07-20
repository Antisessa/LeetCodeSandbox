package easy;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int[] nums = {0,4,5,0,3,6}; // res = true, bc array has duplicate
        boolean result = false;
        if (nums.length <= 1) {
            result = true;
        } else {
            Set<Integer> set = new HashSet<>();
            for (int c : nums) {
                if (set.add(c)){

                }
                    else {
                        result = true;
                        break;
                }
            }
            System.out.println(result);
        }
    }
}