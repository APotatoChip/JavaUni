/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unwe_examples;

/**
 *
 * @author alex
 */
public class VariableScope {
    public static void main(String args[])
    {
        int a=2;
        int p=1;
        for(int i=0;i<5;i++)
            p=p*a;
        
        System.out.println(p);
    }
    
    public static void t()
    {
         
        int a=2;
        
        for(int i=0;i<5;i++)
        { 
            int p=1;
            p=p*a;
        }
        
        
     //   System.out.println(p);
    
    }
    
     public static void t1()
    {
        {
        int a=2;
        int p=1;
        for(int i=0;i<5;i++)
        { 
            p=p*a;
            {int z=0;}
            
   //                           z++;
        }
        System.out.println(p);
    }
    }
    
}
