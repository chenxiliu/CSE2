/////////////////////////////////////////////////////////////////////////////////
//03/01/2015
//chenxi liu
//cse 2 hw06

//import Scanner
import java.util.Scanner;

//define a class
public class RunFactorial{
    
    //main method
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in); //declare scanner and call construction
        System.out.println("Please enter an integer that is between 9 and 16"); // ask the user to enter an integer
        int fact = 1, i = 1, n1 = 0;
        for (int n = 0; n<100 ; n++) // continue the loop if the user doesnt give the valid input
        {
        if (myScanner.hasNextInt()) //check the input if it is an integer
        {
            n1 = myScanner.nextInt(); //if it is, n1 will be the integer
            if (n1 <= 9 || n1 >= 16)  // check the first interger if it is out of the range
            {
                System.out.println("invalid input, enter again"); //if it is out of the range, ask the user to enter another number
            }
            else 
            {
                //if in the range, do the following
                while ( i <= n1)  //when i is smaller than the input value, the loop will go on
                {
                    fact = fact * i; //the factorial value equation
                    i =i+1; //increase the factor by one
                }
                System.out.println("Input accepted:"); //print out the accepted input
                System.out.println(n1+"! = " + fact); // and the factorial we found
                break;
            }
        }
        else
        {
            System.out.println("invalid input, enter again"); //ask the user to enter another interger
            myScanner.next(); //read the integer
        }
        
        }
    }
}