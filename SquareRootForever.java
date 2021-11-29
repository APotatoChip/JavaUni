import java.util.Scanner;

public class SquareRootForever {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);



        for (;;){
            System.out.print("Number: ");
            int number = sc.nextInt();
            System.out.printf("Square root: %.2f\n", Math.sqrt(number));

            System.out.print("Command: ");
            String command = sc.next();
            sc.close();

            if ("exit".equalsIgnoreCase(command)){
                break;
            }
        }
    }
}