/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package counting;

import java.util.Scanner;

/**
 *
 * @author venko
 */
public class Counting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int[] numbers = new int[7];
        
        System.out.println("Enter 7 numbers: ");
        for(int i = 0; i < 7; i++) {
            numbers[i] = s.nextInt();
        }
        
        int positive = 0, negative = 0, zeroes = 0;
        for(int i = 0; i < 7; i++) {
            if(numbers[i] > 0) {
                positive++;
            } else if(numbers[i] == 0) {
                zeroes++;
            } else {
                negative++;
            }
        }
        
        System.out.printf("Positive: %d\nNegative: %d\nZeroes: %d\n", positive, negative, zeroes);
        
        
        
    }
    
}
