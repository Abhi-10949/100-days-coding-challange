public class ReverseInteger {
    public int reverse(int x) {
        int res = 0;
        boolean isNegative = x < 0;
        String strX = String.valueOf(Math.abs(x));
        StringBuilder sb = new StringBuilder(strX).reverse();

        try {
            res = Integer.parseInt(sb.toString());
        } catch (NumberFormatException e) {
            return 0;
        }
        return isNegative ? -res : res;
    }

    public static void main(String[] args) {
        ReverseInteger sol = new ReverseInteger();
        
        int input1 = 123;
        int input2 = -456;
        int input3 = 1534236469;

        System.out.println("Reverse of " + input1 + " is: " + sol.reverse(input1));
        System.out.println("Reverse of " + input2 + " is: " + sol.reverse(input2));
        System.out.println("Reverse of " + input3 + " is: " + sol.reverse(input3));
    }
}
