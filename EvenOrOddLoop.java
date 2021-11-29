import java.util.Scanner;

public class EvenOrOddLoop {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Start from: ");
        int start = sc.nextInt();

        System.out.print("Up to: ");
        int end = sc.nextInt();
        sc.close();
        for (int i = start; i <= end; i++){

            if (i % 2 == 0){
                System.out.printf("%d is even\n", i);
            }else{
                System.out.printf("%d is odd\n", i);
            }
        }

    }
}