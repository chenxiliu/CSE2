//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Chen Xi Liu
//cse2 hw 13
//cse2 4d array program

//the goal of this program is to create containing random 4d array

//import scanner
import java.util.Scanner;

//define class
public class FourDwin{
    
    //define method
    public static void main(String [] arg){
        System.out.print("Enter an integer X: "); //prompt the user to enter first input
        Scanner scan = new Scanner(System.in); //define and construct scanner
        int X = scan.nextInt(); //accept the input as X
        int Y = 0;
        System.out.print("Enter an integer Y > X: "); //prompt the user to enter second input
        int n = 0;
        while (n < 1)
        {
            Y = scan.nextInt(); //accept the input as Y
        if (X >= Y)
        {
            System.out.print("Invalid input. Please enter an integer for Y > X: "); //prompt the user to enter another input
        }//end of if
        else 
        {
            n++; //increase n to break out the while loop
        }
        }//end of checking Y value
        
        int Z = Y -X +1; //Z is the difference between the two values
        int s1,s2,s3; //initialize the sizes
        double[][][][] array = new double [3][][][]; //create a 4D array with outermost array of size 3
        for (int i = 0; i < 3; i++) //the outermost array
        {
            s1 = (int)(Math.random()*Z+X); //randomly decide the size of 1st subarray between X and Y
            array[i] = new double[s1][][];

            for (int v = 0; v < s1; v++) //the 2nd array
            {
                s2 = (int)(Math.random()*Z+X); //randomly decide the size of 2nd subarray between X and Y
                array[i][v] = new double[s2][];

                for (int m = 0; m < s2; m++) //the 3rd array
                {
                    s3 = (int)(Math.random()*Z+X); //randomly decide the size of 3rd subarray between X and Y
                    array[i][v][m] = new double[s3];

                    for (int k = 0; k < s3; k++) //the 4th array
                    {
                        array[i][v][m][k] = (int)(Math.random()*300)/10.0; //random value between 0 to 30
                        System.out.print(array[i][v][m][k] + " ");
                    }
                }//end of loop m
            }//end of loop v
        }//end of loop i
        System.out.println("Original Array:");
        printArray(array);
        double [][][][] sort = sort4DArray(array); //go to method sort4DArray to sort the 4D
        double [][][][] sort3D = sort3DArray(sort); //go to method sort3DArray to sort the 3D
        System.out.println("sorted Array:");
        printArray(sort3D);
        statArray(array); //go to method statArray to find sum and mean
    }//end of main method
    
    public static void statArray(double[][][][] array) //accept the array
    {
        int s1, s2, s3; //initialize the size
        double sum = 0; //initialize sum value
        int element =0; //initialize the element
        for (int i = 0; i < 3; i++) //the outermost array
        {
            s1 = array[i].length; //read the length of subarray
            for (int n = 0; n < s1; n++) //the 2nd array
            {
                s2 = array[i][n].length; //read the length of subarray
                for (int m = 0; m < s2; m++) //the 3rd array
                {
                    s3 = array[i][n][m].length; //read the length of subarray
                    for (int k = 0; k < s3; k++) //the 4th array
                    {
                        sum += (int)(array[i][n][m][k]*10)/10; //add the values to sum
                        element ++; //adding element number by one
                    }
                }
            }
        }
        System.out.println("members: " + element); //print the member number
        System.out.println("sum: "+ sum); //print the sum of all the members
        System.out.println("mean: " + (int)(sum/element*10)/10); //print the mean value
        
    }//end of method statArray
    
