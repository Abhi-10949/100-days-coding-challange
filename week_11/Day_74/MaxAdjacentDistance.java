
public class MaxAdjacentDistance {
    public static int maxAdjacentDistance(int[] nums) {
        int maximum = 0;
        for(int i = 0;i<nums.length-1;i++){
            maximum = Math.max(maximum, Math.abs(nums[i+1] - nums[i]));
            maximum = Math.max(maximum, Math.abs(nums[nums.length-1]-nums[0]));
        }
        return maximum;
    }
    public static void main(String[] args) {
        MaxAdjacentDistance obj = new MaxAdjacentDistance();
        int nums[] = {1,2,4};

        int result = maxAdjacentDistance(nums);
        System.out.println(result);

    }
}
