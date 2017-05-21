package Homework2;

import java.util.Scanner;

/**
 * Created by DIPAK on 2/27/2017.
 */
public class TypeAnyValue16
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Enter any Value:");
       // String s1 =s.nextLine();
        char s1 = s.next().charAt(0);


        if ((s1>='A' && s1<='Z') || (s1>='a' && s1<='z'))
        {
            System.out.println("This is Alphabet:");
        }
        else if (s1>='0' && s1<='9')
            {
            System.out.println("This is number:");
            }
            else
                {
                System.out.println("This is symbol:");
                }
    }
}
