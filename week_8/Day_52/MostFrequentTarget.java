import java.util.*;
public class  MostFrequentTarget {
    public static int mostFrequent(int[] nums, int key) {
		HashMap<Integer, Integer> hm = new HashMap<>();
		int maxFreq = 0;
		int maxTarget = -1;
		for (int i = 0; i < nums.length-1; i++) {
			if(nums[i] == key) {
				int target = nums[i+1];

				hm.put(target, hm.getOrDefault(target, 0) + 1);
			}
		}
	
		for (int target : hm.keySet()) {
			if (hm.get(target) > maxFreq) {
				maxFreq = hm.get(target);
				maxTarget = target;
			}
		}
		return maxTarget;
	}

	public static void main(String[] args) {
		MostFrequentTarget obj = new MostFrequentTarget();
		int[] nums = {1, 100, 200, 1, 100};
		int key = 1;
		System.out.println(obj.mostFrequent(nums, key));
	}
}
