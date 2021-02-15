// *********************************************************
//   Author: Steven Smail
// 
//   Count3.java
//
//   This program reads a string (phrase) and counts the 
//   number of space characters and certain other letters
//   in the phrase.
// *********************************************************

import java.util.Scanner;

public class Count3
{
    public static void main (String[] args)
    {
        String phrase;    // a string of characters
        int length;       // the length of the phrase
        char ch;          // an individual character in the string

        Scanner scanner = new Scanner(System.in);

        // Print a program header
        System.out.println ();
        System.out.println ("Character Counter");
        System.out.println ();

        // Read in a string and find its length
        System.out.println ("Enter a sentence or phrase");
        System.out.println ("(or 'quit' to exit):");
        phrase = scanner.nextLine();
        length = phrase.length();

        while (!(phrase.equals("quit")))
        {
           // Initialize counts
           int aCount = 0, eCount = 0, sCount = 0,
           tCount = 0, blankCount = 0;

           // Add a "for" loop here to go through the string 
           // character by character and count the space characters.
           for (int count = 0; count < length; count++)
           {

           ch = phrase.charAt(count);

              switch (ch)
              {
                 case 'a':
                 case 'A':
                    aCount++;
                    break;
                 case 'e':
                 case 'E':
                    eCount++;
                    break;
                 case 's':
                 case 'S':
                    sCount++;
                    break;
                 case 't':
                 case 'T':
                    tCount++;
                    break;
                 case ' ':
                    blankCount++;
                    break;                 
              }
           }

        // Print the results
        System.out.println ();
        System.out.println ("Number of a's: " + aCount);
        System.out.println ("Number of e's: " + eCount);
        System.out.println ("Number of s's: " + sCount);
        System.out.println ("Number of t's: " + tCount);
        System.out.println ("Number of space characters: " + blankCount);
        System.out.println ();

        System.out.println ("Enter another sentence or phrase");
        System.out.println ("(or 'quit' to exit):");
        phrase = scanner.nextLine();
        length = phrase.length();
        }
    }
}


