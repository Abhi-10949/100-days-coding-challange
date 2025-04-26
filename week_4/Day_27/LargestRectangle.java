import java.util.Stack;

public class LargestRectangle {
    public int largestRectangleArea(int[] heights) {
        int n = heights.length;
        Stack<Integer> stack = new Stack<>();
        int maxArea = 0;

        for (int i = 0; i <= n; i++) {
            int currHeight = (i == n) ? 0 : heights[i];
            while (!stack.isEmpty() && currHeight < heights[stack.peek()]) {
                int height = heights[stack.pop()];
                int width = (stack.isEmpty()) ? i : i - stack.peek() - 1;
                maxArea = Math.max(maxArea, height * width);
            }
            stack.push(i);
        }

        return maxArea;
    }

    public static void main(String[] args) {
        LargestRectangle obj = new LargestRectangle();

        int[] heights1 = {2,1,5,6,2,3};
        System.out.println("Output: " + obj.largestRectangleArea(heights1));

        int[] heights2 = {2,4};
        System.out.println("Output: " + obj.largestRectangleArea(heights2));
    }
}
