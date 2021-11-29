import java.util.Scanner;

public class GeometricProgression {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Min: ");
        int min = sc.nextInt();

        System.out.print("Max: ");
        int max = sc.nextInt();
sc.close();
        for (int i = min; i <= max; i = i * 2){
            System.out.println(i);
        }
    }
}