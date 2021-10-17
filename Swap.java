import java.util.Scanner;

public class Swap {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
		System.out.println("Enter x:");
		int x = scan.nextInt();
		System.out.println("Enter y:");
		int y = scan.nextInt();
		System.out.println("x is "+x+" and y is "+y);
		int temp = x;
		x = y;
		y = temp;
		System.out.println("x is "+x+" and y is "+y);
    }
}