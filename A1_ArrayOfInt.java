import java.util.Scanner;
public class A1_ArrayOfInt {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int[] numbers = new int[10];

        for (int i = 0; i < numbers.length; i++) {
            System.out.println("Number " + (i + 1) + ": ");
            numbers[i] = scan.nextInt();
        }
        int max = findMax(numbers);

        System.out.println("Max: " + max);
    }

    private static int findMax(int[] numbers) {

        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }
}
