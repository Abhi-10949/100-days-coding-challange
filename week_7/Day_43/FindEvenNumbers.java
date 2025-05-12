import java.util.*;
public class FindEvenNumbers {
    public static int[] findEvenNumbers(int[] digits) {
        int[] count = new int[10];
        for (int d : digits) {
            count[d]++;
        }

        Set<Integer> result = new TreeSet<>();

        for (int i = 100; i <= 999; i += 2) {
            int hundreds = i / 100;
            int tens = (i / 10) % 10;
            int ones = i % 10;

            int[] temp = new int[10];
            temp[hundreds]++;
            temp[tens]++;
            temp[ones]++;

            boolean valid = true;
            for (int j = 0; j < 10; j++) {
                if (temp[j] > count[j]) {
                    valid = false;
                    break;
                }
            }
            if (valid) {
                result.add(i);
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
    public static void main(String[] args) {
        int digits[] = {2,1,3,0};
        int result[] = findEvenNumbers(digits);
        System.out.println(Arrays.toString(result));
    }
}
