public class TitletoNumber {
    public int titleToNumber(String columnTitle) {
        int result = 0;
        for (int i = 0; i < columnTitle.length(); i++) {
            result = result * 26 + (columnTitle.charAt(i) - 'A' + 1);
        }
        return result;
    }

    public static void main(String[] args) {
        TitletoNumber sol = new TitletoNumber();

        // Test cases
        String column1 = "A";
        String column2 = "Z";
        String column3 = "AA";
        String column4 = "AB";
        String column5 = "ZY";

        System.out.println("Column '" + column1 + "' = " + sol.titleToNumber(column1)); // 1
        System.out.println("Column '" + column2 + "' = " + sol.titleToNumber(column2)); // 26
        System.out.println("Column '" + column3 + "' = " + sol.titleToNumber(column3)); // 27
        System.out.println("Column '" + column4 + "' = " + sol.titleToNumber(column4)); // 28
        System.out.println("Column '" + column5 + "' = " + sol.titleToNumber(column5)); // 701
    }
}
