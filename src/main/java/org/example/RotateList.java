package org.example;

import org.example.common.ListNode;

public class RotateList {
    public ListNode rotateRight(ListNode head, int k) {

        if (head == null) {
            return null;
        }

         ListNode l = head;
         ListNode r = head;

         int s = 1;
         while (r.next != null) {
             r = r.next;
             s++;
         }

         r.next = l;

         k = k % s;

         var tmp = l;
         int skipCnt = s - k - 1;
         while (skipCnt-- > 0) {
             tmp = tmp.next;
         }

         var h = tmp.next;
         tmp.next = null;

         return h;
    }
}
