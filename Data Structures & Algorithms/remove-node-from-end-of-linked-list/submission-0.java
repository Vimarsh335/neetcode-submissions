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
    public ListNode removeNthFromEnd(ListNode head, int n) {
               ListNode trav = head;
               int len = 1;
               ListNode ln = head;
                    
               while(trav.next!=null){
                     trav = trav.next;
                     len++;  
               }
             
               int k = (len-n); 

                  if (k == 0) {
            return head.next;
        }
 
               while(k>1){                  
                   ln = ln.next;
                   k--;
               } 

              ListNode rn =  ln.next;
              if(rn == null){
                return null;
              }
             
              rn = rn.next;
                

               ListNode curr = ln.next;
               ln.next = rn;
               curr.next = null;
                
     return head;
    }
}
