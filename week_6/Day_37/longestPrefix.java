public class longestPrefix {

    public String longestPrefix(String s) {
        int[] dp = new int[s.length()];
        int len = 0, i = 1;
        while (i < s.length()) {
            if (s.charAt(i) == s.charAt(len)) {
                dp[i] = ++len;
                i++;
            } else {
                if (len > 0) {
                    len = dp[len - 1];
                } else {
                    dp[i] = 0;
                    i++;
                }
            }
        }
        return s.substring(0, dp[dp.length - 1]);
    }

    public static void main(String[] args) {
        longestPrefix solution = new longestPrefix();
        String input = "level";
        String result = solution.longestPrefix(input);
        System.out.println("Longest prefix which is also a suffix: " + result);
    }
}
