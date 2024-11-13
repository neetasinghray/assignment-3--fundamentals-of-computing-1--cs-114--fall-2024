public class Matrix {

  final String YELLOW = "\u001b[33m";
  final String RESET = "  ";
  int size;
  //Creating the matrix field

  int[][] matrix;

  /**
   * Constructor: Sets up this matrix with the user specified, width and height
   * values and print the dimension of the matrix.
   * @param size
   */
  public Matrix(int size) {
    System.out.println(" Your matrix is" + size + "X" + size + " ");
  }

  /**
   * Swaps two elements of the indices passed as an arguments
   * @param matrix
   * @param x1
   * @param y1
   * @param x2
   * @param y2
   */
  private static void swap(int[][]matrix, int x1, int y1, int x2, int y2) {
    int temporary = matrix[x1][y1];

    matrix[x1][y1] = matrix[x2][y2];
    matrix[x2][y2] = temporary ;
  }

  /**
   * Printing matrix, with highlighted diagonal elements
   */
  public static void printMatrix(){
    for (int width = 0; width < size; width++) {
      for (int height = 0; height < size; height++) {
        if(width + height = size-1){
          System.out.println(YELLOW +(matrix[width][height])+RESET+(matrix[width][height]));
        } else {
          System.out.print(matrix[width][height] + "\t");
        }
      }

      System.out.println();
    }
  }

  /**
   * Method to populate the matrix with values
   */
  public static void populateMatrix() {
    //populating matrix with default values
    System.out.println("Printing matrix with default values ");

    for (int width = 0; width < size; width++) {
      for (int height = 0; height < size; height++) {
        matrix[width][height] = (width * 0) + (height * 0);
      }
    }

    // populating matrix with values from 1-(size * size),
    // using a counter variable to keep track of the current
    // number to be inserted into the matrix.
    System.out.println("Populating matrix....matrix populated ");
    System.out.println("Printing matrix");

    int counter = 1;

    for (int width = 0; width < size; width++) {
      for (int height = 0; height < size; height++) {
        matrix[width][height] = counter++;
      }
    }

    // flips the matrix values,on one side of the
    // diagonal (from top right to bottom left) with the other side
    // leaving the diagonal elements untouched.

  public static flipMatrix() {
      System.out.println("Flipping matrix.....matrix flipped");
      System.out.println("Printing flipped matrix");

      for(int width = 0; width < size; width++){
        for(int height = 0; height< size-width-1; height++){
          int temporary1 = matrix[width][height];

          matrix[width][height] = matrix[size-height-1][size-width-1];
          matrix[size-height-1][size-width-1] = temporary1;

          System.out.print(matrix[width][height] + "\t");
        }

        System.out.println();
      }
    }
  }
}
