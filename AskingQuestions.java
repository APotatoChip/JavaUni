import java.util.Scanner;
public class AskingQuestions {

    public static void main(String[] args) {
        
       Scanner scanIntFloat = new Scanner(System.in);
    Scanner scanString = new Scanner(System.in);
try{
    System.out.println("How old are you?");
    int age = scanIntFloat.nextInt();
    System.out.println("Age: " + age);
    
    System.out.println("What's the distance between Sofia and Berlin?");
    int distance=scanIntFloat.nextInt();
    System.out.println("The distance between Sofia and Berlin is "+distance+"km");
    
    System.out.println("How many people live ine Bulgaria?");
    int population=scanIntFloat.nextInt();
    System.out.println("The population of Bulgaria is " + population);
    
    System.out.println("How much money do you have?");
    double money=scanIntFloat.nextFloat();
    String result = String.format("%.2f",money);
    System.out.println("I have "+result+" leva in my pocket.");
}finally{
   scanIntFloat.close();
   scanString.close();
}
    
 
    
    System.out.println("Your name:");
    String name=scanString.nextLine();
    System.out.println("My name is "+name);
    
    }

  }

        