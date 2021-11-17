import java.util.Scanner;

public class CofeeMachine {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Amount: ");
    double amount = sc.nextDouble();
    String menu = "1. short espresso\t0.50\n2. long espresso\t0.60\n3.cappuccino\t\t0.85\n4. coffee with milk\t0.90\n5. caffeinefree\t0.60\n";
    System.out.print(menu);
    System.out.print("Your choice: ");
    int choice = sc.nextInt();
    sc.close();
 
        if(choice<=0 || choice >5){
            System.out.println("Please select from the menu");
            return;
        }
        if(choice==1){
            amount-=0.50;
        }else if(choice==2){
            amount-=0.60;
        }else if(choice==3){
            amount-=0.85;
        }else if(choice==4){
            amount-=0.90;
        }else if(choice==5){
            amount-=0.60;
        }

        if(amount<0){
            System.out.print("Not enought money");
            return;
        }else if(amount==0){
            System.out.print("Preparing your drink...");
        }else{
            System.out.println("Preparing your drink...");
            System.out.print("Change: ");
            System.out.printf("%.2f", amount);
        }

    }
}
