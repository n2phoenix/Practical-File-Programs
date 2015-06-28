/*Question 1 - First Term 2013-14
Write a program to accept a day number (between 1 and 366), year (in 4 digits) 
from the user to generate and display the corresponding date. Also accept ‘N’ (1 <= N <= 100) from the 
user to compute and display the future date corresponding to ‘N’ days after the generated date. 
Also accept the day of the week of 1st of January of the input year and print the day of the week of the output date. 
Display an error message if the value of the day number, year and N are not within the limit or not 
according to the condition specified.                                                                              */

import java.util.*;
class anotherdate
{
    public static void main()
    {
        Scanner in = new Scanner (System.in);

        int d = 0;
        while (d < 1 || d > 366)
        { 
            System.out.println ("Enter day number between 1 and 366: (inclusive)");
            d = Integer.parseInt (in.nextLine());
        }
        
        int y = 0;
        while (y < 1900 || y > 2999)
        { 
            System.out.println ("Enter valid year between 1970 and 2999: (inclusive)");
            y = Integer.parseInt (in.nextLine());
        }
        
        int n = 0;
        while (n < 1 || n > 100)
        { 
            System.out.println ("Enter number of days between 1 and 100: (inclusive)");
            n = Integer.parseInt (in.nextLine());
        }
        
        System.out.println ("Enter day of the week of January 1st " + y + " in words eg. Sunday");
        String dj = in.nextLine();
        
        String weekd[] = {"", "Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int monthd[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        GregorianCalendar gc = new GregorianCalendar();
        if (gc.isLeapYear(y)) 
        monthd[2] = 29;
        
        int djn = 0;
        for (int i = 1; i < 8; i++)
        {
            if (dj.equalsIgnoreCase (weekd[i]))
            djn = i;
        }
        
        int dt = d; // Incrementing by number of days in each month till given value of n   
        byte m = 0; // For checking which month it is currently in
        while (dt 
    }
}