import java.util.*;
public class QuadraticEquation {
    public static void main(String[] args) 
    {
        Scanner in = new Scanner(System.in);
        double a = in.nextDouble(), b = in.nextDouble(), c = in.nextDouble();
        double root1, root2;
        double D = b * b - 4 * a * c;
        if (D > 0) {
          root1 = (-b + Math.sqrt(D)) / (2 * a);
          root2 = (-b - Math.sqrt(D)) / (2 * a);
          System.out.println("root1 = "+root1+" root2 = "+root2 );
        }
    
        else if (D == 0) {
          root1 = root2 = -b / (2 * a);
          System.out.println("root1 = "+root1+" root2 = "+root2 );
        }
        else {
          System.out.println("Imaginary Roots");
        }
    }
}