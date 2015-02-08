//////////////////////////////////////////////////////////////////////////////
//Chenxi Liu
//02/07/2015
//CSE 02 -- hw03
//Root java program

//import Scanner
import java.util.Scanner;

//define a class
public class Root{
    
    //main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in); // declare the scanner and call the contructor
        System.out.print("enter a double: "); //ask the user to enter a number
        double N = myScanner.nextDouble();//accept the number
        double FirstGuess = N/3; // first guess value
        double SecondGuess = (2*FirstGuess*FirstGuess*FirstGuess+N)/(3*FirstGuess*FirstGuess); //second guess value
        double ThirdGuess = (2*SecondGuess*SecondGuess*SecondGuess+N)/(3*SecondGuess*SecondGuess); //third guess value
        double Fourth = (2*ThirdGuess*ThirdGuess*ThirdGuess+N)/(3*ThirdGuess*ThirdGuess); // fourth guess value
        double Fifth = (2*Fourth*Fourth*Fourth+N)/(3*Fourth*Fourth); // fifth guess value
        double Sixth = (2*Fifth*Fifth*Fifth+N)/(3*Fifth*Fifth);
        double number = Sixth*Sixth*Sixth; //number found by guess value
        System.out.println(Sixth+"*"+Sixth+"*"+Sixth+"="+number);
    
    }
}