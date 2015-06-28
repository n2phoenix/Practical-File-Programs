/*Accept a paragraph containing sentences terminated by a ".", ",", "!" Assume a max of 5 sentences.
Design the program to do the following:
1. Arrange the sentence in alphabetical order sentence by sentence. 
2. Separate the words that begin with a vowel.
 */
import java.util.*;
public class Delimiter
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);
        String s = " ";
        int c = 7;

        while (c > 5)
        {
            System.out.println ("Enter paragraph of sentences in one line: ");
            s = in.nextLine();
            c = 0;
            for (int i = 0; i < s.length(); i++)
            {
                if (s.charAt(i) == '!' || s.charAt(i) == '.' || s.charAt(i) == ',')
                    c++;
            }

            if (s == " " || s == "") //Running check to see if user entered an empty string
            {
                System.out.println ("ERROR: Enter a valid string!");
                c = 10;
            }
            else if (c > 5)
            System.out.println ("More than 5 sentences! Enter a paragraph containing not more than 5 sentences! ");
        }

        s = s.trim();
        s = s + " ";
        StringArray arr[] = new StringArray [5];

        for (int i = 0; i < s.length(); i++)
        {
            if (s.charAt(i) == '!' || s.charAt(i) == '.' || s.charAt(i) == ',') // Counting number of lines
            {
                String temp = s.substring (x, s.charAt(i) + 1);
                arr[i] = new StringArray (temp);
            }
        }

        for (int i = 0; i < s.length(); i++)
        {
            arr[i].alphabetize();
        }
    }
}