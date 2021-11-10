import java.util.Scanner;
public class Century {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int year = scan.nextInt();
        scan.close();
        
        if(year>2000){
            System.out.println("After 20th century");
        }else if(year<2000 && year>1900){
            System.out.println("During 20th century");
        }else{
            System.out.println("Before 20th century");
        }
    }
}
