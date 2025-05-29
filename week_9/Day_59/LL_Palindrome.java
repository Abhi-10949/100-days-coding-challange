public class LL_Palindrome {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }

    public static class Solution {
        public boolean isPalindrome(ListNode head) {
            if (head == null || head.next == null) return true;
            // Step: 1 Find the middle of the LL
            ListNode slow = head;
            ListNode fast = head;
            while (fast != null && fast.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }

            // Step 2: Reverse the second half
            ListNode prev = null;
            ListNode curr = slow;
            while (curr != null) {
                ListNode next = curr.next;
                curr.next = prev;
                prev = curr;
                curr = next;
            }

            // Step 3: Compare both halves
            ListNode left = head;
            ListNode right = prev;
            while (right != null) {
                if (left.val != right.val) return false;
                left = left.next;
                right = right.next;
            }
            return true;
        }
    }
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(2);
        head.next.next.next = new ListNode(1);

        Solution sol = new Solution();
        boolean result = sol.isPalindrome(head);

        System.out.println("Is Palindrome? " + result);
    }
}
