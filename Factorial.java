import java.util.*;
   public class Factorial
   {
      public static void main(String args[])
      {
         int factorial=1, ;
         System.out.println("Enter the number to calculate it's dactorial value :");
         Scanner sc = new Scanner(System.in);
         int number = sc.nextInt();

         for(int i = 1; i<=number; i++)
         {
            factorial = factorial * i;
         }
         System.out.println("Factorial of the given number is= "+factorial);
      }
   }
