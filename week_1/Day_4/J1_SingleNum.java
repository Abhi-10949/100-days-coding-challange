
public class J1_SingleNum {
    public static int getSingleNum(int nums[]){
        int result=0;
        for(int num : nums){
            result ^= num;
        }
        return result;
    }

    public static void main(String []args){
        int nums[]={1,2,2,3,3};
        System.out.println("Single Number: "+ getSingleNum(nums));
    }
}
