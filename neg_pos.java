import java.util.*;
public class neg_pos
{
    public static void main(String args[]) 
    {
        Scanner in = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter 10 numbers");
        for (int i = 0; i < arr.length; i++)
        {
            arr[i] = in.nextInt();
        }
        for (int i = 0; i < arr.length; i++) 
        {
            if (arr[i] < 0)
                System.out.print(arr[i] + ", ");
        }
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] >= 0)
                System.out.print(arr[i] + ", ");
        }
    }
}