
import java.util.Scanner;

public class J1_Buy_N_Sell{

    public static int stockProfit(int prices[]){
        int minProfit = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices){
            minProfit = Math.min(minProfit, price);
            maxProfit = Math.max(maxProfit, price-minProfit);
        }
        return maxProfit;
    }

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int n = sc.nextInt();

        int prices[]=new int[n];
        System.out.print("Enter the price of the stock: ");
        for(int i = 0;i<prices.length;i++){
            prices[i]= sc.nextInt();
        }
        System.out.println("The maximum profit is: "+stockProfit(prices));
    }
}