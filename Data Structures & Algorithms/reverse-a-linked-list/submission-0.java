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
    public ListNode reverseList(ListNode head) {
          if (head == null || head.next == null) {
            return head;
        }
          ListNode strt = head;
          ListNode mid = head.next;
          ListNode end = head.next.next;
         strt.next = null;

        while(end!=null){
             
             mid.next = strt;
             
             strt = mid;
             mid = end;
             end = end.next;

        } 
        mid.next=strt;
                     
     return mid;

          
    }
}
