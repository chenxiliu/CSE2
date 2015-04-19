////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//chen xi liu
//cse 2 hw12
//04/17/2015
//this program is to calculate the multiplication of two matrix

//import scanner
import java.util.Scanner;

//define class
public class Multiply{
    
    //implement randommatrix method
    public static int[][] randomMatrix(int w, int h) //accpet the width and height of the matrix
    {
        int[][] array = new int[w][h]; //declare and allocate the array
        for (int i = 0; i < w; i++) //go through the row
        {
            for (int m = 0; m<h; m++) //go through the column in that row
            {
                array[w][h] = (int)(Math.random()*(-10) + 10); //random number from -10 to 10 
            }
        }
        return array; //return the array value to the main method
    }//end of randomMatrix
    
    //implement printMatrix method
    //public static void printMatrix(int[][] array) //accept the array value
    //{
     //   for 
   // }//end of method
    
    
    //main method
    public static void main(String[] args)
    {
        int w1,h1,w2,h2; //initialize the variables
        Scanner scan = new Scanner(System.in); //declare and construct scanner
        int check = 0;
        do {
             System.out.print("Please enter the width and the height of the first array"); //prompt the user to enter the width and height for the first array
             //check first width
             int in1 = 0;
             int in2 = 0;
             while(in1<1)
             {
             if (scan.hasNextInt()) //check if it is integar
             {
                 w1 = scan.nextInt(); //initialize the first input as the width of the first array
                 if (w1 <= 0) //check if it is non - positive
                 {
                     System.out.println("error, non-positive, enter another affected width value"); //print error and ask for another affected value
                     scan.next();
                 }
                 else //else it is affected
                 {
                     in1 = 1; // set in to 1 to break loop
                     while (in2<1)
                     {
                     if (scan.hasNextInt()) //check if it is integar
                     {
                          h1 = scan.nextInt(); //initialize the first input as the width of the first array
                          if (h1 <= 0) //check if it is non - positive
                          {
                                System.out.println("error, non-positive, enter another affected height value"); //print error and ask for another affected value
                                scan.next();
                          }
                          else //else it is affected
                          {
                                in2 = 1; // set in to 1 to break loop
                           }
                     }
             else // else it is not integar
             {
                 System.out.println("error, non-integar, enter another affected height value"); //print error and ask for another affected value
                 scan.next();
             }
             }
                 }
             }
             else // else it is not integar
             {
                 System.out.println("error, non-integar, enter another affected width value"); //print error and ask for another affected value
                 scan.next();
             }
             }
             
             //check first height
             
             System.out.print("Please enter the width and the height of the second array"); //prompt the user to enter the width and height for the second array
             //check first width
             int in3 = 0;
             while (in3<1)
             {
             if (scan.hasNextInt()) //check if it is integar
             {
                 w2 = scan.nextInt(); //initialize the first input as the width of the first array
                 if (w2 <= 0) //check if it is non - positive
                 {
                     System.out.print("error, non-positive, enter another affected width value"); //print error and ask for another affected value
                     scan.next();
                 }
                 else //else it is affected
                 {
                     in3 = 1; // set in to 1 to break loop
                 }
             }
             else // else it is not integar
             {
                 System.out.print("error, non-integar, enter another affected width value"); //print error and ask for another affected value
                 scan.next();
             }
             }
             
             //check first height
             int in4 = 0;
             while (in4<1)
             {
             if (scan.hasNextInt()) //check if it is integar
             {
                 h2 = scan.nextInt(); //initialize the first input as the width of the first array
                 if (h2 <= 0) //check if it is non - positive
                 {
                     System.out.print("error, non-positive, enter another affected height value"); //print error and ask for another affected value
                     scan.next();
                 }
                 else //else it is affected
                 {
                     in4 = 1; // set in to 1 to break loop
                 }
             }
             else // else it is not integar
             {
                 System.out.print("error, non-integar, enter another affected height value"); //print error and ask for another affected value
                 scan.next();
             }
             }
             
             if (h1 == w2) // check if the height of the first array is equal to the width of the second array
             {
                 check = 1; //set check equals to 1 to break the while loop
             }
             else
             {
                 System.out.println("error, these dimensions are not compatible for matrix multiplication");
                 check = 0;
             }
        } while (check <1); //while check is 0, keep asking the user for the input
       
     int[][] array1 = randomMatrix(w1,h1); //the first array will be given by the randomMatrix method with the w, and h provided
int[][] array2 = randomMatrix(w2,h2); //the second array will be given by the randomMatrix method with the w, and h provided
        //printMatrix(int[][] array1);
    }//end of main method
    
}


