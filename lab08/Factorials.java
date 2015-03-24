///////////////////////////////////////////////////////////
//chenxi liu
//cse 02 -- lab 08
//3/20/2015
//factorial java program

//import scanner
import java.util.Scanner;

//define class
public class Factorials{
    
    //define main method
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.print("Enter an integer n: "); // ask the user to enter an input
        int n = s.nextInt();
        int sum = 0;
        for (int i = 1; i <= n; i++)
        {
            sum += factorial(i);
        }
        System.out.println("The super factorial of " + n +  " is " + sum + ".");
    }
    public static int factorial (int m)
    {
        int x = 1;
        for (int i = 1; i <= m; i++)
        {
            x*=i;
        }
        return x;
    }
    
}
