import java.util.*;

public class RemoveDuplicates1 {
    public static int removeDuplicates(int[] nums) {
        int j = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[j] != nums[i]) {
                nums[++j] = nums[i];
            }
    }
    return ++j;
}

    public static void main(String[] args) {
        int[] nums1 = {1, 1, 2};
        int len1 = RemoveDuplicates1.removeDuplicates(nums1);
        System.out.println("Example 1: " + len1 + ", nums = " + Arrays.toString(Arrays.copyOf(nums1, len1)));
    }
}


