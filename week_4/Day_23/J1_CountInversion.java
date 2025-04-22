import java.util.*;

public class J1_CountInversion {
    static int mod = 1_000_000_007;

    public static int numberOfPermutations(int n, int[][] requirements) {
        Map<Integer, Integer> reqMap = new HashMap<>();
        for (int[] req : requirements) {
            reqMap.put(req[0], req[1]);
        }

        int maxInversions = n * (n - 1) / 2;
        Long[][] dp = new Long[n + 1][maxInversions + 1];

        return (int) dfs(0, 0, n, reqMap, dp);
    }

    private static long dfs(int idx, int inversions, int n, Map<Integer, Integer> reqMap, Long[][] dp) {
        if (idx == n) {
            return 1;
        }

        if (dp[idx][inversions] != null) return dp[idx][inversions];

        if (reqMap.containsKey(idx) && reqMap.get(idx) != inversions) {
            return dp[idx][inversions] = 0L;
        }

        long ans = 0;
        for (int i = 0; i <= idx; i++) {
            int newInversions = inversions + (idx - i);
            ans = (ans + dfs(idx + 1, newInversions, n, reqMap, dp)) % mod;
        }

        return dp[idx][inversions] = ans;
    }

    public static void main(String[] args) {

        int n1 = 3;
        int[][] requirements1 = {{2, 2}, {0, 1}};
        System.out.println("Output 1: " + numberOfPermutations(n1, requirements1)); 

        int n2 = 3;
        int[][] requirements2 = {{2, 2}, {0, 0}};
        System.out.println("Output 2: " + numberOfPermutations(n2, requirements2)); 
    }
}
