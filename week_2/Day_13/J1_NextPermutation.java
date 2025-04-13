
import java.util.Scanner;



public class J1_NextPermutation {

    public static void nextPermutation(int nums[]){
        int pivot = -1;
        int i,j;
        for(i = nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                break;
            }
        }
        if(i>=0){
            for(j =nums.length-1;j>i;j--){
                if(nums[j]>nums[i]){
                    break;
                }
            }
            swap(nums, i, j);
        }
        reverse(nums, i+1, nums.length-1);
    }

    //Swap function
    public static void swap(int nums[], int a, int b){
        int temp = nums[a];
        nums[a]=nums[b];
        nums[b]=temp;
    }

    // reverse function
    public static void reverse(int nums[], int start, int end){
        while (start<end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array:");
        int n=sc.nextInt();

        int []nums = new int[n];
        System.out.print("Enter the elements in the array: ");
        for(int i = 0 ;i<n;i++){
            nums[i]=sc.nextInt();
        }
        nextPermutation(nums);

        for(int num:nums){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
