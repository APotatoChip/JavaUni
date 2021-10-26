import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter a currency (USD, EUR, JPY): ");
        String currency = scan.nextLine();
        System.out.printf("Amount: ");
        double amount = scan.nextDouble(); 
        scan.close();
        double convertRes;
        if(amount<=0){
            System.out.println("Only positive amounts, please!");
        }else{
            switch (currency){
                case "USD":
                convertRes=amount*1.72;
                System.out.printf("%.2f",amount);
                System.out.printf(" USD are ");
                System.out.printf("%.2f",convertRes);
                System.out.printf(" leva.");
                break;
                case "EUR":
                convertRes=amount*1.9558;
                System.out.printf("%.2f",amount);
                System.out.printf(" EUR are ");
                System.out.printf("%.2f",convertRes);
                System.out.printf(" leva.");
                break;
                case "JPY":
                convertRes=amount*0.016196;
                System.out.printf("%.2f",amount);
                System.out.printf(" JPY are ");
                System.out.printf("%.2f",convertRes);
                System.out.printf(" leva.");
                break;
                default:
                System.out.println("No such currency!");
            }
        }
    }
}
