/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int [] a = new int[100];
        int [] b = new int[100];
    


        int n = 0, m=0;

        ListNode dummy = new ListNode(0);
        ListNode current = dummy;

        while (l1 != null) {
            a[n++] = l1.val;
            l1 = l1.next;
        }

        while (l2 != null) {
            b[m++] = l2.val;
            l2 = l2.next;
        }

        int carry = 0;
        int i = 0;

        while (i < n || i < m || carry != 0) {
            int sum = carry;

            if (i < n)
            sum += a[i];

            if (i < m)
            sum += b[i];

            carry = sum / 10;

            current.next = new ListNode(sum % 10);
            current = current.next;


            i++;
        }



        return dummy.next;
    }
}

        
    
