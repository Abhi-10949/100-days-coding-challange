
public class AddBinary {
    public static String addBinary(String a, String b) {
        StringBuilder sb = new StringBuilder();
        int carry =0;
        int n1 = a.length()-1;
        int n2 = b.length()-1;

        while(n1>= 0|| n2>= 0||carry == 1){
            if(n1>=0)
                carry += a.charAt(n1--)-'0';
            if(n2>=0)
                carry += b.charAt(n2--)-'0';
            
            sb.append(carry % 2);
            carry/= 2;
        }
        return sb.reverse().toString();
    }

    public static void main(String []args){
        AddBinary obj = new AddBinary();
        String a = "1010";
        String b = "1011";
        String result = obj.addBinary(a, b);
        System.out.println("The sum of "+a+" and "+b+" is: "+result);
    }
}
