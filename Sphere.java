import java.text.DecimalFormat;
import java.util.Scanner;
public class Sphere {
	   public static void main(String[] args) {
    	Scanner scan = new Scanner(System.in);
		System.out.println("The diameter of the sphere: ");
		int d = scan.nextInt();

		int scale = (int) Math.pow(10,4);

		double r = (double)d/2;
		double volume=(4.0/3)*Math.PI*Math.pow(r,3);
		double area=4*Math.PI*Math.pow(r,2);

		volume = (double) Math.round(volume*scale)/scale;
		area = (double) Math.round(area*scale)/scale;

		DecimalFormat decim = new DecimalFormat("0.00");
		double ds=d;
		String dt= decim.format(ds);
		
		System.out.println("The diameter of the sphere: "+d);
		
		System.out.println("The volume of a sphere with diameter " + dt+" is " + volume);
		System.out.println("The surface area is " + area);

		scan.close();
    }

}
