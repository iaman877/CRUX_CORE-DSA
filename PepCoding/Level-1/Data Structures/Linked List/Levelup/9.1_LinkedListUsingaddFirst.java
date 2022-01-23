class Solution {
    static ListNode th = null;
    static ListNode tt = null;
    public static void addFirst(ListNode node)
    {
        if(th == null)
        {
            th = node;
            tt = node;
        }
        else
        {
            node.next = th;
            th = node;
        }
    }
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        while(curr != null)
        {
            ListNode forw = curr.next;
            curr.next = null;
            addFirst(curr);
            curr = forw;
        }
        return th;
    }
}
