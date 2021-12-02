import java.util.Scanner;
 
public class Unique {
    public static void main(String[] args) {
 
        Scanner sc = new Scanner(System.in);
 
        System.out.print("How many numbers?");
        int numbers = sc.nextInt();
 
        int[] values = new int[numbers];
 
        for (int i = 0; i < numbers; i++){
            System.out.printf("Days %d\n", i);
            values[i] = sc.nextInt();
            System.out.println(values[i]);
        }
        sc.close();
        for (int m = 0; m < values.length; m++){
            int current = values[m];
 
            for (int k = m + 1; k < values.length; k++){
                if (values[k] == current){
                    values [k] = 0;
                    System.out.println("Duplicate found!");
                }
            }
        }
 
        System.out.println("Final result:");
 
        for (int s = 0; s < values.length; s++){
            System.out.printf("%d ", values[s]);
        }
        
    }
}