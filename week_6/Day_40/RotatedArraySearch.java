public class RotatedArraySearch {

    public int search(int[] nums, int target) {
        return binarySearch(nums, target, 0, nums.length - 1);
    }

    public int binarySearch(int[] nums, int target, int si, int ei) {
        if (si > ei) {
            return -1;
        }

        int mid = si + (ei - si) / 2;

        if (nums[mid] == target) {
            return mid;
        }

        // Mid on left sorted part
        if (nums[si] <= nums[mid]) {
            // Case A: target lies between si and mid
            if (nums[si] <= target && target <= nums[mid]) {
                return binarySearch(nums, target, si, mid - 1);
            } else {
                return binarySearch(nums, target, mid + 1, ei);
            }
        } 
        // Mid on right sorted part
        else {
            // Case C: target lies between mid and ei
            if (nums[mid] < target && target <= nums[ei]) {
                return binarySearch(nums, target, mid + 1, ei);
            } else {
                return binarySearch(nums, target, si, mid - 1);
            }
        }
    }

    public static void main(String[] args) {
        RotatedArraySearch solution = new RotatedArraySearch();

        int[] nums1 = {4, 5, 6, 7, 0, 1, 2};
        int target1 = 0;

        int[] nums2 = {6, 7, 8, 1, 2, 3, 4};
        int target2 = 3;

        int[] nums3 = {1};
        int target3 = 0;

        System.out.println("Index of target1: " + solution.search(nums1, target1)); 
        System.out.println("Index of target2: " + solution.search(nums2, target2)); 
        System.out.println("Index of target3: " + solution.search(nums3, target3)); 
    }
}
