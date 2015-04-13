//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//chen xi liu
//cse 2 hw 11
//cse2 linear java program

//the goal of this program is to prompt user to enter an 15 increasing numbers in an array, and using binary search to find the integer user entered

//import scanner
import java.util.Scanner;

//define class
public class CSE2Linear{
    
    //define method
    public static void main(String [] arg){
        int array[] = new int[15]; //define the array with 15 integers
        int a = 0; //initialize a comparing number
        //prompt user to enter 15 integers for an array
        System.out.println("Enter 15 ints for final grades in CSE2: ");
        Scanner scan = new Scanner(System.in); //define and construct scanner
        for (int i = 0; i < 15; i++) //construct a for loop to read user's input
        {
            if (scan.hasNextInt()) //check if the input enter is integer
            {
                array[i] = scan.nextInt(); //accept the input as array[i]
                if (array[i]>=0 && array[i]<=100) //check if enter is inside the range
                {
                    if (array[i] > a) //check if this number is larger thank the previous
                    {
                        a = array[i]; //replace comparing number with current number
                    }//end of 3rd loop
                    else 
                    {
                        System.out.println("ERROR, input not larger than previous input"); //print error
                        return;//stop the program
                    }//end of 3rd loop
                }//end of 2nd loop
                else
                {
                    System.out.println("ERROR, input not in the range"); //print error
                    return; //stop the program
                }//end of else loop
            }//end 1st loop
            else 
            {
                System.out.println("ERROR, non integer input entered"); //print error
                return; //stop the program
            }//end of else loop 
        }//end of for loop
        
        System.out.print("The grades, sorted, are: ");
        for (int i = 0; i < 15; i++) //read the input
        {
            if (i==14)//when it is the last integer
            {
                System.out.println(array[i]); //print the last integer
            }//end of if loop
            else
            {
                System.out.print(array[i] + " "); //print the integers
            }//end of else loop
        }//end of for loop
        
        System.out.print("Enter a grade to search for: "); //prompt the user to enter a grade to search for
        int n =  scan.nextInt(); //accept the input user entered
        int contain = 15; //initialize the contain as 15 integers
            int max = 14; //initialze the maximum of the array
            int min = 0; //initialize the minimum of the array
            int m = contain/2; //the medium of the contain
            int iter = 1; //initlize iteration as 1
            for (int i = 0; i <15 ; i++) //read through the array
            {
                  if (array[m] == n) //if the input is equals to the number
                  {
                      System.out.println(n + " was found in the list with "+ iter+ " iterations"); //print it is found
                      break; //end the for loop
                  } //end of if
                  else if (array[m] < n) //if the number is smaller than the input we will study the upper half of the contain
                  {
                      max = max; //the maxmum is still the maximum
                      min = m +1; //the minimum will be the medium plus 1
                      contain = (max-min)+1; // the number it contains will be maximum - minimum plus 1
                      m = contain/2 + min; //the new medium will be contain/ 2 plus old medium
                      if (contain <= 0) //if the contain is less than or equals to 0
                      {
                          System.out.println(n + " was not found in the list "+ iter+ " iterations"); //there is no other numbers to look so not found
                          break; //end of the for loop
                      }//end of nested if loop
                  }//end of else if
                  else //if the number is larger than the input we will study the lower half of the contain
                  {
                      max = m - 1; //the maximum will be medium minus 1
                      min = min; //the minimum will be the old minimum
                      contain = max-min +1; // the number it contains will be maximum - minimum plus 1
                      m = contain/2 + min; //the new medium will be contain/ 2 plus min
                      if (contain <= 0) //if the contain is less than or equals to 0
                      {
                          System.out.println(n + " was not found in the list " + iter+ " iterations"); //there is no other numbers to look so not found
                          break; //end of for loop
                      }//end of nested if loop
                  }//end of else loop
                          iter ++; //increase the array everytime it runs
                          if (m == 1 && array[1] > n) //if it is second position and if the number is larger than the input the number is at lower contain
                          {
                              
                                  if(array[0] == n) //and if the input is equal to the last number left
                                  {
                                      iter++; //increase iteration by 1
                                  System.out.println(n + " was found in the list " + iter + " iterations"); //print found
                                  break;
                                  }//end of nested if
                                  else
                                  {
                                    iter++; //increase iteration by 1
                                    System.out.println(n + " was not found in the list " + iter + " iterations"); //or there no this input
                                    break; //break
                                  } //end of nested else if
                          }//end of if
                          
                          if (m == 13 && array[13] < n) //if it is late  second position and if the number is smaller than the input the number is at higher contain
                          {
                              if (array[14] == n) //and if the input equals to the last number left
                              {
                                  iter++; //increase iteration by 1
                              System.out.println(n + " was found in the list " + iter + " iterations"); //print found
                              break;
                              }//end of if
                              else
                              {
                                  iter++; //increase iteration by 1
                                  System.out.println(n + " was not found in the list " + iter+ " iterations"); //or there no this input
                                  break;
                              }//end of else
                          }//end of if loop
                  
            } //end of the for loop
            
            System.out.print("Scrambled:"); //Scrambled
            
            for (int i=0; i<array.length; i++) //reading the array
            {
		    int randomPosition = (int)(Math.random()*15); //take a random number
		    int temp = array[i]; //save the current number to temp
		    array[i] = array[randomPosition]; //replace the current number with the number in random position
		    array[randomPosition] = temp; //replace that random position number with current number
		    }
            
            
            for (int i = 0; i < 15; i++) //read the input
            {
            if (i==14)//when it is the last integer
            {
                System.out.println(array[i]); //print the last integer
            }//end of if loop
            else
            {
                System.out.print(array[i] + " "); //print the integers
            }//end of else loop
            }//end of for loop
           System.out.print("Enter a grade to search for: "); //ask the user to enter input again
           n = scan.nextInt(); // accept the integer
           int w = 0; ////initialize the counting number that count how many number is same as the input
           for (int i = 0; i <15; i++) //reading the array
           {
               if (array[i] == n) //if the number is the same as the input
               {
                   System.out.println(n + " was found in the list with " + (i+1) + " iterations"); //print found
                   w++; //increase the counting number
               }
           }
           if (w == 0) //if the counting number is 0, no number found the same
           {
               System.out.println(n + " was found in the list."); //print not found
           }
    }//end of method
}