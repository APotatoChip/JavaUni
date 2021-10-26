import java.util.Scanner;
import java.text.DecimalFormat;
public class Pyramid{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a,b,h;
        System.out.printf("a: ");
        a = scan.nextInt();
        System.out.printf("b: ");
        b = scan.nextInt();
        System.out.printf("h: ");
        h = scan.nextInt();
        scan.close();
        double vol = (double)(a*b*h)/3;

        DecimalFormat decim = new DecimalFormat("0.000");
        String volume = decim.format(vol);

        System.out.println("The volume of a rectangular pyramid with sides "+a+ " and " +b+" and height "+h+" is "+volume);
    }
}