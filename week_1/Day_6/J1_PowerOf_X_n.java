

public class J1_PowerOf_X_n {

    public static double myPow(double x, long n){
        //base case 
        if(n == 0){
            return 1;
        }
        //kaam
        if(n<0){
            x = 1/x;
            n = -n;
        }
        double halfpower = myPow(x, n/2);
        double halfpoweroutput = halfpower * halfpower;

        if(n % 2 != 0){
            return x * halfpoweroutput;
        }
        return halfpoweroutput;
    }

    public static void main(String[] args) {
        System.out.println(myPow(2.0000, 10));
    }
}
