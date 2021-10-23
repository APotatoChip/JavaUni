import java.util.Scanner;

public class PizzaMaker {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Pizza type: ");
        String pizzatype = scan.nextLine();

        System.out.println("Diameter: ");
        int d = scan.nextInt();

        System.out.println("Thickness: ");
        double thickness = scan.nextFloat();
        
        int r = d / 2;
        double volume = Math.PI * r * r * thickness;
        
        int scale = (int) Math.pow(10,1); // 
        thickness = (double) Math.round(thickness*scale)/scale;
        scale = (int) Math.pow(10,2);
        volume = (double) Math.round(volume*scale)/scale;

        scan.nextLine(); // 

        System.out.println("Select topping #1: ");
        String fTopping = scan.nextLine();
        
        System.out.println("Select topping #2: ");
        String sTopping = scan.nextLine();

        System.out.println("How many slices? ");
        int slices = scan.nextInt();


        String result = "You have ordered a "+d+" cm "+pizzatype+" pizza, "+thickness+" cm thick, which has "+fTopping+" and "+sTopping+". It will be cut in "+slices+" slices. The volume of the pizza with radius "+r+" and height "+thickness+" is "+volume+" cm3.";
       
        System.out.println(result);

        scan.close();
    }
}
