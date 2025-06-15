
public class ClimbStairs {
    public static int climbStairs(int n){
        if(n<= 2) return n;
        int a = 1, b = 2, temp;

        for(int i = 3;i<= n;i++){
            temp = b;
            b = a+b;
            a = temp;
        }
        return  b;
    }
    public static void main(String []args){
        int n = 5;
        System.out.println("Number of ways to climb "+n+" stairs: "+climbStairs(n));
    }
}
