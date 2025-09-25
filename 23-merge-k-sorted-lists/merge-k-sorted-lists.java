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
    public ListNode mergeKLists(ListNode[] lists) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<lists.length;i++){
            ListNode curr = lists[i];
            while(curr!=null){
                list.add(curr.val);
                curr=curr.next;
            }
        }
        if(list.size()==0) return null;
        Collections.sort(list);
        
        ListNode head = new ListNode(list.get(0));
        ListNode curr = head;
        for(int i=1;i<list.size();i++){
            ListNode nextNode = new ListNode(list.get(i));
            curr.next=nextNode;
            curr=curr.next;
        }
        return head;
    }
}