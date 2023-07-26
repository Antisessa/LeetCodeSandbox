package easy;

import java.util.*;

public class RemoveDuplicatesfromSortedArray {
    public static void main(String[] args) {
        int[] input = {0,1,1,2,3,3,4,5,5};

        int[] expected = {0,1,2,3,4,5};

        Set set = new HashSet();
        ArrayList arrayList = new ArrayList();

        for (int i = 0; i < input.length; i++) {
            if(set.add(input[i]))
                arrayList.add(input[i]);
        }

        int k = arrayList.size();

        for (int i = 0; i < k; i++) {
            input[i] = (int) arrayList.get(i);
        }

        System.out.println(Arrays.toString(input));
        System.out.println(k);
    }
}
