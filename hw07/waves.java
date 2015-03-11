//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//03/11/2015
//Chen xi liu
//cse 2 hw 07
//waves java program

//This program is to use three different loops to generate three stacks of numbers like waves as shown in hw document.

//import scanner
import java.util.Scanner;

//define class
public class waves{
    
    //main method
    public static void main(String[] args)
    {
        Scanner myScanner = new Scanner(System.in); //declare scanner and call construction
        System.out.print("Enter a number between 1 and 30: "); //ask the user to enter an integar as required
        if (myScanner.hasNextInt())  //check if it is an integar
        {
            int n = myScanner.nextInt(); //take the input as n
            if (n>1 && n<30) //check if n is inclusive
            {
                System.out.println(""); // blank line
                System.out.println("FOR LOOP:"); //for loop
                //for loop
                for (int i = 1; i <= n ; i ++) //i is the integar printed
                {
                    for (int m =1; m <= i; m++) // m is the line number of each integar
                    {
                        if (i%2 == 0) //if i is even, print by increasing 
                        {
                            for (int a = 1; a<m; a++) //a is the number of integar printed in each line
                            {
                                System.out.print(i);
                            }//end of 3rd loop
                            System.out.println(i); //start a new line
                        } //end of even if loop
                        else //i is odd, print by decreasing
                        {
                            for (int a = i-m; a>0; a--)
                            {
                                System.out.print(i);
                            }//end of 3rd loop
                            System.out.println(i); //start a new line
                        } //end of odd if loop
                    }//end of 2nd for loop
                }//end of for 1st loop
                
                
                System.out.println(""); // blank line
                System.out.println("WHILE LOOP:"); //while loop
                //while loop
                int i = 1;
                
                while (i<=n)
                {
                    int m = 1;
                    while (m <= i)
                    {
                        if (i%2 == 0) //if i is even, print by increasing 
                        {
                            int a = 1;
                            while (a<m) //a is the number of integar printed in each line
                            {
                                System.out.print(i);
                                a++; //increase the number printed in each line
                            }//end of 3rd loop
                            System.out.println(i); //start a new line
                        } //end of even if loop
                        else //i is odd, print by decreasing
                        {
                            int a = i-m;
                            while ( a>0 )
                            {
                                System.out.print(i);
                                a--; //decrease the number printed in each line
                            }//end of 4th loop
                            System.out.println(i); //start a new line
                        } //end of odd if loop
                        m++;
                    }//end of 2nd while loop
                    i++;
                }// end of 1st while loop
                
                
                System.out.println(""); // blank line
                System.out.println("DO-WHILE LOOP:"); //do-while loop
                //do-while loop
                i = 1;
                do 
                {
                    int m = 1;
                    do
                    {
                        if (i%2 == 0) //if i is even, print by increasing 
                        {
                            int a = 1;//a is the number of integar printed in each line
                            if (a<m) //run only when a<m
                            {
                                do 
                                {
                                    System.out.print(i);
                                    a++; //increase the number printed in each line
                                } while (a<m);//end of 3rd loop
                            }//end of if loop
                            System.out.println(i); //start a new line
                        } //end of even if loop
                        else //i is odd, print by decreasing
                        {
                            int a = i-m;
                            if (a>0) //run only when a>0
                            {
                                do
                                {
                                    System.out.print(i);
                                    a--; //decrease the number printed in each line
                                }while ( a>0 );//end of 4th loop
                            }//end of if loop
                            System.out.println(i); //start a new line
                        } //end of odd if loop
                        m++;
                    }while (m <= i);//end of 2nd while loop
                    i++;
                }while(i<=n); //end of 1st do-while loop
            }//end of if loop that n is inclusive.
            else
            {
                System.out.println("The integar is out of range.");
                return;
            }//end of if loop that n is out of range.
        }//end of if loop with integar
        else
        {
            System.out.println("Please enter an integar.");
            return;
        }//end of nonintegar
        
    }//end of method
}//end of class