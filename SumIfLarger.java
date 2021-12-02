import java.util.*;
public class SumIfLarger {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Next: ");
        int num = sc.nextInt();
        int prev= -1;
        int sum=0;
        while(num>prev){
            sum+=num;
            prev=num;
            System.out.print("Next: ");
            num=sc.nextInt();
        }
        sc.close();
        System.out.print("Result: "+sum);
    }
}
