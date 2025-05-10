public class SingleElementInSortedArray {
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
        SingleElementInSortedArray solution = new SingleElementInSortedArray();

        int[] nums1 = {1, 1, 2, 3, 3, 4, 4, 8, 8};
        int[] nums2 = {3, 3, 7, 7, 10, 11, 11};

        System.out.println("Single element in nums1: " + solution.singleNonDuplicate(nums1));
        System.out.println("Single element in nums2: " + solution.singleNonDuplicate(nums2)); 
    }
}
