import java.util.Scanner;
public class ConeVolume {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter the radius: ");
        int r = scan.nextInt();
     
        if(r<=0){
            
            System.out.println("Radius must be > 0");
            
            
        }else{
        System.out.printf("Enter the height: ");
        int h = scan.nextInt();
        scan.close();
        if(h<=0){
            System.out.println("Height must be > 0");
           
        }else{
            double volume = (Math.PI * (double)h * Math.pow((double)r,2))/3;
            System.out.printf("The volume of the cone is ");
            System.out.printf("%.2f", volume);
        }
        }
        
    }

}
