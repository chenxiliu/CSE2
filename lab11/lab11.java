//////////////////////////////////////////////////////////////////////////////
//chen xi liu
//cse 2 lab11
//04/10/2015
//linear and binary search on large array of random numbers.

import java.util.Scanner;

public class lab11{
    
    public static void main(String [] args)
    {
        Scanner scan = new Scanner(System.in);
        int array1[] = new int[50];
        int array2[] = new int[50];
        int min1=0100;
        int max1=0;
        for (int i = 0; i < 50; i++)
        {
            array1[i] =(int)(Math.random()*100);
            if (min1 > array1[i])
            {
                min1 = array1[i];
            }
            if (max1 < array1[i])
            {
                max1 = array1[i];
            }
            
        }
        System.out.println("The maximum of array1 is: " + max1);
        System.out.println("The minimum of array1 is: " + min1);
        int y = 0;
        array2[0] =(int)(Math.random()*100);
        for (int i = 1; i < 50; i++)
        {
            y = i-1;
            array2[i] =(int)(Math.random()*10*i+array2[y]);
            System.out.println(array2[i]+ " "+ i);

        }
        System.out.println("The maximum of array2 is: " + array2[49]);
        System.out.println("The minimum of array2 is: " + array2[0]);
        System.out.print("Enter an int: ");
        int n = scan.nextInt();
        if (n<0)
        {
            return;
        }
        else
        {
            int contain = 50;
            int max = 49;
            int min = 0;
            int m = contain/2;
            for (int i = 0; i <50 ; i++)
            {
                  if (array2[m] == n)
                  {
                      System.out.println(n + " was found in " + m);
                      return;
                  }
                  else if (array2[m] < n)
                  {
                      max = max; 
                      min = m +1;
                      contain = (max-min)+1;
                      m = contain/2 + m;
                      System.out.println(m);
                      if (contain <= 0)
                      {
                          System.out.println(n + " was not found in the list.");
                          System.out.println("The number above the key was " + array2[m]);
                          System.out.println("The number below the key was " + array2[m+1]);
                          break;
                      }
                  }
                  else
                  {
                      max = m - 1;
                      min = min;
                      contain = max-min +1;
                      m = contain/2 + min;
                      System.out.println(m);
                  if (contain <= 0)
                      {
                          System.out.println(n + " was not found in the list.");
                          System.out.println("The number below the key was " + array2[m-1]);
                          System.out.println("The number above the key was " + array2[m]);
                          break;
                      }
                  }
                  if (m == 48 || m == 1)
                  {
                          
                          if (m == 1)
                          {
                              if (array2[1] > n)
                              {
                              System.out.println(n + " was not found in the list.");
                              System.out.println("The number below the key was " + array2[m-1]);
                              System.out.println("The number above the key was " + array2[m]);
                               return;
                              }
                          }
                          else 
                          {
                              if (array2[48] < n)
                              {
                              System.out.println(n + " was not found in the list.");
                              System.out.println("The number below the key was " + array2[m]);
                              System.out.println("The number above the key was " + array2[m+1]);
                               return;
                              }
                          }
                  }
            }
        }
    }
}