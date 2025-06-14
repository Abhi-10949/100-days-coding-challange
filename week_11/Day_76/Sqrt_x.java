
import java.util.Scanner;

class Sqrt_x {
    public int mySqrt(int x) {
        if(x == 0 || x == 1){
            return x;
        }

        int start = 1;
        int end = x;
        int mid = -1;
        while(start<= end){
            mid = start + (end - start)/2;
            if((long) mid * mid > (long)x){
                end = mid -1;
            } else if(mid * mid == x){
                return mid;
            } else{
                start = mid +1;
            }
        }
        return Math.round(end);
    }

    public static void main(String[] args) {
        Sqrt_x obj = new Sqrt_x();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int x = sc.nextInt();

        int result = obj.mySqrt(x);
        System.out.println("Square root of "+x+" is "+result+".");
    }
}