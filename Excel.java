import java.util.Scanner;
public class Excel {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("x: ");
    float x = sc.nextFloat();
    System.out.print("y: ");
    float y = sc.nextFloat();
    System.out.print("z: ");
    float z = sc.nextFloat();
    sc.nextLine();
    System.out.print("Function: ");
    String fn = sc.nextLine();
    float result;
    sc.close();
    switch(fn){
        case "SUM":
        result=x+y+z;
        System.out.print("Result: ");
        System.out.printf("%.4f",result);
        break;
        case "AVERAGE":
        result=(x+y+z)/3;
        System.out.print("Result: ");
        System.out.printf("%.4f",result);
        break;
        case "MIN":
        System.out.print("Result: ");
        if(x<y && x<z){
            result=x;
        
        }else if(y<x && y<z){
            result=y;

        }else{
            result=z;
      
        }
        System.out.printf("%.4f",result);
        break;
        case "MAX":
        System.out.print("Result: ");
        if(x>y && x>z){
            result=x;
            

        }else if(y>x && y>z){
            result=y;
           

        }else{
            result=z;
           
        }
        System.out.printf("%.4f",result);
        break;
        default:
        System.out.print("Unsupported function");
        break;
    }

  }  
}
