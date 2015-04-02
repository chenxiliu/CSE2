///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//chen xi liu
//cse 02 lab10
//04/03/2015

//import scanner
import java.util.Scanner;

//define class
public class ArrayInputs{
    
    //define main method
    public static void main(String[] args){
        System.out.print("Please enter an integer for the size of an array: "); //ask for the size
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] studentIds = new int[n];
        
        for (int i = 0; i < n ; i++)
        {
            int m = 0;
            while (m < 1)
            {
            System.out.print("Please enter a positive integer: ");
                if (scan.hasNextInt())
                {
                    int x = scan.nextInt();
                    if (x > 0)
                    {
                        studentIds[i] = x;
                        m++;
                    }
                    else
                    {
                        System.out.println("Sorry, the number you entered is negative.");
                    }
                }
                else 
                {
                    System.out.println("Sorry, you didn’t enter an integer.");
                    scan.next();
                }
            }
        }
        System.out.println("The array is:");
        System.out.println(studentIds);
    }
}