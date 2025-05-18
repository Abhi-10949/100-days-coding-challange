import java.util.Arrays;

class TwoSum2 {
    public int[] twoSum(int[] numbers, int target) {
        int left = 0;
        int right = numbers.length - 1;
        
        while (left < right) {
            int currentSum = numbers[left] + numbers[right];
            
            if (currentSum == target) {
                return new int[]{left + 1, right + 1};
            } else if (currentSum < target) {
                left++;
            } else {
                right--;
            }
        }
        
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        TwoSum2 solution = new TwoSum2();
        
        // Example 1
        int[] numbers1 = {2,7,11,15};
        int target1 = 9;
        System.out.println("Example 1: " + Arrays.toString(solution.twoSum(numbers1, target1)));
    }
}
