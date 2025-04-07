
import java.util.Scanner;

public class J1_SearchTwoD_Array{
    public static boolean searchInTwoD(int [][]matrix, int target){
        int rows = matrix.length;
        int cols = matrix[0].length;

        int i = 0, j = rows*cols-1;

        while(i<= j){
            int mid = i+(j-1)/2;
            int row = mid/cols;
            int col = mid%cols;

            int midValue= matrix[row][col];
            if (midValue==target) {
                return true;
            } 
            else if(midValue < target){
                i = mid+1;
            }
            else{
                j = mid-1;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,3,5,7},
                        {10,11,16,20},
                        {23,30,34,60}};
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target to be found: ");
        int n = sc.nextInt();

        System.out.println(searchInTwoD(matrix, n));
    }
}