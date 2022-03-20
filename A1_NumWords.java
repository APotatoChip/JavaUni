import java.util.Scanner;
public class A1_NumWords{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a number between 1 and 10:");
        int input = scan.nextInt();

        String msg = getNumberAsString(input);

        System.out.println("Result: " + msg);

    }
   
    private static String getNumberAsString(int input) {
        String msg = "";

        switch (input) {
            case 1:
                msg = "one";
                break;
            case 2:
                msg = "two";
                break;
            case 3:
                msg = "three";
                break;
            case 4:
                msg = "four";
                break;
            case 5:
                msg = "five";
                break;
            case 6:
                msg = "six";
                break;
            case 7:
                msg = "seven";
                break;
            case 8:
                msg = "eight";
                break;
            case 9:
                msg = "nine";
                break;
            case 10:
                msg = "ten";
                break;
            default:
                msg = "Out of range!";
        }

        return msg;
    }
}