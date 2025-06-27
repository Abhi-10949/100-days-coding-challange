import java.util.*;

public class LongestSubsequenceRepeatedK {

    // Check if sub * k is a subsequence of s
    public boolean solve(String sub, String s, int k) {
        int i = 0, count = 0;
        for (char ch : s.toCharArray()) {
            if (ch == sub.charAt(i)) {
                i++;
                if (i == sub.length()) {
                    i = 0;
                    count++;
                    if (count == k) return true;
                }
            }
        }
        return false;
    }

    // BFS to find the longest valid subsequence repeated k times
    public String longestSubsequenceRepeatedK(String s, int k) {
        String ans = "";
        Queue<String> queue = new LinkedList<>();
        queue.add("");

        while (!queue.isEmpty()) {
            String curr = queue.poll();
            for (char ch = 'a'; ch <= 'z'; ch++) {
                String next = curr + ch;
                if (solve(next, s, k)) {
                    // Always keep lexicographically last longest answer
                    if (next.length() > ans.length() || (next.length() == ans.length() && next.compareTo(ans) > 0)) {
                        ans = next;
                    }
                    queue.add(next);
                }
            }
        }
        return ans;
    }

    // Main method for testing
    public static void main(String[] args) {
        LongestSubsequenceRepeatedK sol = new LongestSubsequenceRepeatedK();
        String s = "letsleetcode";
        int k = 2;

        String result = sol.longestSubsequenceRepeatedK(s, k);
        System.out.println("Longest repeated subsequence: " + result);
    }
}
