import java.util.Scanner;
public class CofeeMachine {
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Amount: ");
    float amount = sc.nextFloat();
    double change ;
    String menu = "1. short espresso\t0.50\n2. long espresso\t0.60\n3.cappuccino\t\t0.85\n4. coffee with milk\t0.90\n5. caffeinefree\t0.60\n";
    System.out.print(menu);
    System.out.print("Your choice: ");
    int choice = sc.nextInt();
    boolean enoughMoney;
    switch(choice){
        case 1:
        change=amount-0.50;
        if(change>0){
            enoughMoney=true;
            
       
        }else{
            enoughMoney=false;
        }
        if(enoughMoney){

            System.out.println("Preparing your drink...");
            System.out.print("Change: ");
            System.out.printf("%.2f",(float)change);
        }else{
    System.out.println("Not enough money");
        }
        break;
        case 2:
        change=amount-0.60;
        if(change>0){
            enoughMoney=true;
        }else{
            enoughMoney=false;
        }
        if(enoughMoney){

            System.out.println("Preparing your drink...");
            System.out.print("Change: ");
            System.out.printf("%.2f",(float)change);
        }else{
    System.out.println("Not enough money");
        }
        break;
        case 3:
        change=amount-0.85;
        if(change>0){
            enoughMoney=true;
        }else{
            enoughMoney=false;
        }
        if(enoughMoney){

            System.out.println("Preparing your drink...");
            System.out.print("Change: ");
            System.out.printf("%.2f",(float)change);
        }else{
    System.out.println("Not enough money");
        }
        break;
        case 4:
        change=amount-0.90;
        if(change>0){
            enoughMoney=true;
        }else{
            enoughMoney=false;
        }
        if(enoughMoney){

            System.out.println("Preparing your drink...");
            System.out.print("Change: ");
            System.out.printf("%.2f",(float)change);
        }else{
    System.out.println("Not enough money");
        }
        break;
        case 5:
        change=amount-0.60;
        if(change>0){
            enoughMoney=true;
        }else{
            enoughMoney=false;
        }
        if(enoughMoney){

            System.out.println("Preparing your drink...");
            System.out.print("Change: ");
            System.out.printf("%.2f",(float)change);
        }else{
    System.out.println("Not enough money");
        }
        break;
    }
   
   
    sc.close();
    }
}
