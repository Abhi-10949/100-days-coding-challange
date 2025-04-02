import java.util.*;


public class J1_MeregeTwoSorted {
    public static void mergeTwoSortedArray(int nums1[], int nums2[], int n, int m){
        int i = n-1;
        int j = m-1;
        int idx = m+n-1;

        while(i>=0 && j>=0){
            if(nums1[i]>nums2[j]){
                nums1[idx]=nums1[i];
                i--;
                idx--;
            }
            else{
                nums1[idx]=nums2[j];
                j--;
                idx--;
            }
        }

        while(j>=0){
            nums1[idx]=nums2[j];
            j--;
            idx--;
        }
    }

    public static void main(String[] args) {
        int []nums1={1,2,3,0,0,0};
        int []nums2={5,6,7};

        int n=3;
        int m=3;
        mergeTwoSortedArray(nums1, nums2, n,m);
        System.out.println(Arrays.toString(nums1));

    }
}