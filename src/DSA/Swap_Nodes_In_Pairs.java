package DSA;



     //* Definition for singly-linked list.
     class ListNode {
          int val;
          ListNode next;
          ListNode() {}
          ListNode(int val) { this.val = val; }
          ListNode(int val, ListNode next) { this.val = val; this.next = next; }
      }
public class Swap_Nodes_In_Pairs {

        public ListNode swapPairs(ListNode head) {
            if (head == null || head.next == null) {
                return head;
            }
            ListNode ans =new ListNode();
            ans.next=head;
            ListNode pr=ans;
            while (pr.next != null && pr.next.next != null) {
                ListNode t1 = pr.next;
                ListNode t2 = pr.next.next;
                pr.next = t2;
                t1.next = t2.next;
                t2.next = t1;
                pr = pr.next.next;
            }
            return ans.next;
        }
    }
