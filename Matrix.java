
//import java.util.Scanner;

import java.util.Scanner;

public class Matrix {
  public static void main(String[] args) {

// Obtaining dimension of the MATRIX from the user
    Scanner scannerInput = new Scanner(System.in);
    System.out.print("Enter number of rows  :");
    int row = scannerInput.nextInt();
    System.out.print("Enter number of columns  :");
    int col = scannerInput.nextInt();

// Creating the matrix field
    int[][] matrix = new int[row][col];

// Load the matrix with values equals 0's
for (row = 0; row < matrix.length; row++) {
      for (col = 0; col < matrix[row].length; col++) {
        matrix[row][col] = (row * 0) + (col * 0);
      }
    }
// Print the matrix
    for (row = 0; row < matrix.length; row++) {
      for (col = 0; col < matrix[row].length; col++) {
        System.out.print (matrix[row][col] + "\t");
      }

      System.out.println();
    }
  }
}
