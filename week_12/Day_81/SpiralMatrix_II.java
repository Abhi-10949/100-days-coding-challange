import java.util.Arrays;
import java.util.Scanner;


public class SpiralMatrix_II {
    public int[][] generateMatrix(int n) {
        int [][]matrix = new int[n][n];
        int rowStart = 0, rowEnd = n-1;
        int colStart = 0, colEnd = n-1;
        int num = 1;

        while(num<= n*n){
            //traverse right
            for(int i = colStart;i<=colEnd;i++){
                matrix[rowStart][i] = num++;
            }
            rowStart++;

            // traverse down
            for(int i = rowStart;i<=rowEnd;i++){
                matrix[i][colEnd] = num++;
            }
            colEnd--;

            // traverse left
            if(rowStart<= rowEnd){
                for(int i = colEnd;i>=colStart;i--){
                    matrix[rowEnd][i] = num++;
                }
            }
            rowEnd--;

            // traverse up
            if(colStart<= colEnd){
                for(int i = rowEnd;i>= rowStart;i--){
                    matrix[i][colStart] = num++;
                }
            }
            colStart++;
        }
        return matrix;
    }

    public static void main(String[] args) {
        SpiralMatrix_II obj = new SpiralMatrix_II();
        System.out.print("Enter size of the matrix: ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int [][]result = obj.generateMatrix(n);

        System.out.println("Spiral matrix of the size of "+n+"x"+n+" is: "+result);
        for(int[] res: result){
            System.out.println(Arrays.toString(res));
        }
    }
}