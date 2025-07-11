import java.util.*;

class PascalTriangle {
    public List<List<Integer>> generate(int numRows) {
        if (numRows == 0) return new ArrayList<>();
        if (numRows == 1) {
            List<List<Integer>> result = new ArrayList<>();
            result.add(Arrays.asList(1));
            return result;
        }

        List<List<Integer>> prevRows = generate(numRows - 1);
        List<Integer> newRow = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            newRow.add(1);
        }

        for (int i = 1; i < numRows - 1; i++) {
            newRow.set(i, prevRows.get(numRows - 2).get(i - 1) + prevRows.get(numRows - 2).get(i));
        }

        prevRows.add(newRow);
        return prevRows;
    }

    public static void main(String[] args) {
        PascalTriangle sol = new PascalTriangle();
        int numRows = 5; // You can change this value to generate more or fewer rows
        List<List<Integer>> triangle = sol.generate(numRows);

        for (List<Integer> row : triangle) {
            System.out.println(row);
        }
    }
}
