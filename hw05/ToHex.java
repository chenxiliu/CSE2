//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//02/19/2015
//chenxi liu
//CSE-2 -- hw 05
//ToHex java program

//import Scanner
import java.util.Scanner;

//define a class
public class ToHex{
    
    //main method
    public static void main(String[] args){
      Scanner myScanner = new Scanner(System.in);  //declare sanner and call construction
      int number1, number2, number3; //initialize the numbers
      System.out.println("please enter three numbers representing RGB values:"); //ask the user to enter the decimal number
      //analyze number1
      if (myScanner.hasNextInt()) //check the first number if it is an integar
      {
          number1 = myScanner.nextInt(); //accept the first number
          if (myScanner.hasNextInt()) //check the second number if it is an integar
          {
              number2 = myScanner.nextInt();  //accept the second number
             if (myScanner.hasNextInt()) //check the third number if it is an integar
             {
                number3 = myScanner.nextInt(); //accept the third number
                if (number1 < 0 ||number1 > 255 || number2 < 0 ||number2 > 255 || number3 < 0 ||number3 > 255) //check if any number is out of range
                {
                    System.out.println("Sorry, you must enter values between 0-255"); //when any number is out of range, print
                    return;
                }
                else 
                {

                System.out.print("The decimal numbers R: "+ number1 + " G: "+ number2 +" B: "+ number3 +", is represented in hexadecimal as: ");
                //contiune to convert the three numbers into hexadecimal if everything is satisfied
                int r1 = number1/16; // take the root of number 1 over 16
                int re1 = number1%16; //take the remainer of number1 over 16
                if (r1 >= 10) //if the root is larger than 10
                {
                 String s;
                 switch (r1) // 10 - A, 11-B, 12 - C, 13 - D, 14 - E, 15 - F, print the letter out
                 {
                     case 10:
                         s = "A";System.out.print(s);
                         break;
                     case 11:
                         s = "B";System.out.print(s);
                         break;
                     case 12:
                         s = "C";System.out.print(s);
                         break;
                     case 13:
                         s = "D";System.out.print(s);
                         break;
                     case 14:
                         s = "E";System.out.print(s);
                         break;
                     case 15:
                         s = "F";System.out.print(s);
                         break;
                
                 } //end of switch statement
                 
             }//end of if r1>=10
             else 
             {
                 System.out.print(r1); //if the number is smaller than 10, remain it is 
             }//end of r1
             
             if (re1 >= 10) //check if the remainer is larger than 10
             {
                 String s;
                 switch (re1)  // 10 - A, 11-B, 12 - C, 13 - D, 14 - E, 15 - F, print the letter out
                 {
                     case 10:
                         s = "A";System.out.print(s);
                         break;
                     case 11:
                         s = "B";System.out.print(s);
                         break;
                     case 12:
                         s = "C";System.out.print(s);
                         break;
                     case 13:
                         s = "D";System.out.print(s);
                         break;
                     case 14:
                         s = "E";System.out.print(s);
                         break;
                     case 15:
                         s = "F";System.out.print(s);
                         break;
                
                 } //end of switch statement
               
             }//end of if r1>=10
             else 
             {
                 System.out.print(re1);
             }//end of number 1
             
             int r2 = number2/16; 
             int re2 = number2%16;
             if (r2 >= 10) //if the root is larger than 10
             {
                 String s;
                 switch (r2)  // 10 - A, 11-B, 12 - C, 13 - D, 14 - E, 15 - F, print the letter out
                 {
                     case 10:
                         s = "A";System.out.print(s);
                         break;
                     case 11:
                         s = "B";System.out.print(s);
                         break;
                     case 12:
                         s = "C";System.out.print(s);
                         break;
                     case 13:
                         s = "D";System.out.print(s);
                         break;
                     case 14:
                         s = "E";System.out.print(s);
                         break;
                     case 15:
                         s = "F";System.out.print(s);
                         break;
                
                 } //end of switch statement
                 
             }//end of if r2>=10
             else 
             {
                 System.out.print(r2);
             }//end of r2
             
             if (re2 >= 10) //if the remainer is larger than 10
             {
                 String s;
                 switch (re2)  // 10 - A, 11-B, 12 - C, 13 - D, 14 - E, 15 - F, print the letter out
                 {
                     case 10:
                         s = "A";System.out.print(s);
                         break;
                     case 11:
                         s = "B";System.out.print(s);
                         break;
                     case 12:
                         s = "C";System.out.print(s);
                         break;
                     case 13:
                         s = "D";System.out.print(s);
                         break;
                     case 14:
                         s = "E";System.out.print(s);
                         break;
                     case 15:
                         s = "F";System.out.print(s);
                         break;
                
                 } //end of switch statement
               
             }//end of if re2>=10
             else 
             {
                 System.out.print(re2);
             }//end of number 2
             
             int r3 = number3/16; 
             int re3 = number3%16;
             if (r3 >= 10) //if the root is larger than 10
             {
                 String s;
                 switch (r3)  // 10 - A, 11-B, 12 - C, 13 - D, 14 - E, 15 - F, print the letter out
                 {
                     case 10:
                         s = "A";System.out.print(s);
                         break;
                     case 11:
                         s = "B";System.out.print(s);
                         break;
                     case 12:
                         s = "C";System.out.print(s);
                         break;
                     case 13:
                         s = "D";System.out.print(s);
                         break;
                     case 14:
                         s = "E";System.out.print(s);
                         break;
                     case 15:
                         s = "F";System.out.print(s);
                         break;
                
                 } //end of switch statement
                 
             }//end of if r3>=10
             else 
             {
                 System.out.print(r3);
             }//end of r3
             
             if (re3 >= 10) //if the remainer is larger than 10
             {
                 String s;
                 switch (re3)  // 10 - A, 11-B, 12 - C, 13 - D, 14 - E, 15 - F, print the letter out
                 {
                     case 10:
                         s = "A";System.out.println(s);
                         break;
                     case 11:
                         s = "B";System.out.println(s);
                         break;
                     case 12:
                         s = "C";System.out.println(s);
                         break;
                     case 13:
                         s = "D";System.out.println(s);
                         break;
                     case 14:
                         s = "E";System.out.println(s);
                         break;
                     case 15:
                         s = "F";System.out.println(s);
                         break;
                
                 } //end of switch statement
               
             }//end of if re3>=10
             else 
             {
                 System.out.println(re3);
             }//end of number 3



             }
             }
             else 
             {
                System.out.println("Sorry, your input must consist of integers");//when nonintegers are entered, print
                return;
             }
             
             
          }
          else 
          {
             System.out.println("Sorry, your input must consist of integers");//when nonintegers are entered, print
             return;
          }
         
      }
      else 
      {
          System.out.println("Sorry, your input must consist of integers");//when nonintegers are entered, print
          return;
      }
    }
}

         
         
         