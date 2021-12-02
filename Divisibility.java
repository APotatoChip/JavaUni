

import java.util.Scanner;


public class Divisibility {
    public static void main(String args[])
    {
        int x;
        int y;
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        y=s.nextInt();
        
        if(x%y==0)
            System.out.println("Number "+x+" is divisble by "+y);
        else
            System.out.println("Number "+x+" is not divisble by "+y);
           InRange();
    }
    
    public static void t()
    {
        int x;
 
        Scanner s = new Scanner(System.in);
        x = s.nextInt();
        
        if(x%3==0)
            System.out.println("Number "+x+" is divisble by 3");
        else
            System.out.println("Number "+x+" is not divisble by 3");  
        
     
    }
    
    public static void InRange()
    {
        int y;
        Scanner s = new Scanner(System.in);
        y = s.nextInt();
        
        for(int i=1;i<=10;i++)
           if(i%y==0)
                System.out.println("Number "+i+" is divisble by 3");
           else
                System.out.println("Number "+i+" is not divisble by 3");     
    }
}
