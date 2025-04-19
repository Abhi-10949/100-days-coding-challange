

public class J1_FindDuplicates {
    public static int findDuplicates(int []nums){
        int slow = nums[0];
        int fast = nums[0];

        // detecting the cycle
        do { 
            slow = nums[slow];
            fast = nums[nums[fast]];
        } while (slow!=fast);

        slow = nums[0];
        // detecting the start of the cycle (duplicates)
        while(slow!=fast){
            slow = nums[slow];
            fast = nums[fast];
        }
        return slow;
    }
    public static void main(String[] args) {
        int nums[]={1,3,4,2,2};
        J1_FindDuplicates obj = new J1_FindDuplicates();
        System.out.println("Duplicate is : "+obj.findDuplicates(nums));
    }    
}
