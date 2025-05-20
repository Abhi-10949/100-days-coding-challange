class Monotonic {
    public boolean isMonotonic(int[] nums) {
        int n  = nums.length;

        boolean increment = true;
        boolean decrement = true;
        for(int i =1;i<n;i++){
            if(nums[i]<nums[i-1]){
                increment = false;
            }
            if(nums[i]>nums[i-1]){
                decrement= false;
            }
        }
        return increment || decrement;
    }

    public static void main(String[] args) {
        Monotonic obj = new Monotonic();
        int []nums = {1,2,2,3};
        System.out.println(obj.isMonotonic(nums));
    }
}