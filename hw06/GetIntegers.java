////////////////////////////////////////////////////////////////////////////
//03/01/2015
//chenxi liu
//cse 02 hw06
//get integers java program

//import Scanner
import java.util.Scanner;

//define a class
public class GetIntegers{
    
    //main method
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in); //declare scanner and call constuction
        System.out.println("Please enter 5 non-negative integers: "); // ask the users to enter 5 non-negative integers
        int n1 = 0, n2 = 0 , n3 = 0, n4=0, n5=0; //initialize the 5 numbers
        for (int n = 0; n<100 ; n++) // continue the loop if the user doesnt give the valid input
        {
        if (myScanner.hasNextInt()) //check the first number if it is an integer
        {
            n1 = myScanner.nextInt(); //if it is n1 will be the integer
            if (n1 < 0)  // check the first interger if it is negative
            {
                System.out.println("invalid input, enter again"); //if it is negative ask the user to enter another number
            }
            else 
            {
                n1 = n1; //if not the number will be the same 
                break; //the loop breaks
            }
        }
        else
        {
            System.out.println("invalid input, enter again"); //ask the user to enter another interger
            myScanner.next(); //read the integer
        }
        
        }//end of the first loop
        
        
        for (int n = 0; n<100 ; n++) //continue the loop if the user doesnt give the valid input
        {
        if (myScanner.hasNextInt()) //check the second number if it is an integer
        {
            n2 = myScanner.nextInt(); // n2 will be the second interger
            if (n2 < 0) //check if the second integer is negative
            {
                System.out.println("invalid input, enter again"); // ask the user to enter another input if negative
            }
            else 
            {
                n2 = n2; //else take the integer
                break; //break the loop
            }
        }
        else
        {
            System.out.println("invalid input, enter again");  //ask the use to enter another input if not integer
            myScanner.next(); //read the input
        }
        
        }//end of the second loop
        
        for (int n = 0; n<100 ; n++) //continue the loop if the user doesnt give the valid input
        {
        if (myScanner.hasNextInt()) //check the input if it is an integer
        {
            n3 = myScanner.nextInt(); //take the integer as n3
            if (n3 < 0)  //check the n3 if it is negative
            {
                System.out.println("invalid input, enter again"); //ask the user to enter another input if negative
            }
            else 
            {
                n3 = n3; //else take the integer 
                break; //break the loop
            }
        }
        else
        {
            System.out.println("invalid input, enter again"); //if non integer, enter another input
            myScanner.next(); //read the input
        }
        
        }//end of the third integer
        
        for (int n = 0; n<100 ; n++) //continue the loop if the user doesnt give the valid input
        {
        if (myScanner.hasNextInt()) // check the input if it is an integer
        {
            n4 = myScanner.nextInt(); //take the integer as n4
            if (n4 < 0) //check n4 if it is negative
            {
                System.out.println("invalid input, enter again"); //ask the user to enter another input
            }
            else 
            {
                n4 = n4; //take the n4
                break; //break the loop
            }
        }
        else
        {
            System.out.println("invalid input, enter again"); //if non integer enter another input
            myScanner.next(); //read the input
        }
        
        }//end of the fourth integer
        
        for (int n = 0; n<10 ; n++) //continue the loop if the user doesnt give the valid input
        {
        if (myScanner.hasNextInt()) //check the input if it is integer
        {
            n5 = myScanner.nextInt(); //take it as n5 
            if (n5 < 0) //check if it is negative
            {
                System.out.println("invalid input, enter again"); //ask the user to enter another input if negative
            }
            else 
            {
                n5=n5; // take n5
                break;//break loop
            }
        }
        else
        {
            System.out.println("invalid input, enter again"); // if non integer enter another input
            myScanner.next(); //read the input
        }
        
        }//end of the fifth integer
        int total = n1 +n2+n3+n4+n5; //sum up the five integers
        System.out.println("SUM is " + total); //print out the sum
    }//end of method
}//end