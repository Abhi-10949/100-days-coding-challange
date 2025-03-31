
import java.util.Scanner;

public class J1_MajorityElement {
    public static int majorityElement(int nums[]){
        int n= nums.length;
        int candidate=nums[0];
        int count=1;

        for(int i = 1;i<n;i++){
            if(nums[i]==candidate){
                count++;
            }
            else{
                count--;
                if(count == 0){
                    candidate = nums[i];
                    count=1;
                }
            }
        }
        return candidate;
    }
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();
        int nums[]=new int[n];

        System.out.println("Enter the elemets of the array:");
        for(int i =0;i<n;i++){
            nums[i]=sc.nextInt();
        }
        System.out.println(majorityElement(nums));
    }
}
