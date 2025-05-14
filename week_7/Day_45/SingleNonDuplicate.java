
public class SingleNonDuplicate {
    public int singleNonDuplicate(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            int mid = start + (end - start) / 2;
            // Ensure mid is even to compare with next element
            if (mid % 2 == 1) {
                mid--; // make mid even
            }
            if (nums[mid] == nums[mid + 1]) {
                start = mid + 2;
            } else {
                end = mid;
            }
        }
        return nums[start];
    }

    public static void main(String[] args) {
        SingleNonDuplicate obj = new SingleNonDuplicate();
        int []nums = {1,1,2,3,3,4,4,8,8};
        System.out.println(obj.singleNonDuplicate(nums));
    }
}
