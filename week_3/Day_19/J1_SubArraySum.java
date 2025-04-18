import java.util.*;

public class J1_SubArraySum {
    public int subarraySum(int[] nums, int k) {
        int count =0;
        int sum =0;
        HashMap<Integer,Integer> map = new HashMap<>();
        // Base case
        map.put(0,1);
        for(int num: nums){
            sum+=num;
            if(map.containsKey(sum-k)){
                count += map.get(sum-k);
            }
            map.put(sum, map.getOrDefault(sum,0)+1);
        }
        return count;
    }    

    public static void main(String[] args) {
        J1_SubArraySum obj = new J1_SubArraySum();
        int[] nums1 = {1, 1, 1};
        int k1 = 2;
        System.out.println(obj.subarraySum(nums1, k1));
    }
}