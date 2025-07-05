import java.util.HashMap;

public class FindLucky {

    public int findLucky(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : arr) {
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        int luckyInteger = -1;

        for (int key : map.keySet()) {
            if (map.get(key) == key) {
                luckyInteger = Math.max(luckyInteger, key);
            }
        }

        return luckyInteger;
    }

    public static void main(String[] args) {
        FindLucky sol = new FindLucky();

        int[] arr = {2, 2, 3, 4}; 
        int result = sol.findLucky(arr);

        System.out.println("The lucky integer is: " + result);
    }
}
