import java.util.Scanner;
public class QuadraticEquation {
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        int a,b,c;
        double x1;
        double x2;
        System.out.printf("Enter A: ");
        a = scan.nextInt();
        System.out.printf("Enter B: ");
        b = scan.nextInt();
        System.out.printf("Enter C: ");
        c = scan.nextInt();
        scan.close();
        if(a==0){
            System.out.println("a cannot be zero");
        }else{
            int d = (b*b) - (4*a*c);
            if(d<0){
                System.out.println("No solution");
            }else if(d==0){
                x1=(-b)/(2*a);
            }else{
                x1=(-b-Math.sqrt(d))/(2*a);
                x2=(-b+Math.sqrt(d))/(2*a);
                System.out.printf("x1 = " );
                System.out.printf("%.2f",x1);
                System.out.println();
                System.out.printf("x2 = " );
                System.out.printf("%.2f",x2);

            }
        }

    }
}
