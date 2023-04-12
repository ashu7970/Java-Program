import java.util.Scanner;

public class Calculator
{
  private int Add(int a, int b)
   {
     int add = a + b;
     return add;
   }
 
  private int Subtract(int c, int d)
    {
      int sub = c - d;
      return sub;
    }

  private int Divide(int e, int f)
    {
     int div = e / f;
     return div;
    }
 
  private int Multiply(int g, int h)
     {
      int mul = g * h;
      return mul;
     }

 public static void main(String[] args)
    {
      Scanner s1 = new Scanner(System.in);
    
      
      System.out.println("1. Addition");
      System.out.println("2. Subtraction");
      System.out.println("3. Division");
      System.out.println("4. Multiplication");
      System.out.println("Choose from the option ");
      int z = s1.nextInt();
      System.out.print("You Choose : " +z);
      
      System.out.print("\n *********************** ");
   
      System.out.print("\n Enter the first number : ");
      int x = s1.nextInt();
      System.out.print(" Enter the second number : ");
      int y = s1.nextInt();

      System.out.println(" *********************** ");
      
      Calculator obj = new Calculator();

      switch(z)
         {
           case 1: 
                   int result = obj.Add(x,y);
                   System.out.print("The addition of " +x+ " + " +y+ " = " +result);
                   break;
          
          case 2: 
                   int re = obj.Subtract(x,y);
                   System.out.print("The subtraction of " +x+ " - " +y+ " = " +re);
                   break;
          
         case 3: 
                   int res = obj.Divide(x,y);
                   System.out.print("The division of " +x+ " / " +y+ " = " +res);
                   break;

         case 4:
                   int resul = obj.Multiply(x,y);
                   System.out.print("The multiplication of " +x+ " * " +y+ "= " +resul);
                   break;
       
         default: System.out.println("Invalid Operation");
         }
      }
  }
  




