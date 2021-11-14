import java.util.Scanner;
public class DateConditions {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Year:");
        int year = scan.nextInt();
        System.out.print("Month:");
        int month = scan.nextInt();
        System.out.print("Day:");
        int day = scan.nextInt();
        scan.close();

        if(year<1900 || year >2019){
            System.out.print("Only years between 1900 and 2019");
        }else if(month<1 || month>12){
            System.out.print("Invalid month");
        }else if(day<1 || day>31){
            System.out.print("Invalid day");
        }

        if(month>10 && month<4){
            System.out.print("Winter");
        }else if(month>5 && month <9){
            System.out.print("Summer");
        }else if(month==4 || month == 5){
            System.out.print("Spring");
        }else{
            System.out.print("Autumn");
        }

        if(day==1 && month==6){
            System.out.print("International Children's Day");
        }
        if(day>32 && day<27 && month==12){
            System.out.print("Merry Christmas");
        }
    }
}
