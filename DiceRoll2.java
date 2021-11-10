
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class DiceRoll2 {

    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int player_roll;
        System.out.println("Desire sum of two rolls: ");
        player_roll = input.nextInt();
        input.close();
        if (player_roll < 2 ) {
            System.out.println("The sum of two rolls cannot be less than 2");
            
            return;
            
        }
        else if (player_roll > 12){
            System.out.println("The sum of two rolls cannot be greater than 12");
           
        return;
        }
        
        
        int randomNum_1 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
        int randomNum_2 = ThreadLocalRandom.current().nextInt(1, 6 + 1);
        int random = randomNum_1 + randomNum_2 ;
        System.out.println("Disired sum of  two rolls: " + player_roll);
        System.out.printf("First roll was %d, second roll was %d, the sum is %d \n", randomNum_1,randomNum_2,random);
        if (player_roll > random) {
            System.out.println("Win: true");
        }
        else{
        System.out.println("Win: false");
    }
        
        
        
        
        
        
        
        
        
    }
    
}

    