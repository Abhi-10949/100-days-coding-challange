
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class J1_4Sum{
    public List<List<Integer>> fourSum(int []nums, int target){
        List<List<Integer>> result = new ArrayList<>();
        int len = nums.length;
        Arrays.sort(nums);

        for(int i = 0;i<len-3;i++){
            // skipping the duplicates
            if(i>0 && nums[i]==nums[i-1])  continue;

            for(int j = i+1;j<len-2;j++){
                if(j>i+1 && nums[j]==nums[j-1]) continue;

                // initilized the 2 pointer's
                int left = j+1;
                int right = len-1;

                while (left<right) {
                    long sum = nums[i]+nums[j];
                    sum += nums[left]+nums[right];

                    if(sum==target){
                        result.add(Arrays.asList(nums[i],nums[j],nums[left],nums[right]));
                            left++;
                            right--;

                            // skipping the duplicates elements in the array
                            while(left<right && nums[left]==nums[left-1]) left++;
                            while(left<right && nums[right]==nums[right+1]) right--;
                    } else if(sum<target){
                        left++;
                    } else{
                        right--;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int nums[] = {1,0,-1,0,-2,2};
        J1_4Sum j = new J1_4Sum();
        System.out.println(j.fourSum(nums, 0));       
    }
}