
public class BreakReturn {
    public static void main(String args[])
    {
        // Да се провери дали в даден интервал има поне едно число, което се дели точно на 3
        int begin = 10;
        int end = 16;
        int count = 0;
        
        for(int i=begin; i<=end; i++)
            if(i%3==0)
            {
                count++;
                break;
            }
        
        if (count != 0)
            System.out.println("В интервала има число, което се дели на 3 " );
        else
            System.out.println("В интервала нямa число, което се дели на 3");
        t1();
    }
    public static void t()
    {
      // Да се намери първото число в даден интервал, което се дели точно на 3
        int begin = 10;
        int end = 16;
        int count = 0;
        
        for(int i=begin; i<=end; i++)
            if(i%3==0)
            {
                count++;
                break;
            }
        
        System.out.println("В интервала има " + count + " числa, които се делят на 3 " );
       }
    
     public static void t1()
    {
      // Да се преброят числата в даден интервал, които се делят на 3
        int begin = 10;
        int end = 16;
        int count = 0;
        
        for(int i=begin; i<=end; i++)
            if(i%3==0)
            {
                count=i;
                break;
            }
        
        System.out.println("В интервала първото число, което се дели на 3 е:"+ count  );
       }
}
