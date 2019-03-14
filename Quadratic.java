/*Quadratic.java puts values into the quadratic equation and gives the of x
*Lorrayya Williams
*March 04, 2019 for CS 214 at Calvin College */

//imports the math properties
import java.lang.Math.*;
import java.util.Scanner;



//java class Quadratic
public class Quadratic
{
  public static void main (String[] args){

    Scanner keyboard = new Scanner(System.in);

    //Greeting and explanation message
    System.out.println("This program allows you to find the value of x.");
    System.out.println("\nIt utilizes the quadratic formula.");

    // prompt for  the value of a
    System.out.println("\nEnter the value for a: ");
    double a = keyboard.nextDouble();

    // prompt for the value of c
    System.out.println("\nEnter the value of b: ");
    double b = keyboard.nextDouble();

    //prompts for the value of c
    System.out.println("\nEnter the value of c: ");
    double c = keyboard.nextDouble();


    //Computes the value of X
    double [] roots = new double[2];

    quadraticRoots( a, b, c, roots);
    System.out.println("\nThe values of x are " + roots[0]+ " or "+ roots[1]);

  }
  /*QuadraticRoots gets the value of x using the quadratic equation
  Recieve: The values of a, b, c, root1, root2
  Outputs: New values for root1 and root2
  */
  public static boolean quadraticRoots( double a, double b, double c, double [] roots){
    double root1;
    double root2;
    //double array [] = new double[2];
    if (a != 0) {
      double arg = (Math.pow(b, 2.0) - (4*a*c));
      if(arg >=0) {
        root1 = (-b + Math.sqrt(arg))/(2*a);
        root2 = (-b - Math.sqrt(arg))/(2*a);
        roots[0] = root1;
        roots[1] = root2;
        return true;
      } else{
        root1 = root2 = 0.0;
        roots[0] =root1;
        roots[1] = root2;
        System.out.println("\nThe square root of zero can't be taken.");
        return false;
      }
    } else {
      root1 = root2 = 0.0;
      roots[0] =root1;
      roots[1] = root2;
      System.out.println("\nA is 0. It is impossible to divide by zero.");
      return false;
    }
  }
}
