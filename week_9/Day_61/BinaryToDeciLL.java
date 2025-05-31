class ListNode {
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val, ListNode next) { this.val = val; this.next = next; }
}

public class BinaryToDeciLL {
    public int getDecimalValue(ListNode head) {
        int ans = 0;
        for (ListNode temp = head; temp != null; temp = temp.next) {
            ans = (ans << 1) + temp.val;
        }
        return ans;
    }

    public static void main(String[] args) {
        // Creating linked list: 1 -> 0 -> 1 (binary for 5)
        ListNode third = new ListNode(1);
        ListNode second = new ListNode(0, third);
        ListNode first = new ListNode(1, second);

        BinaryToDeciLL sol = new BinaryToDeciLL();
        int decimalValue = sol.getDecimalValue(first);
        System.out.println("Decimal Value: " + decimalValue);  // Output: 5
    }
}
