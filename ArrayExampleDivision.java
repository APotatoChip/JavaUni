

import java.util.Scanner;

public class ArrayExampleDivision {
    public static void main(String arg[])
    {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Друг пример");  
        System.out.println("----------------------------------------------------------------------");      
        //Да напишем по-интересен пример
        //да преброим колко от въведени от потребителя 10 числа се делят на 3
        int[] array3;
        array3 = new int[10];
        
        Scanner s = new Scanner(System.in);
        System.out.println("Въведете "+array3.length+" елемента");  
        for (int i=0; i<array3.length;i++)
            array3[i] = s.nextInt();
        
        //да използваме друсга конструкция за обхождане на масив
        //отново конструкция за цикъл, но използвана само за масиви и колекции
        int count = 0;
        for (int x : array3)
         {
             if (x%3==0)
                 count++;
         }
         
        System.out.print("В масива има "+count+" елемента, които се делят точно на 3");
    }
    
}
