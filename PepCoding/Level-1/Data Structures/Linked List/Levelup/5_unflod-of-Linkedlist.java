import java.util.*;

class Main {
    public static class ListNode {
        int val = 0;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    
    public static ListNode reverseLL(ListNode head)
    {
        if(head == null || head.next == null) return head;
        ListNode prev = null;
        ListNode curr = head;
        ListNode forw = null;
        while(curr != null)
        {
            forw = curr.next;  // baclup
            curr.next = prev;   // Link
            prev = curr;       // move
            curr = forw;
        }
        return prev;
    }
    public static void unfold(ListNode head) {
     if(head == null || head.next == null) return;
     ListNode fh = head;  // first head
     ListNode fp = fh;    // first previous
     ListNode sh = head.next;  // Second head
     ListNode sp = sh;      // second previous
     while(sp != null && sp.next != null)
     {
        // backup 
        ListNode f = sp.next;
        
        // link
        fp.next = f;
        sp.next = f.next;
        
        // move
        fp = fp.next;
        sp = sp.next;
     }
     fp.next = null;     // making last pointer of second list  null
     sh = reverseLL(sh); // reverse second list
     fp.next = sh;        // connect second list to first list
    }

    static void printList(ListNode node) {
        while (node != null) {
            System.out.print(node.val + " ");
            node = node.next;
        }
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

        ListNode head = dummy.next;
        unfold(head);
        printList(head);
    }
}
