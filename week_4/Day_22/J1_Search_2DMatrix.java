
import java.util.Scanner;



public class J1_Search_2DMatrix {
    public static boolean searchTwoDMatrix(int [][]matrix, int target){
        int m= matrix.length;
        int n = matrix[0].length;

        int row = 0;
        int col = n-1; //starting from the top right cornor

        while(row<m && col>=0){
            if(matrix[row][col]==target){
                return true;
            } else if(matrix[row][col]>target){
                col--; //move left
            } else{
                row++; //move right
            }
        }
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,4,7,11,15},
                        {2,5,8,12,19},
                        {3,6,9,16,22},
                        {10,13,14,17,24},
                        {18,21,23,26,30}};
        
        J1_Search_2DMatrix obj = new J1_Search_2DMatrix();

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the target : ");
        int target = sc.nextInt();
        System.out.print("Target is : "+obj.searchTwoDMatrix(matrix, target));
        System.out.println();
    }    
}
