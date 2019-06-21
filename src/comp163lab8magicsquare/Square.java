// Sajid Ahmed
// Lab 8 - Arrays
// Define a Square class with methods to create and read in
// info for a square matrix and to compute the sum of a row,
// a col, either diagonal, and whether it is magic.

package comp163lab8magicsquare;

import java.util.Scanner;
public class Square
{
    int[][] square;
//--------------------------------------
//create new square of given size
//--------------------------------------
    public Square(int size)
    {
        square = new int[size][size];
        System.out.println("Initializing the square of size: " + size);
    }
//--------------------------------------
//return the sum of the values in the given row
//--------------------------------------
    public int sumRow(int row)
    {
        int sum = 0;
        for (int i = 0; i < square[0].length; i++)
            sum += square[row][i];
        System.out.println("Calculating the sum of row: " + row);
        return sum;
    }
//--------------------------------------
//return the sum of the values in the given column
//--------------------------------------
    public int sumCol(int col)
    {
        int sum = 0;
        for (int i = 0; i < square.length; i++)
            sum += square[i][col];
        System.out.println("Calculating the sum of column: " + col);
        return sum;
    }
//--------------------------------------
//return the sum of the values in the main diagonal
//--------------------------------------
    public int sumMainDiag()
    {
        int sum = 0;
        for (int i = 0; i < square[0].length; i++)
            sum += square[i][i];
        System.out.println("Calculating the sum of the main diagonal." );
        return sum;
    }
//--------------------------------------
//return the sum of the values in the other ("reverse") diagonal
//--------------------------------------
    public int sumOtherDiag()
    {
        int sum = 0;
        int x = square.length;
        for (int i = 0; i < x; i++)
            sum += square[x-1-i][i];
        System.out.println("Calculating the sum of the other diagonal.");
        return sum;
    }
//--------------------------------------
//return true if the square is magic (all rows, cols, and diags have
//same sum), false otherwise
//--------------------------------------
    public boolean magic()
    {
        int d1 = sumMainDiag();
        int d2 = sumOtherDiag();
        System.out.println("Checking if square is magic;");
    
        if (d1 != d2) 
            return false;
        for (int i = 0; i < square.length; i++)
        {
            if (d1 != sumRow(i) || d1 != sumCol(i)) 
                return false;
        }
        return true;
    }
//--------------------------------------
//read info into the square from the input stream associated with the
//Scanner parameter
//--------------------------------------
    public void readSquare(Scanner scan)
    {
        for (int row = 0; row < square.length; row++)
        for (int col = 0; col < square.length; col ++)
        {
            System.out.println("Please enter square [" + row + "][" + col + "] = "); 
            square[row][col] = scan.nextInt();
        }
    }
//----------------------------------------
//print the contents of the square, neatly formatted
//----------------------------------------
    public void printSquare()
    {
        for (int row = 0; row < square.length; row++)
        {
            System.out.println("");
            for (int col = 0; col < square.length; col ++)
                System.out.print(square[row][col] + " ");
        }
    }
}
