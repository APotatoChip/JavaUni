

import java.util.Arrays;
import java.util.Scanner;


public class ArraySearchElement {
     public static void main(String args[])
    {
        System.out.println("----------------------------------------------------------------------");
        System.out.println("Търсене на елемент в масив");  
        System.out.println("----------------------------------------------------------------------");      
        //Да напишем по-интересен пример
        //да проверим дали дадено число се съдържа в целочислен масив
        int[] array3;
        array3 = new int[10];
        
        //Въеждаме стойности в масива
        Scanner s = new Scanner(System.in);
        System.out.println("Въведете "+array3.length+" елемента");  
        for (int i=0; i<array3.length;i++)
            array3[i] = s.nextInt();
        
        System.out.println("Въведете число, което да се търси в масива");  
        int n = s.nextInt();
        
        //да използваме друга конструкция за обхождане на масив
        //отново конструкция за цикъл, но изполавана само за масиви и колекции
        int count = 0;
        for (int x : array3)
         {//променливата x е локална променлив, видима само в for коснтрукцията
          //на всяка итерация (стъпка) променливата x съдържа стойността на текущия елемент
             if (x==n)
                 count++;//преброява се колко елемента равни на въведенето число са открити
         }
        //какво означава едно число да се съдържа в масив? Необходимо е в масива един или повече елементи, които са равни на числото
        //ще използваме Arrays.toString, за изведем масива като един текст
        if (count> 0) 
            System.out.print(n+" се съдържа в масива"+ Arrays.toString(array3));
    }
    
}
