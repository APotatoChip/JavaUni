import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Limit: ");
        int limit = sc.nextInt();
        int fPrev=0;
        int sPrev=0;
        int curr =0;
        sc.close();
        for(int i =0;i<limit;i++){
            if(i==0){
                curr=0;
            }else if(i==1){
                fPrev=0;
                curr=1;
                sPrev=1;
            }else{
                curr=sPrev+fPrev;
                fPrev=sPrev;
                sPrev=curr;
            }
            System.out.println(curr);
        }
    }
}
