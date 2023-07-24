package easy;

import java.util.ArrayList;
import java.util.Arrays;

public class MergeSortedArray {
    public static void main(String[] args) {
//        int[] nums1 = {1,2,3,0,0,0}; int m = 3, n = 3; int[] nums2 = {2,5,6};

        int[] nums1 = {1,2,3,0,0,0}; int m = 3, n = 3; int[] nums2 = {2,5,6};

        int j = 0;
        int[] res = new int[m+n];

        for (int i = 0; i < m; i++) {
            res[j] = nums1[i];
            j++;
        }

        if (m>0) {
            for (int i = 0; i < m; i++) {
                res[j] = nums2[i];
                j++;
            }
        }

        System.out.println("nums1: " + Arrays.toString(nums1));
        System.out.println("res: " + Arrays.toString(res));
        Arrays.sort(res);
        System.out.println("res sorted: " + Arrays.toString(res));

        for (int i = 0; i < m+n; i++) {
            nums1[i] = res[i];
        }

        System.out.println("nums1 after prog: " + Arrays.toString(nums1));


    }
}
