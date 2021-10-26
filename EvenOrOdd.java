import java.util.Scanner;
public class EvenOrOdd {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.printf("Enter a number: ");
        int n = scan.nextInt();
        scan.close();
        if(n%2==0){
            System.out.println("Result: even");
        }else{
            System.out.println("Result: odd");
        }
    }
}
