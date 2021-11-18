import java.util.Scanner;
public class Chocolate {
    public static void main(String[] args) {
        double basePrice = 1.50;
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("Wight: ");
        int weight = sc.nextInt();
 
        if (weight <= 90){
            System.out.println("Weight must be > 90g.");
        }else if (weight >= 300){
            System.out.println("Weight must be < 300g.");
        }else{
            basePrice = basePrice + (weight * 0.03);
 
            System.out.print("Type: ");
            String type = sc.next();
 
            if ("standard".equalsIgnoreCase(type) || "premium".equalsIgnoreCase(type)){
                if ("premium".equalsIgnoreCase(type)){
                    basePrice = basePrice + 0.5;
                }
 
                System.out.printf("The price of a %s chocolate with weight %d is %.2f leva.\n", type, weight, basePrice);
            }else {
                System.out.println("We have only standard and premium chocolates.");
            }
        }
    }
}