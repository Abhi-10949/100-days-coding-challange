

public class J1_ConainerWithMostWater {
    public static int maxArea(int []height){
        int n = height.length;
        int left = 0 ;
        int right = n-1;
        int MaxArea = 0;
        while(left<right){
            int currentArea = Math.min(height[left], height[right])*(right-left);
            MaxArea = Math.max(MaxArea, currentArea);

            if(height[left]<height[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return MaxArea;
    }
    public static void main(String[] args) {
        int []height = {1,8,6,2,5,4,8,3,7};
        System.out.println("Max area the water contains is : "+ maxArea(height));
    }
}
