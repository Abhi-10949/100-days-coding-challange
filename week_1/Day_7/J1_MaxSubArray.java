
public class J1_MaxSubArray {
    public static int maxSub(int nums[]){
        int currSum = nums[0];
        int maxSum = nums[0];

        for(int i = 1; i<nums.length;i++){
            currSum = Math.max(nums[i], currSum+nums[i]);
            maxSum = Math.max(maxSum, currSum);
        }
        return maxSum;
    }

    public static void main(String[] args) {
        int nums[] = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println("The maximum sub array sum : "+maxSub(nums));
    }
}
