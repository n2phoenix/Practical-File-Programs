public class StringArray
{
    String[] arr;
    String[] vow;
    char c;

    StringArray (String s)
    {
        arr = s.split (" ");
        c = s.charAt (s.length() - 1);
    }

    void alphabetize()
    {
        byte 
        for (int i = 1; i < arr.length; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (arr[i].compareTo (arr[j]) < 0)
                {
                    String temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
                char c = arr[i].charAt (0);
                if (c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U' || c == 'a' || c == 'e' ||c == 'i' || c == 'o' || c == 'u'))
                
            }
        }
    }
}