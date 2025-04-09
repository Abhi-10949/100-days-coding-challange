public class J1_SortColor{
    public static void sortColor(int []nums){
        int low = 0;
        int mid = 0;
        int high = nums.length-1;

        while(mid<=high){
            if(nums[mid]==0){
                //swap
                int temp = nums[low];
                nums[low] = nums[mid];
                nums[mid] = temp;
                low++;
                mid++;
            }
            else if(nums[mid]==2){
                //swap
                int temp = nums[mid];
                nums[mid] = nums[high];
                nums[high] =temp;
                high--;
            }
            //if nums[mid]==1 then
            else{
                mid++;
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = {2,0,2,1,1,0};
        sortColor(nums);
        for(int i: nums){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}