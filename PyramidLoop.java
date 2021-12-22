import java.util.Scanner;

public class PyramidLoop {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Minimum values for A-B-H: ");
        String minVals = scan.next();
       
        String[] minValsStrArr=minVals.split("-");
      
        int[] minValsNumArr=new int[minValsStrArr.length];
       
        
        double volume;

        for(int i=0;i<minValsStrArr.length;i++){
            int num =Integer.parseInt(minValsStrArr[i]);
            minValsNumArr[i]=num;
        }

        int aMin=minValsNumArr[0];
        int bMin=minValsNumArr[1];
        int hMin=minValsNumArr[2];

        if(aMin==0 || bMin==0 || hMin==0){
                System.out.print("Only positive values, please!");
                return;
        }

        System.out.print("Maximum values for A-B-H: ");
        String maxVals = scan.next();
        String[] maxValsStrArr=maxVals.split("-");
        int[] maxValsNumArr=new int[maxValsStrArr.length];

        for(int i=0;i<maxValsStrArr.length;i++){
            int num =Integer.parseInt(maxValsStrArr[i]);
            maxValsNumArr[i]=num;
        }

        int aMax=maxValsNumArr[0];
        int bMax=maxValsNumArr[1];
        int hMax=maxValsNumArr[2];

        if(aMin> aMax|| bMin>bMax || hMin>hMax){
                System.out.print("Maximums should be greater than the minimums!");
                return;
        }

        for(int i=aMin;i<=aMax;i++){
            for(int j=bMin;j<=bMax;j++){
                for(int k=hMin;k<=hMax;k++){
                    System.out.printf("For A: %d, B: %d, H: %d - ",i,j,k);
                    volume=(double)(i*j*k)/3;
                    System.out.printf("Volume: %.1f\n", volume);

                }
            }
        }
    

         
        
   }
}
