import java.util.Scanner;
public class TriangleArea
{
	public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
 System.out.println("Please enter A: ");
 double a = scan.nextDouble();
 System.out.println("Please enter C (hypotenuse): ");
 double c = scan.nextDouble();
 double b = Math.sqrt((c*c)- (a*a));
 double area = (a * b) / 2;
 System.out.printf("The area of the triangle is " + "%.3f",area);
 scan.close();
	}
}