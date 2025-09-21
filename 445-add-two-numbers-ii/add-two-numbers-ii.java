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
        Stack<Integer> stack1 = new Stack<>();
        Stack<Integer> stack2 = new Stack<>();

        ListNode result= null;
        while(l1!=null){
            stack1.push(l1.val);
            l1=l1.next;

        }
        while(l2!=null){
            stack2.push(l2.val);
            l2=l2.next;
        }
        int carry=0;
        
        while(!stack1.isEmpty() || !stack2.isEmpty() || carry!=0){
            int x= (!stack1.isEmpty()) ? stack1.pop() : 0;
            int y = (!stack2.isEmpty()) ? stack2.pop() :0;
            int sum = x+y+carry;
            carry=sum/10;
            ListNode newNode = new ListNode(sum%10);
            newNode.next=result;
            result=newNode;
        }
        
        return result;
    }

}