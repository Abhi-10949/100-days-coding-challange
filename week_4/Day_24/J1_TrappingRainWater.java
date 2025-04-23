

public class J1_TrappingRainWater {


    public int trap(int[] height) {
        int n = height.length;

        int leftmax[] = new int[n];
        leftmax[0] = height[0];
        for (int i = 1; i < n; i++) {
            leftmax[i] = Math.max(height[i], leftmax[i - 1]);
        }

        int rightmax[] = new int[n];
        rightmax[n - 1] = height[n - 1];

        for (int i = n - 2; i >= 0; i--) {
            rightmax[i] = Math.max(height[i], rightmax[i + 1]);
        }

        int trappedWater = 0;

        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(leftmax[i], rightmax[i]);
            trappedWater += waterlevel - height[i];
        }
        return trappedWater;
    }

    public static void main(String[] args) {
        J1_TrappingRainWater solution = new J1_TrappingRainWater();

        // Example 1
        int[] height1 = {0, 1, 0, 2, 1, 0, 1, 3, 2, 1, 2, 1};
        System.out.println("Trapped Water : " + solution.trap(height1));

        int[] height2 = {4, 2, 0, 3, 2, 5};
        System.out.println("Trapped Water : " + solution.trap(height2));
    }
}