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
    public int sizeLL(ListNode head){
        
        int size=0;
        while(head!=null){
            size++;
            head=head.next;
        }
        return size;

    }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int size=sizeLL(head);
        int actsize=size-n;
        ListNode prev = head;
        if (actsize == 0) {
            return head.next;
        }
        for(int i=1;i<actsize;i++){
            prev=prev.next;
        }
        prev.next=prev.next.next;
        return head;
    }
}