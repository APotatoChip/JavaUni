import java.util.Scanner;
import java.math.BigDecimal;

/**
 *
 * @author abc
 */
public class Sphere {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Scanner scan = new Scanner(System.in);
		int d = scan.nextInt();
		double r = (double)d/2;
		double volume=(4.0/3)*Math.PI*Math.pow(r,3);
		
		double area=4*Math.PI*Math.pow(r,2);
		
		System.out.println("The diameter of the sphere: "+d);
		System.out.printf("The volume of a sphere with diameter " + d+" is ");
		System.out.printf("%.4f", volume);
		System.out.println("");
		System.out.printf("The surface area is ");
		System.out.printf("%.4f", area);
    }

}
