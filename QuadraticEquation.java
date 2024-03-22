import java.util.Scanner;
import java.lang.Math;

public class QuadraticEquation
{
  public static void main(String[] args)
  {
    Scanner input = new Scanner(System.in);
    
    System.out.print("Input a: ");
    double a = input.nextDouble();

    System.out.print("Input b: ");
    double b = input.nextDouble();

    System.out.print("Input c: ");
    double c = input.nextDouble();

    double root_1 = ((-b) + Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);
    double root_2 = ((-b) - Math.sqrt(Math.pow(b, 2) - 4 * a * c)) / (2 * a);

    System.out.print("The roots are "+ root_1 + " and "+ root_2);
  }
}
