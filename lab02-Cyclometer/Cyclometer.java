/////////////////////////////////////////////////////////////////////////////////////////
//Chenxi Liu
//01/30/2015
//CSE 02 -- lab 02
//class Cyclometer java program
//this program is to do 
// a) print the number of minutes for each trip
// b) print the number of counts for each trip
// c) print the distance of each trip in miles
// d) print the distance for the two trips combined

//define a class
public class Cyclometer{

// add main method    
    public static void main (String[] args){
        
        // our input data.
        int secsTrip1=480; // the number of seconds for first trip
        int secsTrip2=3220; // the number of seconds for second trip

        int countsTrip1=1561; // the number of counts for first trip
        int countsTrip2=9037; // the number of counts for second trip
        
        // our intermediate variables and output data.
        double wheelDiameter=27.0, //   diameter of wheel
        PI = 3.14159, // PI value
        feetPerMile=5280, // unit conversion between feet and mile
        inchesPerFoot=12, // unit conversion between inches and foot
        secondsPerMinute=60; // unit conversion between seconds and minute
        double distanceTrip1, distanceTrip2,TotalDistance; // define the distance variables
        
        // calculate and print out the number of minute and the number of counts for each trip
        System.out.println("Trip 1 took " + (secsTrip1/secondsPerMinute)+" minutes and had " +countsTrip1+" counts.");
        System.out.println("Trip 2 took "+ (secsTrip2/secondsPerMinute)+" minutes and had "+countsTrip2+" counts.");
        
        // compute values for distances
        distanceTrip1=countsTrip1*wheelDiameter*PI; // compute the distance for first trip in inch
        distanceTrip1/=inchesPerFoot*feetPerMile; // convert inch to miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/inchesPerFoot/feetPerMile; // compute the distance for second trip and convert to miles
        TotalDistance = distanceTrip1+distanceTrip2; // compute the total distance
        
        // print out the distance of each trip and the total distance
        System.out.println("Trip 1 was "+distanceTrip1+" miles"); 
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+TotalDistance+" miles");


    } //end of main method
} // end of class


