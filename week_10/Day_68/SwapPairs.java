class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

class SwapPairs {
    public ListNode swapPairs(ListNode head) {
        if(head == null || head.next == null) return head;

        ListNode temp = head.next; // store 2nd node
        head.next = swapPairs(temp.next); // recurse from 3rd node onward
        temp.next = head; // swap first and second

        return temp; // new head after swap
    }

    // Helper to print the linked list
    public void printList(ListNode head) {
        while(head != null) {
            System.out.print(head.val + " ");
            head = head.next;
        }
    }

    // Helper to create a linked list from array
    public ListNode createList(int[] arr) {
        if (arr.length == 0) return null;
        ListNode head = new ListNode(arr[0]);
        ListNode current = head;
        for(int i = 1; i < arr.length; i++) {
            current.next = new ListNode(arr[i]);
            current = current.next;
        }
        return head;
    }

    public static void main(String[] args) {
        SwapPairs sol = new SwapPairs();
        int[] values = {1, 2, 3, 4};
        ListNode head = sol.createList(values);

        System.out.print("Original list: ");
        sol.printList(head);

        head = sol.swapPairs(head);

        System.out.print("\nSwapped list: ");
        sol.printList(head);
        System.out.println(); // this is only for the next line to remove the % sign 
    }
}
