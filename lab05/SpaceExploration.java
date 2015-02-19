///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Chenxi Liu
//02/18/2015
//CSE 02 -- lab04
//spaceexploration java program
///this program is to output a timeline of significant space exploration advances from 2000 - 2010

//define a class
public class SpaceExploration{
    
    //main method
    public static void main (String[] args){
        
        int year = (int)(Math.random()*11)+2000; //randomly choose a year from 2000 to 2010
        System.out.println("Here is a timeline of space exploration events from 2000 to " + year);//print the what is coming out
        switch (year){
            case 2010: 
                System.out.println("2010: SpaceX sucessfully sends spacecraft to orbit and back"); //what happened in 2010
            case 2009:
            System.out.println("2009: N/A");
            case 2008:
                System.out.println("2008: Kepler launched to study deep space");//what happened in 2008
            case 2007:
            System.out.println("2007: N/A");
            case 2006:
                System.out.println("2006: Spacecraft returns with collections from a comet");//what happened in 2006
            case 2005:
                System.out.println("2005: Spacecraft collies with comet");//what happened in 2005
            case 2004:
            System.out.println("2004: N/A");
            case 2003:
                System.out.println("2003: Largest infrared telescope released");//what happened in 2003
            case 2002:
            System.out.println("2002: N/A");
            case 2001:
                System.out.println("2002: First spacecraft lands on asteroid");//what happened in 2001
            case 2000:
                System.out.println("2000: First spacecraft orbits an asteroid");//what happened in 2000
            break;
        }
    }
}