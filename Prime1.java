import java.util.Scanner;
public class Prime1
{
    public static void main(String[] args)

    {
        Scanner s1 = new Scanner(System.in);

        System.out.print("Enter a number = ");
        int a = s1.nextInt();

        for (int i = 1; i <= a; i++)
        {
            if (a / i == a && a%++i == 0 )
            {
                System.out.println("the entered number is not a prime number");
                break;
            }
            else
            {
                System.out.println("the entered number is prime number");
                break;
            }

        }


    }
}
