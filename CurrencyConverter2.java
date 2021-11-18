import java.util.Scanner;
public class CurrencyConverter2 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Amount: ");
    int amount = sc.nextInt();
    System.out.print("From: ");
    String initialCurr = sc.next();
    System.out.print("To: ");
    String goalCurr=sc.next();
    double result=0;
    sc.close();
    if(initialCurr.equals("BGN")){
        if(goalCurr.equals("USD")){
            result=amount/1.72;
        }else if(goalCurr.equals("EUR")){
            result=amount/1.9558;
        }else if(goalCurr.equals(initialCurr)){
            result=amount;
        }
        else{
            System.out.println("Unknown conversion");
        }
    }else if(initialCurr.equals("USD")){
        if(goalCurr.equals("BGN")){
            result=amount*1.72;
        }else if(goalCurr.equals("EUR")){
            result=(amount*1.72)/1.9558;
        }else if(goalCurr.equals(initialCurr)){
            result=amount;
        }
        else{
            System.out.println("Unknown conversion");
        }
    }else if(initialCurr.equals("EUR")){
        if(goalCurr.equals("USD")){
            result=amount*(1.9558)/1.75;
        }else if(goalCurr.equals("BGN")){
            result=amount*1.9558;
        }else if(goalCurr.equals(initialCurr)){
            result=amount;
        }
        else{
            System.out.println("Unknown conversion");
        }
    }else{
        System.out.println("Unknown conversion");
    }
    System.out.print("Result: ");
    System.out.printf("%.4f",result);
  }  
}
