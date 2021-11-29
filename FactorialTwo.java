import java.util.Scanner;

public class FactorialTwo {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("From: ");
        int from = sc.nextInt();

        System.out.print("To: ");
        int to = sc.nextInt();
        sc.close();
        for (int i = from; i <= to; i++){
            int factorial = 1;
            for (int m = 1; m <= i; m++){
                factorial = factorial * m;
            }

            System.out.printf("%d! = %d\n", i, factorial);
        }


    }
}