import java.util.ArrayList;
import java.util.List;

public class FindKDistantIndices {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> result = new ArrayList<>();
        int r = 0; // this is the minimum index from where we can start checking
        int n = nums.length;
        
        for (int j = 0; j < n; ++j) {
            if (nums[j] == key) {
                int l = Math.max(r, j - k);
                r = Math.min(n - 1, j + k) + 1;
                for (int i = l; i < r; ++i) {
                    result.add(i);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        FindKDistantIndices sol = new FindKDistantIndices();

        int[] nums = {3, 4, 9, 1, 3, 9, 5};
        int key = 9;
        int k = 1;
        List<Integer> result = sol.findKDistantIndices(nums, key, k);

        // Print the result
        System.out.println("K-distant indices: " + result);    
}
}