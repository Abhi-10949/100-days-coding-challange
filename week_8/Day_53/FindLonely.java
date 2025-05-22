import java.util.*;

public class FindLonely {
    public List<Integer> findLonely(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for(int num: nums){
            map.put(num, map.getOrDefault(num, 0)+1);
        }
        for(int num: nums){
            if(!map.containsKey(num -1) && !map.containsKey(num+1) && map.get(num) == 1){
                list.add(num);
            }
        }
        return list;
    }
    public static void main(String[] args) {
        FindLonely solution = new FindLonely();
        
        int[] nums = {10, 6, 5, 8};
        List<Integer> lonelyNumbers = solution.findLonely(nums);
        
        System.out.println("Lonely numbers: " + lonelyNumbers);
    }
}
