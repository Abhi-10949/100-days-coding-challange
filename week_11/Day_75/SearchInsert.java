public class SearchInsert {

    public int searchInsert(int[] nums, int target) {
        int left = 0;
        int right = nums.length -1;

        while(left <= right){
            int mid = left + (right - left )/2;

            if(nums[mid] == target){
                return mid;
            } else if(nums[mid] > target){
                right = mid - 1;
            } else{
                left = mid + 1;
            }
        }
        return left;
    }

    public static void main(String[] args) {
        SearchInsert solution = new SearchInsert();
        int[] nums = {1, 3, 5, 6};
        int target = 5;

        int result = solution.searchInsert(nums, target);
        System.out.println("Insert position: " + result); // Output: 2
    }
}
