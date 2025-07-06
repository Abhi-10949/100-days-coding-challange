import java.util.HashMap;
import java.util.Map;

public class FindSumPairs {
    int[] n1, n2;
    Map<Integer, Integer> m = new HashMap<>();

    public FindSumPairs(int[] nums1, int[] nums2) {
        n1 = nums1;
        n2 = nums2;
        for (int x : n2) {
            m.put(x, m.getOrDefault(x, 0) + 1);
        }
    }

    public void add(int i, int v) {
        m.put(n2[i], m.get(n2[i]) - 1);
        if (m.get(n2[i]) == 0) m.remove(n2[i]);
        n2[i] += v;
        m.put(n2[i], m.getOrDefault(n2[i], 0) + 1);
    }

    public int count(int t) {
        int c = 0;
        for (int x : n1) {
            c += m.getOrDefault(t - x, 0);
        }
        return c;
    }


    public static void main(String[] args) {
        int[] nums1 = {1, 2, 3};
        int[] nums2 = {3, 4, 5};

        FindSumPairs obj = new FindSumPairs(nums1, nums2);

        System.out.println("Count of pairs with sum 6: " + obj.count(6));
        
        obj.add(1, 1);

        System.out.println("Count of pairs with sum 6 after add: " + obj.count(6));
        System.out.println("Count of pairs with sum 7 after add: " + obj.count(7)); 
    }
}
