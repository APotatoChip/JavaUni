/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package excel;

import java.util.Scanner;

/**
 *
 * @author venko
 */
public class Excel {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int size;
        System.out.print("How many numbers? ");
        size = s.nextInt();
        
        // размерът на масива се определя от променливата size
        int[] numbers = new int[size];
        for(int i = 0; i < size; i++) {
            System.out.print("Enter a number: ");
            numbers[i] = s.nextInt();
        }
        
        int sum = 0, count = 0;
        int min = numbers[0], max = numbers[0];
        double average;
        
        // примерен масив: 5 10 3 7 8 11 2 4
        for(int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
            count++;
            if(numbers[i] < min) {
                min = numbers[i];
            }
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }
        
        // алтернативен синтаксис с for each:
        /*for(int number : numbers) {
            sum += number;
            count++;
            if(number < min) {
                min = number;
            }
            if(number > max) {
                max = number;
            }
        }*/
        
        average = (double)sum / count;
        
        System.out.printf("SUM=%d, AVERAGE=%.2f, COUNT=%d, MIN=%d, MAX=%d\n",
                sum, average, count, min, max);
        
    }
    
}
