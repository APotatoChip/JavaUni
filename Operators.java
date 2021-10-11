import java.util.Scanner;
public class Operators {

    public static void main(String[] args) {
  	    Scanner sc = new Scanner(System.in);
          try{
    System.out.println("Please enter X:");
    int x = sc.nextInt();
    System.out.println("Please enter Y:");
    int y = sc.nextInt();
    float z=0;
     z = x + y;
        System.out.println("z = " + z);

        z = x - y;
        System.out.println("z = " + z);

        z = x * y;
        System.out.println("z = " + z);

        double x2=x;
        double y2=y;
        double z2= z;
        z2 = x2 / y2;
        System.out.println("z = " + z2);

        z2 = y2 / x2;
        System.out.println("z = " + z2);

        z2 = 1 / x2;
        System.out.println("z = " + z2);

        z = y % x;
        System.out.println("z = " + z);

        double result = x + y + z;
        System.out.println("result is " + result);
        System.out.printf("result is %.3f\n", result);

        result = (x + y) * z;
        System.out.println("result is " + result);

        result = (x * (100 - y)) / z;
        System.out.println("result is " + result);
          }finally{
              sc.close();
          }
    
    }
}