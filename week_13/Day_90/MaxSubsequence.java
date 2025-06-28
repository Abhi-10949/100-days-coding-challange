
import java.util.Arrays;

public class MaxSubsequence {
    public int[] maxSubsequence(int[] nums, int k) {
        int[][] valueWithIndex = new int[nums.length][2];

        for (int i = 0; i < nums.length; i++) {
            valueWithIndex[i] = new int[]{nums[i], i}; // Store value and its original index
        }

        // Sort by value in descending order
        Arrays.sort(valueWithIndex, (a, b) -> b[0] - a[0]);

        // Keep top k elements
        Arrays.sort(valueWithIndex, 0, k, (a, b) -> a[1] - b[1]); // Restore original order among top k

        int[] result = new int[k];
        for (int i = 0; i < k; i++) {
            result[i] = valueWithIndex[i][0]; // Extract the value
        }

        return result;
    }

    public static void main(String[] args) {
        MaxSubsequence sol = new MaxSubsequence();
        
        int[] nums = {3, 5, 2, 1, 7};
        int k = 3;
        
        int[] result = sol.maxSubsequence(nums, k);
        
        System.out.println("Max subsequence of length " + k + ": " + Arrays.toString(result));
    }
}
