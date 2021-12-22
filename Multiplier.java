/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplier;

import java.util.Scanner;

/**
 *
 * @author venko
 */
public class Multiplier {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        
        int size;
        System.out.print("Size: ");
        size = s.nextInt();
        
        int[] first = new int[size];
        int[] second = new int[size];
        
        for(int i = 0; i < size; i++) {
            System.out.printf("first %d: ", i);
            first[i] = s.nextInt();
        }
        
        for(int i = 0; i < size; i++) {
            System.out.printf("second %d: ", i);
            second[i] = s.nextInt();
        }
        
        for(int i = 0; i < size; i++) {
            int result = first[i] * second[i];
            System.out.println(result);
        }
        
        
        
        
        
        
    }
    
}
