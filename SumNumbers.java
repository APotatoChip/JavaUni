import java.util.Scanner;
public class SumNumbers {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("How many numbers: ");
        int n = scan.nextInt();
        System.out.println("Please eneter the numbers: ");
        double [] numArr =new double[n];
        for(int i=0;i<n;){
            double num =scan.nextDouble();
            if(num<=0){
                System.out.println("Only positive numbers, please.");
                
            }else{
                numArr[i]=num;
                i++;
            }
            
        }
        System.out.print("Limit: ");
        double limit=scan.nextDouble();
        int equalOrGreaterThanLimit=0;
        double equalOrGreaterThanLimitSum=0;
        int lessThanLimit=0;
        double lessThanLimitSum=0;
        
        for(int i=0;i<n;i++){
          
            if(numArr[i]>=limit){
                equalOrGreaterThanLimitSum+=numArr[i];
              equalOrGreaterThanLimit++;
            }
            if(numArr[i]<limit){
                lessThanLimitSum+=numArr[i];
                lessThanLimit++;
            }
         
        }

        System.out.printf("The sum of the %d numbers greater than or equal to %.2f is %.2f\n", equalOrGreaterThanLimit,limit,equalOrGreaterThanLimitSum);
        System.out.printf("The sum of the %d numbers less than %.2f is %.2f\n", lessThanLimit,limit,lessThanLimitSum);
        scan.close();
    }
}
