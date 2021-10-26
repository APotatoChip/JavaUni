import java.util.Scanner;
public class TimeCalc
{
	public static void main(String[] args) {
	   Scanner scan = new Scanner(System.in);
        System.out.printf("How many seconds? ");
        int s=scan.nextInt();
        
        
        
        double mins = ((double)s/60);
        System.out.println("Minutes: "+mins);
        double h = (mins/60);
        System.out.println("Hours: "+h);
        double days=(h/24);
        System.out.println("Days: "+days);
        double wks=(days/7);
        System.out.println("Weeks: "+wks);
        double yrs=(wks/365);
        System.out.println("Years: "+yrs);
        scan.close();
        

	}
}