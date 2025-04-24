import java.util.*;

public class J1_SlidingWindowMax {

    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || k <= 0) return new int[0];

        int n = nums.length;
        int[] result = new int[n - k + 1];
        Deque<Integer> deque = new ArrayDeque<>();

        for (int i = 0; i < n; i++) {
            // Remove indices that are out of the current window
            while (!deque.isEmpty() && deque.peek() < i - k + 1) {
                deque.poll();
            }

            // Remove smaller elements from the back of the deque
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // Add current index
            deque.offer(i);

            // Add max of current window to result
            if (i >= k - 1) {
                result[i - k + 1] = nums[deque.peek()];
            }
        }
        return result;
    }

    // Main method for testing
    public static void main(String[] args) {
        J1_SlidingWindowMax obj = new J1_SlidingWindowMax();

        int[] nums = {1, 3, -1, -3, 5, 3, 6, 7};
        int k = 3;

        int[] result = obj.maxSlidingWindow(nums, k);
        System.out.println("Max sliding window: " + Arrays.toString(result));
    }

}
