/* 
   JFM1T5_Assignment 5:
   Write a program to find and print the maximum element in a two-dimensional array with its index position.
   Prompt the user input from the terminal.
   
   Sample Input:
   Enter number of row and column: 
   2
   3
   Enter arr [ 0 ] [ 0] : 1
   Enter arr [ 0 ] [ 1] : 2
   Enter arr [ 0 ] [ 2] : 3

   Enter arr [ 1 ] [ 0] : 4
   Enter arr [ 1 ] [ 1] : 5
   Enter arr [ 1 ] [ 2] : 6
   
   Expected Output:
   Largest element in array is 6 and its index position is arr [ 1 ] [ 2 ]  

*/

import java.util.Scanner;

public class TwoDimentionalArray {

//Define the main method
public static void main(String args[])
{
Scanner sc=new Scanner (System.in);
int i,j;
System.out.println("Enter row ");
 int row = sc.nextInt();  
     System.out.println("Enter column:");  
    int column = sc.nextInt();  
    int array[][] = new int[row][column];  
    System.out.println("Enter matrix elements:");  
     for(i = 0; i < row; i++)  
    {  
        for(j = 0; j < column; j++)   
            {  
            array[i][j] = sc.nextInt();  
            System.out.print(" ");  
            }  
    }  
     for(i = 0; i < row; i++)  
        {  
            for(j = 0; j < column; j++)  
            {  
            System.out.print("Largest elment in an array with index[1][2]:"+array[1][2]);  
            return;
            }  
           // System.out.println(" ");  
        }  

}

}