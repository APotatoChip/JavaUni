import java.util.Scanner;
public class Geometry{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        double volume=0;
        System.out.print("Base - side A: ");
        double a = sc.nextDouble();
        if(a<=0){
            System.out.print("Side A must be > 0");
        }else{
            System.out.print("Base - side B: ");
            double b = sc.nextDouble();
            if(b<=0){
                System.out.print("Side B must be > 0");
            }else{
                System.out.print("Height: ");
                double h = sc.nextDouble();
                if(h<=0){
                System.out.print("Height must be > 0");
                }else{
                    System.out.print("Which figure (prism, pyramid): ");
                    String figure = sc.next();
                    sc.close();
                    if("prism".equalsIgnoreCase(figure)){
                        volume=(a*b*h)/2;
                        System.out.print("The volume of the prism is ");
                        System.out.printf("%.3f",volume);
                    }else if("pyramid".equalsIgnoreCase(figure)){
                        volume=(a*b*h)/6;
                        System.out.print("The volume of the pyramid is ");
                        System.out.printf("%.3f",volume);
                    }else{
                        System.out.print("Unknown figure.");
                    }
                }
            }
        }


    }}