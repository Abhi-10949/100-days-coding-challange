
import java.util.Scanner;



public class J1_RepeatMiss {

    public static int[] findMissingRepeatinValues(int grid[][]){
        int n = grid.length;
        int size = n*n;
        int count[]=new int[size+1];
        int repeating =-1, missing =-1;

        for(int i =0;i<n;i++){
            for(int j = 0;j<n;j++){
                count[grid[i][j]]++;
            }
        }

        for(int i =1;i<=size;i++){
            if(count[i]==2){
                repeating = i;
            }

            if(count[i]==0){
                missing = i;
            }
        }

        return new int[]{repeating, missing};
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the row & col. : ");
        int n = sc.nextInt();
        System.out.print("Enter the elements in the grid:");
        int grid[][]=new int[n][n];
        
        

        for(int i =0; i<n;i++){
            for(int j =0;j<n;j++){
                grid[i][j]=sc.nextInt();
            }
        }

        System.out.println("Grid entered:");
        for(int i =0; i<n;i++){
            for(int j =0;j<n;j++){
                System.out.print(grid[i][j]+"  ");
            }
            System.out.println();
        }

        int result[]=findMissingRepeatinValues(grid);
        System.out.println("Repeating: " + result[0]+" Missing: " + result[1]);
    }
}
