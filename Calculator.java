import java.util.Scanner;
public class Calculator{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("First number:");
        double x = scan.nextDouble();
        scan.nextLine();
        System.out.print("Second number:");
        double y = scan.nextDouble();
        scan.nextLine();
        System.out.print("Operator:");
        String operator = scan.nextLine();
        double result;
        scan.close();
        switch(operator){
            case "+":
             result=x+y;
             System.out.println("Result: "+result);
             break;
            case "-":
            result=x-y;
            System.out.println("Result: "+result);
            break;
            case "*":
            result=x*y;
            System.out.println("Result: "+result);
            break;
            case "/" :
            if(y!=0){
                result=x/y;
                System.out.println("Result: "+result);
            }else{
                System.out.println("Division by zero is not allowed");
            }
            break;
            case "%" :
            result=x%y;
            System.out.println("Result: "+result);
            break;
            case "AVG":
            result=(x+y)/2;
            System.out.println("Result: "+result);
            break;
            default:
            System.out.println("This operator is not supported");
            break;
        }
        

    }
}