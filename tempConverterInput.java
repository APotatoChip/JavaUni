import java.util.Scanner;
public class TempConverterInput
{
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    System.out.println("What's the temperature in Fahrenheit?");
	    double fahrenheit = scan.nextDouble();
	    double celsius=5*(fahrenheit-32)/9;
	    System.out.println("Temperature in Farenheit is: "+fahrenheit);
	    System.out.printf("Temperature in Celsius is: ");
	    System.out.printf("%.2f",celsius);
	    
	    scan.close();
	}
}
