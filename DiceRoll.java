import java.util.Scanner;
import java.util.Random;
public class DiceRoll {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        System.out.printf("Desired sum of two rolls: ");
        int desiredSum=scan.nextInt();
        boolean win=false;

        scan.close();

        int firstRoll= random.nextInt(6)+1;
        int secondRoll = random.nextInt(6)+1;
        int sum = firstRoll + secondRoll;

        String result = "First roll was " + firstRoll + ", second roll was " + secondRoll + ", the sum is " + sum;

        System.out.println(result);
        if(sum==desiredSum){
            win=true;
            
        }else{
            win=false;
        }
        System.out.println("Win: " + win);

        
    }
}
