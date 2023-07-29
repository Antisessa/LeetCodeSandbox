import medium.ListNode;

import java.util.*;

public class test {
    public static void main(String[] args) {
//        ListNode l1_21 = new ListNode(1);
//        ListNode l1_20 = new ListNode(0, l1_21);
//        ListNode l1_19= new ListNode(0, l1_20);
//        ListNode l1_18 = new ListNode(0, l1_19);
//        ListNode l1_17 = new ListNode(0, l1_18);
//        ListNode l1_16= new ListNode(0, l1_17);
//        ListNode l1_15 = new ListNode(0, l1_16);
//        ListNode l1_14 = new ListNode(0, l1_15);
//        ListNode l1_13 = new ListNode(0, l1_14);
//        ListNode l1_12 = new ListNode(0, l1_13);
//        ListNode l1_11 = new ListNode(0, l1_12);
//        ListNode l1_10 = new ListNode(0, l1_11);
//        ListNode l1_9 = new ListNode(0, l1_10);
//        ListNode l1_8 = new ListNode(0, l1_9);
//        ListNode l1_7 = new ListNode(0, l1_8);
//        ListNode l1_6 = new ListNode(0, l1_7);
//        ListNode l1_5 = new ListNode(0, l1_6);
//        ListNode l1_4 = new ListNode(0, l1_5);
//        ListNode l1_3 = new ListNode(0, l1_4);
//        ListNode l1_2 = new ListNode(0, l1_3);
//        ListNode l1_1 = new ListNode(0, l1_2);
//        ListNode l1 = new ListNode(1, l1_1);

        ListNode l1_2 = new ListNode(3);
        ListNode l1_1 = new ListNode(4, l1_2);
        ListNode l1 = new ListNode(2, l1_1);

        ListNode l2_2 = new ListNode(4);
        ListNode l2_1 = new ListNode(6, l2_2);
        ListNode l2 = new ListNode(5, l2_1);

        ListNode dummyHead = new ListNode(0);
        ListNode tail = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int digit1;
            if (l1 != null) digit1 = l1.val;
            else digit1 = 0;

            int digit2;
            if (l2 != null) digit2 = l2.val;
            else digit2 = 0;

            int sum = digit1 + digit2 + carry;
            int digit = sum % 10;
            carry = sum / 10;

            ListNode newNode = new ListNode(digit);
            tail.next = newNode;
            tail = tail.next;

            if (l1 != null){
                l1 = l1.next;
            }
            else {
                l1 = null;
            }

            if (l2 != null){
                l2 = l2.next;
            }
            else {
                l2 = null;
            }
        }

        ListNode result = dummyHead.next;
        dummyHead.next = null;

        ArrayList numsResult = new ArrayList();
        ListNode list3 = result;
        while(list3.next != null) {
            numsResult.add(list3.val);
            list3 = list3.next;
        }
        numsResult.add(list3.val);

        System.out.println(numsResult);
    }
}