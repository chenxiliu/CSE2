//////////////////////////////////////////////////////////////////////////
//03/01/2015
//chenxi liu
//cse 2 hw 06
//MakeSymbol java program

// this program is to print out symbol under the effect of a random chosen number

//define a class
public class MakeSymbols{
    
    //main method
    public static void main(String[] args)
    {
        int n = (int)(Math.random()*100); //take a random integer
        System.out.println("Random number generated: " + n); //print out the interger
        System.out.print("The output pattern: "); //the output
        if (n%2 == 0) // check if it is even
        {
            //if it is even do the following
            int i = 0; //initial a number
            do 
            {
                System.out.print("*"); //print one(*) each time
                i = i +1;    //increase the number
            }while (i < n);  //stop the loop when the number is the same as the integer
            System.out.println(""); //start a new line
        }
        else
        {
            //do the following if it is not even
            int i = 0; //initial a number
            do 
            {
                System.out.print("&"); //print one (&) each time
                i = i +1; //increase the number
            }while (i < n); //stop the loop when the number is the same as the integer
            System.out.println(""); //start a number line
        }
    }
}