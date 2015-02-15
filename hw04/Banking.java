/////////////////////////////////////////////////////////////////////////////////////
//Chenxi Liu
//02/14/2015
//CSE 02 -- hw 04
//banking java program
//this program is to process the backing transaction that the user is able to deposit, withdraw money and view balance

//import scanner
import java.util.Scanner;

//define a class
public class Banking{
    
    //main method
    public static void main (String[] args){
        Scanner myScanner = new Scanner(System.in); //declare scanner and call construction
        int balance1 = 1000+(int)(Math.random()*4000);//random number from 1000 to 5000
        System.out.println("Enter what whould yout like to do");
        System.out.println("press 1 for deposit money");
        System.out.println("press 2 for withdraw money");
        System.out.println("press 3 for viewing balance"); //ask the user what they want and provide the choices
        int statement = myScanner.nextInt();//accept the user's choice
        switch (statement) {
            case 1:
                System.out.println("How much do you want to deposit? "); // ask the user how much he want to deposit
                double deposit = myScanner.nextDouble(); // accept the deposit
                if (deposit < 0 )
                {
                    System.out.println("Please try again and enter a positive amount"); 
                    //if a negative amount is given, ask them for positive number.
                    return;
                }
                else
                {
                double balance2 = balance1+deposit; //calculate the new balance
                System.out.println("Your balance is " + balance2 +" dollars now.");// print the new balance
                break;
                }
            case 2:
                System.out.println("How much do you want to withdraw? "); // ask the user how much he want to withdraw
                double withdraw = myScanner.nextDouble(); // accept the withdraw amount
                 if (withdraw < 0 )
                {
                    System.out.println("Please try again and enter a positive amount"); 
                    //if a negative amount is given, ask them for positive number.
                    return;
                }
                else
                {
                    if (withdraw <= balance1)//compare the withdraw amount with the balance
                    {
                         double balance3 = balance1 - withdraw; //calculate the new balance after withdraw
                    }
                    else
                    {
                         System.out.println("please try again and enter the amount that less than your balance."); 
                         //ask the user to enter the amount less than the balance
                         return;
                     }
                }
                break;
            case 3:
                System.out.println("Your balance is " + balance1 +" dollars.");//show how much balance is in his account
                break;
        }
    }
}