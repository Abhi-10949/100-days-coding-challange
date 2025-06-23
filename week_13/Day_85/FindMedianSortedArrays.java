
public class FindMedianSortedArrays {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int num1 = 0;
        int num2 = 0;
        int mid = (n1 + n2) / 2;
        int i = 0, j = 0, countElements = -1;

        while (i < n1 && j < n2) {
            int val;
            if (nums1[i] < nums2[j]) {
                val = nums1[i++];
            } else {
                val = nums2[j++];
            }
            countElements++;
            if (countElements == mid - 1) num1 = val;
            if (countElements == mid) num2 = val;
        }

        while (i < n1) {
            int val = nums1[i++];
            countElements++;
            if (countElements == mid - 1) num1 = val;
            if (countElements == mid) num2 = val;
        }

        while (j < n2) {
            int val = nums2[j++];
            countElements++;
            if (countElements == mid - 1) num1 = val;
            if (countElements == mid) num2 = val;
        }

        if ((n1 + n2) % 2 == 0)
            return (num1 + num2) / 2.0;
        else
            return num2;
    }

    public static void main(String[] args) {
        FindMedianSortedArrays sol = new FindMedianSortedArrays();

        int[] nums1 = {1, 3};
        int[] nums2 = {2};

        double median = sol.findMedianSortedArrays(nums1, nums2);
        System.out.println("Median is: " + median);  // Output: 2.0
    }
}
