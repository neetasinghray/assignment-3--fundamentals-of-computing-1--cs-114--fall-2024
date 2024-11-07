
import org.fusesource.AnsiConsole;
import static org.fusource.jansi.Ansi.*;
import static org.fusesource.jansi.Ansi.color.*;

import java.util.Scanner;

public class RunMatrix {
  public static void main(String[] args) {
    AnsiConsole.systemInstall();

    Matrix myMatrix = new Matrix(size);

    // prompt the user to obtain the size of the matrix
    System.out.println("Please enter the size of your matrix : ");
    Scanner input = new Scanner(System.in);
    int size = input.nextInt();
    if(size > 0){
      System.out.println("Valid entry ! proceed");

    System.out.println(myMatrix.size);

    myMatrix.populateMatrix(matrix);

    myMatrix.printMatrix(matrix);

    myMatrix.flipMatrix(matrix);

    myMatrix.printMatrix(matrix);
    }
      else{
        System.out.println(" Sorry invalid entry ! Try again");
      }


    input.close();

//Restore default console bheavior
   AnsiConsole.systemUninstall();
  }
}
