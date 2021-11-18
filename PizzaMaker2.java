import java.util.Scanner;
public class PizzaMaker2 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        double price=5;
        int diameter=0;
        int thickness=0;
        String fTop="";
        String sTop="";
        int slices=0;
        String result="";
        System.out.print("What type of pizza do you want? ");
        String pizzaType=sc.next();
        if(pizzaType.equalsIgnoreCase("Pepperoni")){
            System.out.print("How large (diameter, in cm)? ");
            diameter=sc.nextInt();
            if(diameter<12 || diameter>36){
                System.out.println("We only make pizzas between 12 and 36 cm!");
                return;
            }else{
                price+=diameter/12;
                System.out.print("How thick (in cm)? ");
                thickness=sc.nextInt();
                if(thickness<1){
                    System.out.println("The pizza is too thin!");
                    return;
                }else if(thickness>4){
                    System.out.println("The pizza is too thick!");
                    return;
                }else{
                    price+=thickness/2;
                    System.out.print("Select topping #1: ");
                    fTop=sc.next();
                    System.out.print("Select topping #2: ");
                    sTop=sc.next();
                    if(fTop.equals("ketchup")){
                        price+=0.20;
                    }
                    else if(fTop.equals("mustard")){
                        price+=0.23;
                    }else{
                        price+=0.27;
                    }
                    if(sTop.equals("ketchup")){
                        price+=0.20;
                    }else if(sTop.equals("mustard")){
                        price+=0.23;
                    }else{
                        price+=0.27;
                    }

                    System.out.print("How many slices? ");
                    slices=sc.nextInt();
                    if(slices<0){
                        System.out.println("No way to slice the pizza!");
                        return;
                    }else if(slices==0){
                        System.out.println("We will not slice the pizza.");
                    }else if(slices>16){
                        System.out.println("We cannot make more than 16 slices!");
                        return;
                    }

                    result=String.format("You have ordered a %d cm %s pizza, %d cm thick which has %s and %s. It will be cut in %d slices.\n",diameter,pizzaType,thickness,fTop,sTop,slices);
                    System.out.print(result);
                    System.out.print("The final price is: "+price);
                    
                }
            }
        }else if(pizzaType.equalsIgnoreCase("Siciliana")){
            System.out.print("How large (diameter, in cm)? ");
            diameter=sc.nextInt();
            if(diameter<12 || diameter>36){
                System.out.println("We only make pizzas between 12 and 36 cm!");
                return;
            }else{
                price+=diameter/12;
                System.out.println("How thick (in cm)? ");
                thickness=sc.nextInt();
                if(thickness<1){
                    System.out.println("The pizza is too thin!");
                    return;
                }else if(thickness>4){
                    System.out.println("The pizza is too thick!");
                    return;
                }else{
                    price+=thickness/2;
                    System.out.print("Select topping #1: ");
                    fTop=sc.next();
                    System.out.print("Select topping #2: ");
                    sTop=sc.next();
                    if(fTop.equals("ketchup")){
                        price+=0.20;
                    }
                    else if(fTop.equals("mustard")){
                        price+=0.23;
                    }else{
                        price+=0.27;
                    }
                    if(sTop.equals("ketchup")){
                        price+=0.20;
                    }else if(sTop.equals("mustard")){
                        price+=0.23;
                    }else{
                        price+=0.27;
                    }

                    
                    System.out.print("How many slices? ");
                    slices=sc.nextInt();
                    if(slices<0){
                        System.out.println("No way to slice the pizza!");
                        return;
                    }else if(slices==0){
                        System.out.println("We will not slice the pizza.");
                    }else if(slices>16){
                        System.out.println("We cannot make more than 16 slices!");
                        return;
                        
                    }
                    

                    result=String.format("You have ordered a %d cm %s pizza, %d cm thick which has %s and %s. It will be cut in %d slices.\n",diameter,pizzaType,thickness,fTop,sTop,slices);
                    System.out.print(result);
                    System.out.print("The final price is: "+price);
                }
            }
        }else{
            System.out.println("We cannot cook such pizza");
        }
        
    }
}
