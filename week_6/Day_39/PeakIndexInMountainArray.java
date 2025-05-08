public class PeakIndexInMountainArray {

    public int peakIndexInMountainArray(int[] arr) {
        return binarySearch(arr, 1, arr.length - 2);
    }

    private int binarySearch(int[] arr, int start, int end) {
        if (start > end) return -1;

        int mid = start + (end - start) / 2;

        if (arr[mid - 1] < arr[mid] && arr[mid] > arr[mid + 1]) {
            return mid;
        }

        if (arr[mid - 1] < arr[mid]) {
            return binarySearch(arr, mid + 1, end); // Peak on right
        } else {
            return binarySearch(arr, start, mid - 1); // Peak on left
        }
    }

    public static void main(String[] args) {
        PeakIndexInMountainArray solution = new PeakIndexInMountainArray();

        int[] arr1 = {0, 2, 4, 6, 3, 1};
        int[] arr2 = {1, 3, 5, 7, 6, 4, 2};
        int[] arr3 = {0, 1, 0};

        System.out.println("Peak index of arr1: " + solution.peakIndexInMountainArray(arr1)); // Output: 3
        System.out.println("Peak index of arr2: " + solution.peakIndexInMountainArray(arr2)); // Output: 3
        System.out.println("Peak index of arr3: " + solution.peakIndexInMountainArray(arr3)); // Output: 1
    }
}
