import java.util.Scanner;

public class WashingMachine {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Pick a programme: ");
        
        final int programme = sc.nextInt();
        
        int programmeTemp, programmeDuration; // Degrees / Minutes

        sc.close();
        
        switch (programme) {
            case 1:
                programmeTemp = 60;
                programmeDuration = 125;
                
                break;
            case 2:
                programmeTemp = 90;
                programmeDuration = 106;
                
                break;
            case 3:
                programmeTemp = 40;
                programmeDuration = 98;
                
                break;
            case 4:
                programmeTemp = 50;
                programmeDuration = 65;
                
                break;
            case 5:
                System.out.println("Despired temperature: ");
                programmeTemp = sc.nextInt();
                
                System.out.println("Despired time: ");
                programmeDuration = sc.nextInt();
                
                break;
                
            default:
                System.out.println("No such programme");
                return;
        }
        
        String result = "Temperature: " + programmeTemp + " degrees";
        result += ", ";
        result += "Time: " + programmeDuration + " minutes";
        
        System.out.println(result);
    }
}