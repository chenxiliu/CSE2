//////////////////////////////////////////////////////////////////////////////
//Chenxi Liu
//02/07/2015
//CSE 02 -- hw03
//Root java program
// This program is going to read the first four digits to the right of decimal point of a given number
//import Scanner
import java.util.Scanner;

//define a class
public class FourDigits{
    
    //main method
    public static void main(String[] args){
        
        Scanner myScanner = new Scanner(System.in); //declare scanner and call construction
        System.out.print("Enter the double: ");//promote the user to enter the number
        double n = myScanner.nextDouble();//accept the number entered
        int digit4 = (int)(n*10000)%10;//take the first digit after the decimal point
        int digit3 = (int)(n*1000)%10;//take the second digit after the decimal point
        int digit2 = (int)(n*100)%10;//take the third digit
        int digit1 = (int)(n*10)%10;//take the fourth digit
        System.out.println("The four digits are " + digit1 + digit2 + digit3 + digit4); //print out the four digits together
    }
}