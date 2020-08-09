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
    public ListNode removeElements(ListNode head, int val) {
        if(head==null) return null;
        
        ListNode prev=new ListNode();
        prev.next=head;
        ListNode present=prev;
        
        while(present.next!=null){
            
            if(present.next.val==val){
                ListNode n=present.next;
                present.next=n.next;
            }else
            present=present.next;
        }
        return prev.next;
        
    }
}

/*
Remove Linked List Elements

Solution
Remove all elements from a linked list of integers that have value val.

Example:

Input:  1->2->6->3->4->5->6, val = 6
Output: 1->2->3->4->5
*/
