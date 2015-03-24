////////////////////////////////////////////////////////////////////////
//chen xi liu
//cse 02 -hw 8
//03/21/2015
//hw 8 java program
//This program is to design a game with main method provided and write missing method base on given method

//import Scanner
import java.util.Scanner;

//define class
public class HW8{
    
    //define main method
    public static void main(String[] args) {
        char option;
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        String input = getInput(scan, "Cc");
        System.out.println("You are in a dead valley.");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You walked and walked and walked and you saw a cave!");
        cave();
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("You entered a cave!");
        System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
        input = getInput(scan, "Cc");
        System.out.println("Unfortunately, you ran into a GIANT!");
        giant();
        System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
        input = getInput(scan, "AaEe", 10);
        System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
        System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
        box();
        input = getInput(scan);
        System.out.println("Hero! Have a good day!");
    }
    public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }

    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }
    
    public static void box(){
        System.out.println("                     *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }
    
    public static String getInput(Scanner scan, String n)
    {
        n = scan.next();
        if (n .equals ("C")||n . equals("c")){
           System.out.println("continue");    //if Cc is entered , the game will continue
        }
        else
        {
            System.out.println("Yea right LOSER!"); //if other thing is entered, game over
            System.exit(0);       //the game end
        }
        return n;
    }//end of method
    
    public static String getInput(Scanner scan, String n, int m)
    {
        int b = 0;             //b is the number of cucial hit
        for (int y = 0; y <100; y++)
        {
            while (b <10){                      //it need 10 crucial hits to kill the giant
            n = scan.next();
                if (n .equals ("A")|| n .equals ("a")){       // if the user enter Aa, it will attack
                      m = (int)(Math.random()*2);     //m is a random integer 0 or 1
                      if (m == 1){
                           System.out.println("Critical hit!");   //if m = 1, crucial hit
                           b++;                                 //crucial hit number increased by 1
                           if (b<10){                           // not to print the statement when b = 10
                               System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD.");   //ask the user to enter a,e or other key again
                           }
                      }
                     else{                                    //if m = 0, miss
                           System.out.println("miss!");
                           System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD.");     //ask the user to enter a,e or other key again
                     } 
                     }//end of if user enter a
                 else if (n .equals ("E")|| n .equals ("e"))           //if the user enter e, it means escape
                 {
                      m = (int)(Math.random()*11);                //m is the random integer 1-10
                      if (m == 10)                                // if m is 10, user escaped
                      {
                           System.out.println("The user escaped sucessfully.");   //print the user has escaped
                           System.exit(0);    //the game ends
                      }
                      else                                        //if m is other number, choose again
                      {
                          System.out.println("Escape failure!");   //print fail to escape
                          System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD.");    //ask the user to enter a,e or other key again
                      }
                 }//end of user enter e
                 else
                 {
                      System.out.println("Excuted by the GIANT! Game Over!");      //if other key entered, game over
                      System.exit(0);    //the game ends
                 }
        }
        break;
        }
        return n;
        
    }//end of method
    
    public static String getInput(Scanner scan)
    {
        int n = scan.nextInt(); //accept the integer user entered
        String m ="you get a box";
        switch (n)
        {
            case 1 : System.out.println("You get box 1.");  //1 get the box 1
            break;
            case 2 : System.out.println("You get box 2.");  //2 get the box 2
            break;
            case 3 : System.out.println("You get box 3.");  //3 get the box 3
            break;
            default: System.out.println("A Wrong Number! You get nothing!");  //else get nothing
            System.exit(0); 
        }
        return m;
    }//end of method


}
