import java.util.Scanner;
public class Capital {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("How many days? ");
        int days = sc.nextInt();
        double currDay;
        double [] shares = new double[days];
        double diff;
        double sum=0;
        double avg=0;
        for(int i=0;i<days;i++){
            System.out.printf("Day %d: ",i+1);
            currDay=sc.nextDouble();
            sum+=currDay;
            shares[i]=currDay;
        }
        sc.close();
        System.out.println("Price movements:");
        for(int j =1;j<shares.length;j++){
            diff = shares[j-1]-shares[j];
            if(diff>0){
                System.out.printf("DOWN with %.4f\n", Math.abs(diff));
            }else if(diff<0){
                System.out.printf("UP with %.4f\n", Math.abs(diff));
            }else if(diff==0){
                System.out.println("Not changed");
            }
        }
        avg=sum/days;
        System.out.printf("Average price for the period: %.4f", avg);
    }
}
