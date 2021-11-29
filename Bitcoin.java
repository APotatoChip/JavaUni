import java.util.Scanner;
public class Bitcoin {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("What's the current BUY price? ");
        double currPriceBuy = sc.nextDouble();
        System.out.print("What's the current SELL price? ");
        double currPriceSell = sc.nextDouble();
        System.out.print("What operation (BUY or SELL)? ");
        String operation = sc.next();
        System.out.print("What amount do you want to trade? ");
        double amountToTrade = sc.nextDouble();
        double sum=0;
        if(amountToTrade<=0){
            System.out.print("You have to trade something!");
            return;
        }
        if(operation.equalsIgnoreCase("BUY")){
            sum=amountToTrade*currPriceBuy;
            System.out.printf("You've bought %.6f coins for %.2f leva\n",amountToTrade,sum);
        }else if(operation.equalsIgnoreCase("SELL")){
            sum=amountToTrade*currPriceSell;
            System.out.printf("You've sold %.6f coins for %.2f leva\n", amountToTrade,sum);
        }else{
            System.out.print("Unsupported operation");
            return;
        }
    }
}
