/////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//chen xi liu
//04/03/2015
//cse 02 lab 09 program

import java.util.Random;

public class random{
    
    public static void main(String[] args){
       Random randomG = new Random();
       int random1 = (int)(Math.random()*10);
       int random2 = (int)(Math.random()*10);
       int random3 = (int)(Math.random()*10);
       int random4 = (int)(Math.random()*10);
       int random5 = (int)(Math.random()*10);
       int random6 = (int)(Math.random()*10);
       while (random2 == random1)
       {
           random2 = randomG.nextInt(10);
       }
       while (random3 == random2 || random3 == random1)
       {
           random3 = randomG.nextInt(10);
       }
       while (random5 == random4)
       {
           random5 = randomG.nextInt(10);
       }
       String Ad1 = adjectives(random1);
       String Ad2 = adjectives(random2);
       String Ad3 = adjectives(random3);
       String noun1 = noun(random4);
       String noun2 = noun(random5);
       String verb1 = verb(random6);
       System.out.println("The" + " "+ Ad1 + " "+ Ad2 + " "+ noun1+" " + verb1 + " the " + Ad3 + " "+ noun2+".");
    }
    
    public static String adjectives (int x)
    {
        String a = " ";
        switch (x){
            case 0: a = "quick";
            break;
            case 1: a = "happy";
            break;
            case 2: a = "brown";
            break;
            case 3: a = "Fuzzy";
            break;
            case 4: a = "hard";
            break;
            case 5: a = "smart";
            break;
            case 6: a = "wet";
            break;
            case 7: a = "warm";
            break;
            case 8: a = "tight";
            break;
            case 9: a = "steady";
            break;
        }
        return a;
    }
    public static String noun (int y)
    {
        String b = " ";
        switch (y){
            case 0: b = "cat";
            break;
            case 1: b = "dog";
            break;
            case 2: b = "bird";
            break;
            case 3: b = "rabbit";
            break;
            case 4: b = "snake";
            break;
            case 5: b = "wolf";
            break;
            case 6: b = "lion";
            break;
            case 7: b = "tiger";
            break;
            case 8: b = "bear";
            break;
            case 9: b = "pig";
            break;
        }
        return b;
    }
    public static String verb (int z)
    {
        String c = " ";
        switch (z){
            case 0: c = "beat";
            break;
            case 1: c = "ate";
            break;
            case 2: c = "passed";
            break;
            case 3: c = "killed";
            break;
            case 4: c = "fighted";
            break;
            case 5: c = "comforted";
            break;
            case 6: c = "touched";
            break;
            case 7: c = "kicked";
            break;
            case 8: c = "catched";
            break;
            case 9: c = "chased";
            break;
        }
        return c;
    }
}