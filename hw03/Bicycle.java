//////////////////////////////////////////////////////////////////////////////
//Chenxi Liu
//02/07/2015
//CSE 02 -- hw03
//Bicycle java program

//import scanner
import java.util.Scanner;

//define a class
public class Bicycle{
    //main method
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in); // declare scanner and call scanner constructor
        //prompt the user to enter the numbers
        System.out.print("Enter the number of counts: ");//enter the number of counts on a cyclometer
        int nCount = myScanner.nextInt(); // accept the number of counts
        System.out.print("Enter the number of seconds: ");//enter the number of seconds during which counts occurred
        int nSecond = myScanner.nextInt();//accept the number of seconds
        
        double wheelDiameter=27.0, //   diameter of wheel
        PI = 3.14159, // PI value
        feetPerMile=5280, // unit conversion between feet and mile
        inchesPerFoot=12, // unit conversion between inches and foot
        secondsPerMinute=60; // unit conversion between seconds and minute
        
        double distance=nCount*wheelDiameter*PI/inchesPerFoot/feetPerMile; // compute the distance and convert to miles
        int d = (int)distance;
        int di = (int)(distance*10)%10;
        int dis = (int)(distance*100)%10; //in order to print distance in XX.XX
        double time = nSecond/60; //convert time to miunte
        double average = distance/time*60; //compute average speed and convert to mph
        int a = (int)average;
        int av = (int)(average*10)%10;
        int ave = (int)(average*100)%10; //in order to print average in XX.XX
        
        System.out.println("The distance was " + d+"."+di+dis + " miles and took " + time + " minutes."); //print out the distance travelled and time took
        System.out.println("The average mph was " + a+"."+av+ave + "."); //print the average speed in mph
    }
}