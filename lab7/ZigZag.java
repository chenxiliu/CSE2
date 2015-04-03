////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//chen xi liu
//cse 02 lab 07


import java.util.Scanner;

public class ZigZag{
    
    public static void main(String[] args){
        
        int nStars = 0;
        Scanner scan = new Scanner(System.in);
        int x = 0;
        while (x<1)
        {
            System.out.print("Enter an integer between 3 and 33: ");
            if (scan.hasNextInt())
            {
                nStars = scan.nextInt();
                if (nStars < 3 || nStars > 33)
                {
                    System.out.println("The number is out of range [3,33].");
                    break;
                }
                else 
                {
                    for (int i = 1; i < nStars; i ++)
                    {
                        System.out.print("*");
                    }
                    System.out.println("*");
                    for (int i = 2; i < nStars; i ++)
                    {
                        for (int m = 1; m < i; m++)
                        {
                            System.out.print(" ");
                        }
                        System.out.println("*");
                    }
                    for (int i = 1; i < nStars; i ++)
                    {
                        System.out.print("*");
                    }
                    System.out.println("*");
                }
            }
            else 
            {
                System.out.println("Enter an integer.");
                break;
            }
            System.out.print("Enter y or Y to go again. ");
            String a = scan.next();
            if (a.equals("y") || a.equals("Y"))
            {
                x = 0;
            }
            else
            {
                break;
            }
            
        }
    }
}