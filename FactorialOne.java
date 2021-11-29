import java.util.Scanner;

public class FactorialOne {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Factorial of: ");
        int n = sc.nextInt();
        int factorial = 1;
        sc.close();
        for (int i = 1; i <= n; i++){
            factorial = factorial * i;
        }

        System.out.printf("%d! = %d\n", n, factorial);


    }
}