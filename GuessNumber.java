import java.util.Scanner;
import java.util.Random;
public class GuessNumber{
    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);
        Random random = new Random();

        int rn = random.nextInt(10)+1; // generates random nums between 0 and 9 so u add 1

        System.out.println("Your guess:");

        int guess=scan.nextInt();

        if(rn == guess){
            System.out.println("Your guess is true - it was "+rn+"!");
        }else{
            System.out.println("Your guess is false - its was "+rn+"!");
        }

        scan.close();
    }
    

}