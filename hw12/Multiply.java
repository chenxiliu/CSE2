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
                array[i][m] = (int)(Math.random()*(-20) + 10); //random number from -10 to 10 
            }
        }
        return array; //return the array value to the main method
    }//end of randomMatrix
    
    //main method
    public static void main(String[] args)
    {
        int w1=0,h1=0,w2=0,h2=0; //initialize the variables
        String n = ""; //initialze a string
        int[] input = new int[4]; //initialize an array for the four values
        Scanner scan = new Scanner(System.in); //declare and construct scanner
        int check = 0;
        do{
            System.out.println("Please first enter the width for first array, and height for first array, then width for the second array, and height for second array, one by one");
            //ask the user to enter the input once at a time
            System.out.println(); //blank space
            for (int i = 0; i < 4; i++)//read the four inputs
            {
                switch (i) //switch base on the i value
                {
                    case 0: n = "first width"; //for the first input, it is first array width
                    break;
                    case 1: n = "first height"; //for the second input, it is the first array height
                    break;
                    case 2: n = "second width"; //for the third input, it is second array width
                    break;
                    case 3: n = "second height"; //for the fourth input, it is second array width
                    break;
                }
                System.out.print("Please enter " + n +" "); //enter the value as asked
                int in = 0; //initiaze a checking value as 0
                do{ //do the following at least once
                if (scan.hasNextInt()) //check if it is integar
                {
                    input[i] = scan.nextInt(); //initialize the first input as the width of the first array
                    if (input[i] <= 0) //check if it is non - positive
                    {
                         System.out.print("error, non-positive, enter another affected " + n +" value "); //print error and ask for another affected value
                    }
                    else //else it is affected
                    {
                         in = 1; // set in to 1 to break loop
                    }
                }
                else // else it is not integar
                {
                    System.out.print("error, non-integar, enter another affected " + n+ " value "); //print error and ask for another affected value
                    scan.next(); //read value again
                }
                } while(in<1); //continue the loop until the check value is set to be 1
            }//end of for loop
            
            w1 = input[0]; h1 = input[1]; w2 = input[2]; h2 = input[3];
            if (h2 == w1) // check if the height of the first array is equal to the width of the second array
             {
                 check = 1; //set check equals to 1 to break the while loop
             }
             else
             {
                 System.out.println("error, these dimensions are not compatible for matrix multiplication."); //print out error
                 check = 0; //check stay 0
             }
        }while (check<1); //continue the loop until the check value is set to be 1
    int[][] array1 = randomMatrix(w1,h1); //the first array will be given by the randomMatrix method with the w, and h provided
    int[][] array2 = randomMatrix(w2,h2); //the second array will be given by the randomMatrix method with the w, and h provided
    System.out.println("The first array is"); //printing the first array
    printMatrix(array1); //print the array1 in printMatrix
    System.out.println("The second array is"); //printing the second array
    printMatrix(array2); //print the array2 in printMatrix
    int[][] array3 = matrixMultiply(array1, array2);//initialize the matrix mulplication as array3
    System.out.println("The mulplication array is"); //printing the second array
    printMatrix(array3); //print the array3 in printMatrix
    }//end of method
    
    public static void printMatrix(int[][] array) //accept the array
    {
        int w = array.length-1; //read the width of the array
        int h = array[0].length-1; //read the height of the array
        for (int i = 0; i <= h; i++) //printing in row
        {
            for (int n = 0; n <= w; n++) //read the integers in the row
            {
                if (n == w) //when it is the last integer in the row
                {
                    System.out.println(array[n][i]); //start a now row
                }
                else
                {
                    System.out.print(array[n][i]+ " "); ////print the integer
                }
            }
        }
    }//end of the method
    public static int[][] matrixMultiply(int[][]array1, int[][]array2)
    {
        int w1 = array1.length; //read the width of the array
        int h1 = array1[0].length; //read the height of the array
        int w2 = array2.length; //read the width of the array
        int h2 = array2[0].length; //read the height of the array
        int[][] array3 = new int[w2][h1]; //initialize a new array with the width of second array and height of the first array
        for (int i = 0; i < h1; i++) //go through the height of the new array
        {
            for (int m = 0; m< w2; m++) //go through the width of the new array
            {
                for (int n = 0; n < h2; n ++) //for each part
                {
                    array3[m][i] += array1[n][i]*array2[m][n]; //it is the sum of mltiplication of the integers at the spesific position
                }
            }
        }
        return array3; //return the new array
    }//end of method
    
}