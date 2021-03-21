package TOTO649;

import java.util.Arrays;
import java.util.Random;

public class Toto
{
    public static void main(String[] ars)
    {
        Random myRandom = new Random();

        int[] TOTO = {7,18,26,34,41,47};
        int[] myNumbers = new int[6];
        int counter = 0;

        for (int i = 0; i < 6; i++)
        {
            myNumbers[i] = myRandom.nextInt(49)+1;
        }

        System.out.println("TOTO : ");
        System.out.println(Arrays.toString(TOTO));
        System.out.println("MyNumbers : ");
        System.out.println(Arrays.toString(myNumbers));

        for (int i = 0; i < 6; i++)
        {
            for (int j = 0; j < 6; j++)
            {
                if (TOTO[i] == myNumbers[j])
                {
                    counter++;
                }
            }
        }

            switch (counter)
            {
                case 3 :
                    System.out.println("You Have 3 !");
                    break;
                case 4 :
                    System.out.println("You Have 4 !");
                    break;
                case 5 :
                    System.out.println("You Have 5 !");
                    break;
                case 6 :
                    System.out.println("You Have 6 !");
                    break;
            }

    } // end of main

} // end of class
