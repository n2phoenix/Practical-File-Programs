/*Question 2 - First term, 2014 - 15
Write a program to accept a date in the string format dd/mm/yyyy. 
Test the validity of the date and print the date in full form. 
If the date is invalid then print a message as “Invalid date“ 
and terminate the program. Now accept the day of the week of the 
input date. 
Print the date and day of the week for Nth day from input date 
where N is to be input between 1 and 365.*/

import java.util.*;
class valiDate
{
    static Scanner in = new Scanner (System.in);
    static boolean b = true;
    static int dd, mm, yy;
    static String sd;
    public static void accept()
    {

        System.out.println ("Enter date: ");
        sd = in.nextLine();
        dd = Integer.parseInt (sd.substring (0, sd.indexOf ("/")));
        mm = Integer.parseInt (sd.substring (3, sd.lastIndexOf ("/")));
        yy = Integer.parseInt (sd.substring (sd.lastIndexOf ("/") + 1));

        if (dd < 1 || dd > 31)
            b = false;
        else if (mm < 1 || mm > 12)
            b = false;
        else if (yy < 1 || yy > 2999)
            b = false;

        if (!b)
        {
            System.out.println ("Invalid date.");
            kill();
        }
        else 
        {
            System.out.println ();
            find();
        }
    }

    public static void find()
    {
        System.out.println ("Enter day of the week of the date: ");
        String day = in.nextLine();
        String week[] = {"", "SUNDAY", "MONDAY", "TUESDAY", "WEDNESDAY", "THURSDAY", "FRIDAY", "SATURDAY"};
        int days[] = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        int n = 0;
        while (n < 1 || n > 365)
        {            
            System.out.println ("Enter n between 1 and 365: ");
            System.out.println ("If you wish to subtract the days, make your input negative!");
            n = Integer.parseInt (in.nextLine());
        }

        Calendar cal = Calendar.getInstance();    
        cal.set(Calendar.DAY_OF_MONTH, dd);
        cal.set(Calendar.MONTH, mm);
        cal.set(Calendar.YEAR, yy);
        cal.add(Calendar.DAY_OF_MONTH, n);
        
        dd = cal.DAY_OF_MONTH;
        mm = cal.MONTH;
        yy = cal.YEAR;
        int id = cal.get(Calendar.DAY_OF_WEEK);
        
        System.out.println ("The new date is: " + dd + "/" + mm + "/" + yy);
        System.out.println ("Day of the new date: " + week[id]);
    }
    
    public static void kill()
    {
        System.out.println ("Program terminated. ");
    }
}
