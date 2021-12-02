import java.util.Scanner;
import java.lang.Math;
public class ConeVolumeLoop {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Max Radius: ");
        int n = sc.nextInt();
        System.out.print("Max Height: ");
        int m = sc.nextInt();
        double volume=0;
        sc.close();
        for(int i =1;i<=n;i++){
            for(int j =1;j<=m;j++){
                System.out.printf("radius %d, height %d:\n",i,j);
                volume = (Math.PI*(i*i)*j)/3;
                System.out.printf("volume: %.2f\n",volume);
            }
        }
    }
}
