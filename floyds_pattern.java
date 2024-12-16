import java.util.*;
public class floyds_pattern
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        System.out.println("Type 1 for Floyd's triangle");
        System.out.println("Type 2 for an ICSE pattern");
        System.out.print("Enter your choice: ");
        int ch = in.nextInt();
        switch (ch)
        {
            case 1:
            int a = 1;
            for (int i = 1; i <= 5; i++) 
            {
                for (int j = 1; j <= i; j++) 
                {
                    System.out.print(a++ + "\t");
                }
                System.out.println();
            }
            break;
            
            case 2:
            String s = "ICSE";
            for (int i = 0; i < s.length(); i++)
            {
                for (int j = 0; j <= i; j++)
                {
                    System.out.print(s.charAt(j) + " ");
                }
                System.out.println();
            }
            break;
            
            default:
            System.out.println("Incorrect Choice");
        }
    }
}