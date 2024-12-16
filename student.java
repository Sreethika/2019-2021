import java.util.*;
public class student
{
    public static void main(String args[])
    {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = in.nextInt();
        String name[] = new String[n];
        int totalmarks[] = new int[n];
        int grandTotal = 0;
        for (int i = 0; i < n; i++) 
        {
            in.nextLine();
            System.out.print("Enter name of student " + (i+1) + ": ");
            name[i] = in.nextLine();
            System.out.print("Enter total marks of student " + (i+1) + ": ");
            totalmarks[i] = in.nextInt();
            grandTotal += totalmarks[i];
        }
        double avg = grandTotal / (double)n;
        System.out.println("Average = " + avg); 
        for (int i = 0; i < n; i++) 
        {
            System.out.println("Deviation for " + name[i] + " = " 
            + (totalmarks[i] - avg));
        }
    }
}