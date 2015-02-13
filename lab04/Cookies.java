///////////////////////////////////////////////////////////////////////////////////////
//Chenxi Liu
//02/13/2015
//CSE 02 --lab 04
//Cookies java program
//this program is to obtain how many cookies, how many people, at least how many cookies
//they want each person to get, then determine if the number of cookies is evenly divisible

//import Scanner
import java.util.Scanner;

//define a class
public class Cookies{
    
    //main method
    public static void main (String[] args){
        int people, ncookies, each; //declare variables
        Scanner myScanner = new Scanner(System.in); //declare scanner and call construction
        
        System.out.print("Enter the number of people: "); //ask user for the number of people
        if (myScanner.hasNextInt()){ //whether the user input an int
            people = myScanner.nextInt(); //if true accept the int
            if (people <= 0){ //validate if it is smaller or equal to 0
            System.out.println("You did not enter an int > 0"); // print if true
            return;
            }
        }
        else{
            System.out.println("You did not enter an int"); // if false print these
            return;
        }
        
        System.out.print("Enter the number of cookies you are planning to buy: ");
        //ask user for the number of cookies plan to buy
         if (myScanner.hasNextInt()){ //whether the user input an int
            ncookies = myScanner.nextInt(); //if true accept the int
            if (ncookies <= 0){ //validate if it is smaller or equal to 0
            System.out.println("You did not enter an int > 0"); // print if true
            return;
            }
        }
        else{
            System.out.println("You did not enter an int"); // if false print these
            return;
        }
        
        System.out.print("How many do you want each person to get? ");
        //ask user for how many each person get
         if (myScanner.hasNextInt()){ //whether the user input an int
            each = myScanner.nextInt(); //if true accept the int
            if (each <= 0){ //validate if it is smaller or equal to 0
            System.out.println("You did not enter an int > 0"); // print if true
            return;
            }
        }
        else{
            System.out.println("You did not enter an int"); // if false print these
            return;
        }
        
        int totalneed = people*each; //calculate the total number of cookies needed
        if (totalneed == ncookies){
            System.out.println("You have enough cookies for each person and the amount will divide evenly.");
            //if the need = bought, there are enough and divided evenly
        }
        else if(totalneed > ncookies){
            int need = totalneed - ncookies; //calculate how much more is needed
            System.out.println("You will not have enough cookies. You need to buy at least " + need + " more.");
            //if need < bought, print these
        }
        else {
            int n = ncookies%people; //
            if (n==0){
                System.out.println("You have enough cookies for each person and the amount will divide evenly.");
            }
            else{
                System.out.println("You have enough, but they will not divide evenly.");
            }
        }
            
        }
    }
