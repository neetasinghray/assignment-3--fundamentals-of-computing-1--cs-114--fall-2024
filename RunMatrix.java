import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {

    final int[][] matrix;
    final String YELLOW = "\u001b[33m";
    final String RESET = "  ";

    //prompt the user to obtain the size of the matrix
    System.out.println("Please enter the size of your matrix : ");
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    Matrix myMatrix = new Matrix(size);
    if(size > 0){
      System.out.println("Valid entry ! proceed");

    myMatrix.Matrix(size);

    myMatrix.populateMatrix(matrix);

    myMatrix.printMatrix(matrix);

    myMatrix.flipMatrix(matrix);

    myMatrix.printMatrix(matrix);
    }
      else{
        System.out.println(" Sorry invalid entry ! Try again");
        System.out.println("Please enter the size of your matrix : ");
      }
    input.close();
  }
}
