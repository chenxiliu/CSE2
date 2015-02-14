///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Chenxi Liu
//02/14/2015
//CSE 02 -- hw 04
//whichnumber java program
//this program is to guess what number the user is think about by asking questions.

//import Scanner
import java.util.Scanner;

//define a class
public class WhichNumber{
    
    //main method
    public static void main (String[] args){
        String a = "Y";//positve answer
        String b = "N";//negative answer
        Scanner myScanner = new Scanner (System.in); //declare scanner and call contruction 
        
        System.out.println("Think of a number between 1 and 10 inclusive"); 
        //ask the user to think of a number that between 1 and 10
        System.out.print("Is you number even? "); //ask the user if the number is even
        String n1 = myScanner.next(); //accept user's answer
        if (n1.equals(a))// check the answer of even number
        {
            //if the number is even, do the following
            System.out.print("Is it divisible by 3? ");//ask the user if the number is divisible by 3
            String n2 = myScanner.next(); //accept the answer
            if (n2.equals(a))//check the positive answer of divisible by 3 
            {
                System.out.print("Is your number 6? "); 
                //the even number divisible by 3 is 6, ask the use if it is right
                String n3 = myScanner.next(); //accept the answer
                if (n3.equals(a)) //check the poritive answer of 6
                {
                    System.out.println("yey!"); //find the answer
                    return;
                }
                else if (n3.equals(b)) //check the negative answer of 6
                {
                    System.out.println("Think about a number between 1 and 10 inclusive and try again"); 
                    //ask the user think of a number between 1 and 10 and try again.
                    return;
                }
                else
                {
                    System.out.println("Sorry, that is not a valid input"); // if letter other than Y and N is enter
                    return;
                }
            }
            else if (n2.equals(b))//check the negative number of divisible by 3
            {
                //if the even number is not divisible by 3, do the following
                System.out.print("Is the number divisible by 4? ");//ask the user if the number is divisible by 4
                String n4 = myScanner.next(); //accept the answer
                if (n4.equals(a))// check the positive answer of divisible by 4
                {
                    System.out.print("Is the number divided by 4 great than 1? ");//ask the user if the number divided by 4 greater than 1
                    String n5 = myScanner.next(); // accept the answer
                    if (n5.equals(a)) //check the positive answer
                       {
                           System.out.print("Is your number 8? "); // the only number is 8
                           String n6 = myScanner.next(); // accept the anwer
                           if (n6.equals(a)) //check the positive answer of 8
                           {
                                 System.out.println("yey!"); //find the answer
                                 return;
                            }
                           else if (n6.equals(b)) //check the negative answer of 8
                            {
                                 System.out.println("Think about a number between 1 and 10 inclusive and try again"); 
                                 //ask the user think of a number between 1 and 10 and try again.
                                 return;
                            }
                           else
                            {
                                 System.out.println("Sorry, that is not a valid input"); // if letter other than Y and N is enter
                                 return;
                            }
                       }
                    else if (n5.equals(b)) //Check the negative answer
                       {
                           System.out.print("Is your number 4? "); // the only number is 4
                           String n7 = myScanner.next(); // accept the anwer
                           if (n7.equals(a)) //check the positive answer of 4
                           {
                                 System.out.println("yey!"); //find the answer
                                 return;
                            }
                           else if (n7.equals(b)) //check the negative answer of 4
                            {
                                 System.out.println("Think about a number between 1 and 10 inclusive and try again"); 
                                 //ask the user think of a number between 1 and 10 and try again.
                                 return;
                            }
                           else
                            {
                                 System.out.println("Sorry, that is not a valid input"); // if letter other than Y and N is enter
                                 return;
                            }
                 
                       }
                       else
                       {
                            System.out.println("Sorry, that is not a valid input"); // if letter other than Y and N is enter
                            return;
                        }//end of the question if the number divided by 4 greater than 1
                }
                else if (n4.equals(b))// check the negative answer of divisible by 4
                {
                    System.out.print("Is the number divisible by 5? ");//ask the user if the number divisible by 5
                    String n8 = myScanner.next(); // accept the answer
                    if (n8.equals(a)) //check the positive answer of divisible by 5
                       {
                           System.out.print("Is your number 10? "); // the only number is 10
                           String n9 = myScanner.next(); // accept the anwer
                           if (n9.equals(a)) //check the positive answer of 10
                           {
                                 System.out.println("yey!"); //find the answer
                                 return;
                            }
                           else if (n9.equals(b)) //check the negative answer of 10
                            {
                                 System.out.println("Think about a number between 1 and 10 inclusive and try again"); 
                                 //ask the user think of a number between 1 and 10 and try again.
                                 return;
                            }
                           else
                            {
                                 System.out.println("Sorry, that is not a valid input"); // if letter other than Y and N is enter
                                 return;
                            }
                       }//end of positive answer of divisible by 5
                    else if (n8.equals(b)) //Check the negative answer of divisibly by 5
                       {
                           System.out.print("Is your number 4? "); // the only number is 2
                           String n10 = myScanner.next(); // accept the anwer
                           if (n10.equals(a)) //check the positive answer of 2
                           {
                                 System.out.println("yey!"); //find the answer
                                 return;
                            }
                           else if (n10.equals(b)) //check the negative answer of 2
                            {
                                 System.out.println("Think about a number between 1 and 10 inclusive and try again"); 
                                 //ask the user think of a number between 1 and 10 and try again.
                                 return;
                            }
                           else
                            {
                                 System.out.println("Sorry, that is not a valid input"); // if letter other than Y and N is enter
                                 return;
                            }
                 
                       }//end of the negative answer of divisible by 5
                       else
                       {
                            System.out.println("Sorry, that is not a valid input"); // if letter other than Y and N is enter
                            return;
                        }//end of the question if the number divisible by 5
                }//end of negative answer of divisible by 4
                else 
                {
                    System.out.println("Sorry, that is not a valid input"); // if letter other than Y and N is enter
                    return;
                }//end of the question if the number divisible by 4
            }
            else 
            {
                System.out.println("Sorry, that is not a valid input"); // if letter other than Y and N is enter
                return;
            }//end of the question if the number is divisible by 3
        }//end of the positive answer of even number
        else if (n1.equals(b))//check the negative answer of even number
        {
            System.out.print("Is it divisible by 3? "); // ask the user if it is divisible by 3
            String m1 = myScanner.next(); // accept the anser
            if (m1.equals(a))//check the postive answer of divisible by 3
            {
                System.out.print("When divided by 3 is the result greater than 1? ");//ask the user if when divided by 3, the result greater than 1
                String m2 = myScanner.next(); // accpet the answer
                if (m2.equals(a))//accpet the positive answer
                {
                    System.out.print("Is your number 9? "); // the only number is 9
                    String m3 = myScanner.next(); // accept the anwer
                    if (m3.equals(a)) //check the positive answer of 9
                        {
                            System.out.println("yey!"); //find the answer
                            return;
                        }
                    else if (m3.equals(b)) //check the negative answer of 9
                        {
                            System.out.println("Think about a number between 1 and 10 inclusive and try again"); 
                            //ask the user think of a number between 1 and 10 and try again.
                            return;
                        }
                    else
                        {
                            System.out.println("Sorry, that is not a valid input"); // if letter other than Y and N is enter
                            return;
                        }
                }
                else if (m2.equals(b)) //Check the negative answer
                {
                    System.out.print("Is your number 3? "); // the only number is 3
                    String m8 = myScanner.next(); // accept the anwer
                    if (m8.equals(a)) //check the positive answer of 3
                    {
                        System.out.println("yey!"); //find the answer
                        return;
                    }
                    else if (m8.equals(b)) //check the negative answer of 3
                    {
                        System.out.println("Think about a number between 1 and 10 inclusive and try again"); 
                        //ask the user think of a number between 1 and 10 and try again.
                        return;
                    }
                    else
                    {
                        System.out.println("Sorry, that is not a valid input"); // if letter other than Y and N is enter
                        return;
                    }
                }
                else
                {
                    System.out.println("Sorry, that is not a valid input"); // if letter other than Y and N is enter
                    return;
                }//end of question devided by 3, result greater than 1
                
            }//end of positive answer of divisible by 3
            else if (m1.equals(b))//check the negative answer of divisible by 3
            {
                System.out.print("Is it greater than 6? ");//ask the user if the number is greater than 6
                String m4 = myScanner.next(); //accept the answer
                if (m4.equals(a))//check the positive answer of greater than 6 
                {
                    System.out.print("Is your number 7? "); // ask the user if the number is 7
                    String m5 = myScanner.next(); //accept the answer
                    if (m5.equals(a)) //check the poritive answer of 7
                    {
                        System.out.println("yey!"); //find the answer
                        return;
                    }
                    else if (m5.equals(b)) //check the negative answer of 7
                    {
                    System.out.println("Think about a number between 1 and 10 inclusive and try again"); 
                    //ask the user think of a number between 1 and 10 and try again.
                    return;
                    }
                    else
                    {
                    System.out.println("Sorry, that is not a valid input"); // if letter other than Y and N is enter
                    return;
                    }//end of 7
                }//end of positive answer of greater than 6
                else if (m4.equals(b))//check the negative answer of greater than 6
                {
                    System.out.print("Is it less than 3? "); // ask the user if the number less than 3
                    String m6 = myScanner.next(); //accept the answer
                    if (m6.equals(a)) //check the poritive answer of less than 3
                    {
                        System.out.print("Is your number 1? "); //ask the user if the number is 1
                        String m7 = myScanner.next(); //accept the answer
                        if (m7.equals(a)) //check the poritive answer of 1
                        {
                            System.out.println("yey!"); //find the answer
                            return;
                        }
                        else if (m7.equals(b)) //check the negative answer of 1
                        {
                            System.out.println("Think about a number between 1 and 10 inclusive and try again"); 
                            //ask the user think of a number between 1 and 10 and try again.
                            return;
                        }
                        else
                        {
                            System.out.println("Sorry, that is not a valid input"); // if letter other than Y and N is enter
                            return;
                        }//end of 1 
                    }//end of positive answer of less than 3 
                    else if (m6.equals(b)) //check the negative answer of less than three
                    {
                        System.out.print("Is your number 5? "); //ask the user if the number is 5
                        String m7 = myScanner.next(); //accept the answer
                        if (m7.equals(a)) //check the poritive answer of 5
                        {
                            System.out.println("yey!"); //find the answer
                            return;
                        }
                        else if (m7.equals(b)) //check the negative answer of 5
                        {
                            System.out.println("Think about a number between 1 and 10 inclusive and try again"); 
                            //ask the user think of a number between 1 and 10 and try again.
                            return;
                        }
                        else
                        {
                            System.out.println("Sorry, that is not a valid input"); // if letter other than Y and N is enter
                            return;
                        }//end of 5
                    }//end of negative answer of less than 3
                    else
                    {
                        System.out.println("Sorry, that is not a valid input"); // if letter other than Y and N is enter
                        return;
                    }//end of the question if the number is less than 3
                }//end of negative answer of greater than 6
                else
                {
                    System.out.println("Sorry, that is not a valid input"); // if letter other than Y and N is enter
                    return;
                }//end of question of greater than 6
            }//end of the negative answer of divisible by 3
            else
            {
                System.out.println("Sorry, that is not a valid input"); // if letter other than Y and N is enter
                return;
            }//end of the question of divisible by 3
        }//end of the negative answer of even number
        else
        {
            System.out.println("Sorry, that is not a valid input"); // if letter other than Y and N is enter
            return;
        }//end of the question of even number
        
    }
}