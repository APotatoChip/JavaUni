

import java.util.Scanner;


public class Temperatures {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.print("Temperature: ");
       double tempIN = in.nextDouble();
        System.out.print("Unit: ");
        int unit = in.nextInt();
        
        in.close();
        double fah,kel,cel;
     
            
        switch(unit){
            case 1:
                fah = ((9/5.0)*tempIN)+32;
                System.out.printf("Fahrenheit: %.2f \n",fah);
                kel = tempIN + 273.15;
                System.out.printf("Kelvin: %.2f \n",kel);
        break;
            case 2:
                cel = (5/9.0)*(tempIN - 32);
                System.out.printf("Celsius: %.2f \n",cel);
                kel = (5/9.0)*(tempIN - 32) + 273.15 ;
                System.out.printf("Kelvin: %.2f \n",kel);
        break;
            case 3:
                cel = tempIN - 273.15;
                System.out.printf("Celsius: %.2f \n",cel);
                fah = (9/5.0) * (tempIN - 273.15) + 32 ;
                System.out.printf("Fahrenheit: %.2f \n",fah);
                break;
           
                
                
            default:
                System.out.println("Unsupported unit");
                return;
        }
             
    }
    
}
