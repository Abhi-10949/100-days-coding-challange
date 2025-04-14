import java.util.Arrays;

public class J1_MergeIntervals {
    public static int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));

        int[][] merged = new int[intervals.length][2];
        int index = -1;

        for (int[] interval : intervals) {
            if (index == -1 || merged[index][1] < interval[0]) {
                merged[++index] = interval;
            } else {
                merged[index][1] = Math.max(merged[index][1], interval[1]);
            }
        }
        return Arrays.copyOfRange(merged, 0, index + 1);
    }

    public static void main(String[] args) {
        int[][] intervals = {{1,3},{2,6},{8,10},{15,18}};
        int[][] result = merge(intervals);

        for (int[] interval : result) {
            System.out.println("[" + interval[0] + "," + interval[1] + "]");
        }
    }
}
