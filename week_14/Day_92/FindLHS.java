
import java.util.Arrays;

public class FindLHS {
    public int findLHS(int[] nums) {
        Arrays.sort(nums);  // Sort the array to bring same and consecutive elements together
        int j = 0;
        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {
            // Move left pointer `j` forward until difference between nums[i] and nums[j] <= 1
            while (nums[i] - nums[j] > 1) {
                j++;
            }
            // If the difference is exactly 1, it can be a harmonious subsequence
            if (nums[i] - nums[j] == 1) {
                maxLength = Math.max(maxLength, i - j + 1);
            }
        }

        return maxLength;
    }

    public static void main(String[] args) {
        FindLHS sol = new FindLHS();

        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};

        int result = sol.findLHS(nums);

        System.out.println("Longest Harmonious Subsequence length: " + result);
    }
}

