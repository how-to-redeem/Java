package oj;

class ListNode {
    int val;
    ListNode next;
    ListNode(int x) {
        val = x;
    }
}


public class Solution203 {
    public ListNode removeElements(ListNode head,int val) {
        ListNode dummyNode = new ListNode(val-1);
        dummyNode.next = head;
        ListNode prev = dummyNode;
        //确保当前节点后还有节点
        while(prev.next != null ) {
            if(prev.next.val == val) {
                prev.next = prev.next.next;
            }else{
                prev = prev.next;
            }
        }
        return dummyNode.next;
    }
}
