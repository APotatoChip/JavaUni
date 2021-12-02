import java.util.Scanner;
import java.lang.Math;
public class QuadraticEquationsLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Limit: ");
        int n = sc.nextInt();
        double d;
        double x1;
        double x2;
        sc.close();

        for (int a = 1; a <= n; a++){
            for (int b = 1; b <= n; b++){
                for (int c = 1; c <= n; c++){
                    d = (b * b) - 4*a*c;
                    System.out.printf("a = %d, b = %d, c = %d\n", a, b, c);

                    if (d < 0){
                        System.out.println("No solution");
                    }else if (d == 0){
                        x1 = -1 * ((double)b / (2*a));
                        System.out.printf("x1 = %f\n", x1);
                    }else{
                        x1 = ((-1*b) - Math.sqrt(d)) / (2*a);
                        x2 = ((-1*b) + Math.sqrt(d)) / (2*a);

                        System.out.printf("x1 = %f\n", x1);
                        System.out.printf("x2 = %f\n", x2);

                    }
                }
            }
        }
    }

}
