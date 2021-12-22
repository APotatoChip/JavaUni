/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lotto;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author venko
 */
public class Lotto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] myNumbers = new int[6];
        int[] randomNumbers = new int[6];
        
        System.out.println("Enter 6 numbers: ");
        for(int i = 0; i < myNumbers.length; i++) {
            myNumbers[i] = s.nextInt();
            if(myNumbers[i] < 1 || myNumbers[i] > 47) {
                System.out.println("Only between 1 and 47!");
                // оставаме на същата позиция в масива
                // при следващата итерация
                i--;
            }
        }
        
        System.out.println("Lotto numbers: ");
        // класът Random се импортира аналогично на Scanner
        // виж в началото - import java.util.Random;
        Random r = new Random();
        for(int i = 0; i < randomNumbers.length; i++) {
            // генерираме случайно число между 1 и 47:
            randomNumbers[i] = r.nextInt(46) + 1;
            System.out.printf("%d\t", randomNumbers[i]);
        }
        
        int matches = 0;
        // комбинираме всеки елемент от единия масив с всеки елемент 
        // от другия масив, за да ги сравняваме и търсим съвпадения:
        for(int i = 0; i < myNumbers.length; i++) {
            for(int j = 0; j < randomNumbers.length; j++) {
                if(myNumbers[i] == randomNumbers[j]) {
                    matches++;
                }
            }
        }
        
        System.out.printf("You've guessed %d numbers!\n", matches);
        
        
    }
    
}
