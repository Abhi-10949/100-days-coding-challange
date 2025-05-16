class ListNode {
    int val;
    ListNode next;

    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode();  // Dummy node to simplify logic
        ListNode current = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val > list2.val) {
                current.next = list2;
                list2 = list2.next;
            } else {
                current.next = list1;
                list1 = list1.next;
            }
            current = current.next;
        }

        current.next = (list1 != null) ? list1 : list2;
        return dummy.next;
    }
}

public class MergeTwoLists {
    public static void main(String[] args) {
        // First sorted list: 1 -> 3 -> 5
        ListNode list1 = new ListNode(1, new ListNode(3, new ListNode(5)));

        // Second sorted list: 2 -> 4 -> 6
        ListNode list2 = new ListNode(2, new ListNode(4, new ListNode(6)));

        Solution obj = new Solution();
        ListNode merged = obj.mergeTwoLists(list1, list2);

        // Print merged list
        printList(merged);
    }

    // Utility function to print a linked list
    public static void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }
}
