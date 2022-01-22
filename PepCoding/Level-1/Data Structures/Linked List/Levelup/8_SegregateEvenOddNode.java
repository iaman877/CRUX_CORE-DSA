import java.util.*;

class Main {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static ListNode segregateEvenOdd(ListNode head) {
        if(head == null || head.next == null) return head;
        ListNode dumyEven = new ListNode(-1);
        ListNode dumyOdd = new ListNode(-1);
        ListNode evenTail = dumyEven;
        ListNode oddTail = dumyOdd;
        ListNode curr = head;
        while(curr != null)
        {
            if(curr.val % 2 != 0)
            {
                oddTail.next = curr;
                oddTail = oddTail.next;
            } else {
                evenTail.next = curr;
                evenTail = evenTail.next; 
            }
            curr = curr.next;
        }
        evenTail.next = dumyOdd.next;
        oddTail.next = null;
        return dumyEven.next;
        
        
    }

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        ListNode dummy = new ListNode(-1);
        ListNode prev = dummy;
        while (n-- > 0) {
            prev.next = new ListNode(scn.nextInt());
            prev = prev.next;
        }

        ListNode head = segregateEvenOdd(dummy.next);
        while (head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }
}