    public static double[][][][] sort4DArray(double[][][][] array)
    {
        double[][][][] sort4 = new double [3][][][]; //create a new array with outermost size of 3
        int s1, s2, s3; //initalize the sizes
        double[] temp;
        for (int i = 0; i <3; i++) 
        {
            s1 = array[i].length; //reading the size of the subarray
            for (int n = 0; n <s1; n++)
            {
                s2 = array[i][n].length; //reading the size of the subarray
                for (int m = 1; m<s2; m++)
                {
                    
                    for (int k = m-1; k >= 0; k--) //compare to the previous arrays
                    {
                        if (array[i][n][m].length< array[i][n][k].length) //when the length of current if larger than the previous one
                        {
                            temp = array[i][n][k]; //create a temp to store the value of the previous array
                            array[i][n][k] = array[i][n][m]; //this array will be replaced by the initial value
                            array[i][n][m] = temp; //exchange the value between this two array
                            m--; //the position is moved by 1
                        }
                        else if (array[i][n][m].length == array[i][n][k].length) //when the current array size is equal to previous one
                        {
                            double min1 = array[i][n][m][0]; //initialize the minimum value for the current array
                            double min2 = array[i][n][k][0]; //initialize the minimum value for the previous array
                            
                            for (int v = 1; v<array[i][n][k].length; v++) //read the values in the arrays
                            {
                                if (array[i][n][k][v] < min2) 
                                { 
                                    min2 = array[i][n][k][v]; //find the minimum value for the previous array
                                }
                                if (array[i][n][m][v] < min1)
                                {
                                    min1 = array[i][n][m][v]; //find the minimum value for the current array
                                }
                            }//end of the loop v
                                if (min1 < min2) //if the minimum value in the current array is larger than the minimum value in previous array
                                {
                                    temp = array[i][n][k]; //create a temp to store the value of the previous array
                                    array[i][n][k] = array[i][n][m]; //this array will be replaced by the initial value
                                    array[i][n][m] = temp; //exchange the value between this two array
                                    m--; //the position is moved by 1
                                }
                        }//end of else if
                    }//end of loop k
                }//end of loop m
            }//end of loop n
        }//end of loop i
        return array;
    }//end of sort method
    
    public static double[][][][] sort3DArray(double[][][][] array)
    {
        int s1, s2, s3; //initalize the sizes
        double temp;
        for (int i = 0; i <3; i++) 
        {
            s1 = array[i].length; //reading the size of the subarray
            for (int n = 0; n <s1; n++)
            {
                s2 = array[i][n].length; //reading the size of the subarray
                for (int m = 0; m<s2; m++)
                {
                    s3 = array[i][n][m].length;
                    for (int k = 0; k < s3; k++) //the 4th array
                    {
                        double min = array[i][n][m][k]; //initialize the minimum
                        int target = k; //initialize the target
                        for (int v = k+1; v< s3; v++)
                        {
                            if (array[i][n][m][v] < min) //if the value is smaller
                            {
                                min = array[i][n][m][v]; //minimum value is replaced
                                target = v; //target changed
                            }
                        }
                        temp = array[i][n][m][k]; //set the temp value
                        array[i][n][m][k] = min; //replace the current value with the minimum value
                        array[i][n][m][target] = temp;
                    }//end of loop k
                }//enf of loop m
            }//end of loop n
        }//end of loop i
        return array;
                    
    }//end of sort 3D method
    
    public static void printArray(double[][][][] array)
    {
        int s1, s2, s3; //initalize the sizes
        double[] temp;
        System.out.print("{");
        for (int i = 0; i <3; i++) 
        {
            System.out.print("{");
            s1 = array[i].length; //reading the size of the subarray
            for (int n = 0; n <s1; n++)
            {
                System.out.print("{");
                s2 = array[i][n].length; //reading the size of the subarray
                for (int m = 0; m<s2; m++)
                {
                    System.out.print("{");
                    s3 = array[i][n][m].length; //read the size of the subarray
                    for (int k = 0; k < s3; k++) //the 4th array
                    {
                        if (k == s3-1) //when it is the last in the subarray
                        {
                        System.out.print(array[i][n][m][k]); //print without ","
                        }
                        else
                        {
                        System.out.print(array[i][n][m][k] + ", "); //print with ","
                        }
                    }
                    System.out.print("}");
                }
                System.out.print("}");
            }
            System.out.print("}");
        }
        System.out.println("}"); //start a new line
    }//end of print loop
}