import java.util.Scanner;

import javax.swing.text.GlyphView.GlyphPainter;
public class WorldMap {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Latitude 1:");
        double fLat=scan.nextDouble();
        System.out.print("Longitude 1:");
       double fLgt=scan.nextDouble();
       System.out.print("Latitude 2:");
        double sLat=scan.nextDouble();
        System.out.print("Longitude 2:");
        double sLgt=scan.nextDouble();
        scan.close();
        
        if(fLat<sLat){
            //north
        }else if(fLat==sLat){
            //nothing
        }else{
            //south
        }

        if(fLgt<sLgt){
            //east
        }else if(fLgt==sLgt){
            //nothing
        }
        else{
            //west
        }
    }
}
