import java.util.Scanner;
public class SecondAverage {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        long first,second,third;
        System.out.printf("First number: ");
        first = scan.nextLong();
        System.out.printf("Second number: ");
        second = scan.nextLong();
        System.out.printf("Thrid number: ");
        third = scan.nextLong();
        scan.close();
        double averageSum = (first + second + third) / 3;
        System.out.printf("The average is ");
        System.out.printf("%,.4f",averageSum);
    }
}
