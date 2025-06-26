import java.util.Scanner;

class LongestSubsequence {
    public int longestSubsequence(String s, int k) {
        int sm = 0;
        int cnt = 0;
        int bits = (int)(Math.log(k) / Math.log(2)) + 1;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(s.length() - 1 - i);
            if (ch == '1') {
                if (i < bits && sm + (1 << i) <= k) {
                    sm += 1 << i;
                    cnt++;
                }
            } else {
                cnt++;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter binary string: ");
        String s = sc.next();

        System.out.print("Enter integer k: ");
        int k = sc.nextInt();

        LongestSubsequence sol = new LongestSubsequence();
        int result = sol.longestSubsequence(s, k);

        System.out.println("Longest valid subsequence length: " + result);
    }
}
