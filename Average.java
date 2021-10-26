import java.util.Scanner;
public class Average {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        byte first,second,third,fourth;
        System.out.printf("First number: ");
        first = scan.nextByte();
        System.out.printf("Second number: ");
        second=scan.nextByte();
        System.out.printf("Third number: ");
        third=scan.nextByte();
        System.out.printf("Fourth number: ");
        fourth=scan.nextByte();
        scan.close();

        int wholeDiv = (int)(first + second + third + fourth) / 4;
        double doubleDiv = (double)(first + second + third + fourth) / 4;

        System.out.println("The average, calculated with whole number division is " + wholeDiv + ".");
        System.out.println("The average, calculated with decimal number division is " + doubleDiv);
    }
}
