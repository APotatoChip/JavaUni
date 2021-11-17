import java.util.Scanner;
public class WorldMap {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Latitude 1: ");
        double fLat=scan.nextDouble();
        System.out.print("Longitude 1: ");
       double fLgt=scan.nextDouble();
       System.out.print("Latitude 2: ");
        double sLat=scan.nextDouble();
        System.out.print("Longitude 2: ");
        double sLgt=scan.nextDouble();
        scan.close();
        String gpsOne="GPS1: "+fLat+" "+fLgt;
        System.out.println(gpsOne);
        String gpsTwo="GPS2: "+sLat+" "+sLgt;
        System.out.println(gpsTwo);
        boolean latBool=false;
        boolean longBool=false;
        String latitude="";
        String longitute="";
        String result="";
        
        if(fLat<sLat){
            //north
            latitude="NORTH";
        }else if(fLat==sLat){
            //nothing
            latBool=true;
        }else{
            //south
            latitude="SOUTH";
        }

        if(fLgt<sLgt){
            //east
            longitute="EAST";
        }else if(fLgt==sLgt){
            //nothing
            longBool=true;
        }
        else{
            //west
            longitute="WEST";
        }

        if(longBool && latBool){
            System.out.print("This is the same place");
        }else if(longBool){
            System.out.print(latitude);
        }else if(latBool){
            System.out.print(longitute);
        }else{
            result=latitude+longitute;
            System.out.print(result);
        }
    }
}
