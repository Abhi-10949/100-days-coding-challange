class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class RemoveElements {
    public ListNode removeElements(ListNode head, int val) {
        ListNode dummy = new ListNode(0, head);
        ListNode current = dummy;
        
        while (current.next != null) {
            if (current.next.val == val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }
        return dummy.next;
    }

    // Utility method to print linked list
    public void printList(ListNode head) {
        while (head != null) {
            System.out.print(head.val);
            if (head.next != null) System.out.print(" -> ");
            head = head.next;
        }
        System.out.println();
    }

    // Utility method to create linked list from array
    public ListNode createList(int[] arr) {
        ListNode dummy = new ListNode(0);
        ListNode current = dummy;
        for (int val : arr) {
            current.next = new ListNode(val);
            current = current.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        RemoveElements sol = new RemoveElements();

        int[] arr = {1, 2, 6, 3, 4, 5, 6}; // Input list
        int valToRemove = 6;

        ListNode head = sol.createList(arr);

        System.out.print("Original List: ");
        sol.printList(head);

        ListNode newHead = sol.removeElements(head, valToRemove);

        System.out.print("Updated List: ");
        sol.printList(newHead);
    }
}
