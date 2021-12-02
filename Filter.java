import java.util.Scanner;
 
public class Filter {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("How many numbers?");
        int numbers = sc.nextInt();
 
        System.out.printf("Please enter %d numbers: \n", numbers);
 
        double[] values = new double[numbers];
 
        for (int i = 0; i < numbers; i++){
            values[i] = sc.nextDouble();
            System.out.println(values[i]);
        }
 
        System.out.print("Operation (>, < or =): ");
        String operation = sc.next();
 
        System.out.print("Than: ");
        double then = sc.nextDouble();
        sc.close();
        for (int k = 0; k < values.length; k++){
 
            if (operation.equals(">") && values[k] > then){
                System.out.printf("%.1f\n", values[k]);
            }
            
            if (operation.equals("<") && values[k] < then){
                System.out.printf("%.1f\n", values[k]);
            }
            
            if (operation.equals("=") && values[k] == then){
                System.out.printf("%.1f\n", values[k]);
            }
        }
        
    }
}