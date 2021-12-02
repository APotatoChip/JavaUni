import java.util.Scanner;
import java.io.*;
import java.util.*;
public class MatrixVertical{
    public static void main (String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Rows: ");
        int rows = scan.nextInt();
        System.out.print("Columns: ");
        int columns=scan.nextInt();
        int curr=1;
        int [][] matrix = new int[columns][rows];
        for(int i=0;i<columns;i++){
            for(int j=0;j<rows;j++){
                matrix[i][j]=curr;
                curr++;
            }
        }
        for(int i = 0; i < matrix[0].length; i++) {
            for(int j = 0; j < matrix.length; j++) {
                System.out.print(matrix[j][i]+"\t");
            }
            System.out.println();
        }
    
    }
}