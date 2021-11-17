import java.util.Scanner;
public class Excel {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("x: ");
    double x = sc.nextDouble();
    System.out.print("y: ");
    double y = sc.nextDouble();
    System.out.print("z: ");
    double z = sc.nextDouble();
    sc.nextLine();
    System.out.print("Function: ");
    String fn = sc.next();
    double result=0;
    boolean flag=false;
    sc.close();

    if(fn.equals("SUM")){
        result=x+y+z;
        flag=true;
    }else if(fn.equals("AVERAGE")){
        result=(x+y+z)/3;
        flag=true;
    }else if(fn.equals("MIN")){
        flag=true;
        if(x<y && x<z){
            result=x;
        }else if(y<x && y<z){
            result=y;
        }else{
            result=z;
        }
    }else if(fn.equals("MAX")){
        flag=true;
        if(x>y && x>z){
            result=x;
        }else if(y>x && y>z){
            result=y;
        }else{
            result=z;
        }
    }else{
        System.out.print("Unsupported function");
    }
    if(flag){
        System.out.print("Result: ");
        System.out.printf("%.4f",result);
    }
  }  
}
