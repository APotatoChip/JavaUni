import java.util.Scanner;
public class QuadraticEquations
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    
	    System.out.println("Enter A:");
	    int a = scan.nextInt();
	    
	    System.out.println("Enter B:");
	    int b=scan.nextInt();
	    b=-b;
	    
	    System.out.println("Enter C:");
	    int c = scan.nextInt();
	    
	    double d= Math.sqrt((b*b)-(4*a*c));
	    
	    double x1 = (b - d)/(2*a);
	    double x2= (b + d)/(2*a);
	    System.out.println("x1 = "+x1);
	    System.out.println("x2 = "+x2);
	    
	    scan.close();
	}
}