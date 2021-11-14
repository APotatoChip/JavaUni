import java.util.Scanner;
public class DistanceCalculator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Speed (in km/h): ");
        int speed=scan.nextInt();
        if(speed<=0){
            System.out.println("Invalid speed");
            scan.close();
            return;
        }else if(speed>100){
            System.out.println("You're driving fast!");
        }else if(speed>140){
            System.out.println("You're driving too fast! Please slow down.");
        }
        System.out.print("Duration (in hours): ");
        double duration=scan.nextDouble();
        scan.close();

        if(duration<=0){
            System.out.println("Invalid duration");
            return;
        }else if(duration>4){
            System.out.println("You need some rest!");
        }
        double distance=(double)speed*duration;
        System.out.print("Distance: "+distance+"km");
    }
}
