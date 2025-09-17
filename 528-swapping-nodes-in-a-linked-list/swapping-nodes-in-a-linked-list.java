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
    public ListNode swapNodes(ListNode head, int k) {
        
        ListNode first = head;
        ListNode second=head;
        for(int i=1;i<k;i++){
            first=first.next;
        }
        ListNode node1=first;
        ListNode temp = first;
        while(temp.next!=null){
            temp = temp.next;
            second=second.next;
        }
        ListNode node2 = second;
        int x = node1.val;
        node1.val=node2.val;
        node2.val=x;
        return head;
        
    }
}