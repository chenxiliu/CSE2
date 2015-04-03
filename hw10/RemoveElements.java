//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//chen xi liu
//cse 2 hw 10
//04/03/2015
//remove elements java program

//The goal of this program is to take the array user entered and delete the target user entered and the integer in the position user entered.


import java.util.Scanner;
public class RemoveElements{
  public static void main(String [] arg){
	Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
	String answer="";
	do{
  	System.out.print("Random input 10 ints [0-9]");
  	num = randomInput();
  	String out = "The original array is:";
  	out += listArray(num);
  	System.out.println(out);
 
  	System.out.print("Enter the index ");
  	index = scan.nextInt();
  	newArray1 = delete(num,index);
  	String out1="The output array is ";
  	out1+=listArray(newArray1); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out1);
 
      System.out.print("Enter the target value ");
  	target = scan.nextInt();
  	newArray2 = remove(num,target);
  	String out2="The output array is ";
  	out2+=listArray(newArray2); //return a string of the form "{2, 3, -9}"  
  	System.out.println(out2);
  	 
  	System.out.print("Go again? Enter 'y' or 'Y', anything else to quit-");
  	answer=scan.next();
	}while(answer.equals("Y") || answer.equals("y"));
  }
 
  public static String listArray(int num[]){
	String out="{";
	for(int j=0;j<num.length;j++){
  	if(j>0){
    	out+=", ";
  	}
  	out+=num[j];
	}
	out+="} ";
	return out;
  }
  
  public static int[] randomInput(){         //create the method for the randomInput array
      Scanner scan = new Scanner(System.in); //accept the integers user entered
      int[] num = new int[10];   //initialized the array with 10 integers
      for (int i = 0; i < 10; i++){     //create for loop for the array
          num[i] = scan.nextInt();      //locate the number in the array
      }
      return num;                       //return the array
  }//end og the randomInput method
  
  public static int[] delete(int num[], int index){      //creat method to get the new array with the original array and the index user entered
      int[] num1 = new int[9];                           //initialize the new array with the size of 9 that one will be deleted
      if (index>=0 && index<=9){                         //check the index user enter, if it is in the range of [0,9]                                     //
          for (int i = 0; i < 10; i++)                   //create the for loop to read each integer in the array
          {                       
               if (i < index){                           //in the position before the index
                   num1[i] = num[i];                     //the new array will be the same as the original array
               }
               else if (i > index){                      //in the position after the index
                   num1[i-1] = num[i];                   //the new array will take the integer at position i, as its integer at position i -1
               }                                         //since the integer at position of the index is ignored
          
          }
      }
      else
      {
          System.out.println("The index is not valid."); //if the user enter a value out of range
          num1 = num;                                    //the new array will be the same as teh old one
      } 
      return num1;                                       //return the new array
  }//end of the delete method
  
  public static int[] remove(int num[], int target){     //create method to get new array with the original array and the target use entered
      int m = 0;                                         //m will be counting how many number of target will be found in the array
      for (int i = 0; i < 10; i++){                      //reading the array with the for loop
          if (num[i] == target)                          //each time it found the integer is the same as the target
          {
              m++;                                       //m will be increased by 1
          }
      }
      if (m < 1)                                         //if m is smaller than 1 that no integer is the same as the target
      {
          System.out.println("Element " + target + " was not found.");  //computer print not found
      }
      else                                                              //if there is integer the same as the target 
      {  
          System.out.println("Element " + target + " has been found."); //conputer print found 
      }
      int[] num2 = new int[10-m];                                       //initialize the new array as the size of 10 minus the number we found the target
      int n = 0;                                                        //n will be counting the size of the new array
      for (int i = 0; i < 10; i++){                                     //using for loop to read the original array
          if (num[i] == target)                                         //if the integer in the original array is the same as the target
          {
              i++;                                                      //i increase by 1 that we skip over that integer
          }
          num2[n] = num[i];                                             //the new array will be given the integers from the oringinal array
          n++;                                                          //n increase by 1 to move to next position
      }
      return num2;                                                      //return the new array
  }//end of the remove method
}
