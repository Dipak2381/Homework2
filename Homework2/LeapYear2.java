package Homework2;


import java.util.Scanner;

/**
 * Created by DIPAK on 2/26/2017.
 */
public class LeapYear2
{
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        System.out.println("Input any Year");
        int num = s.nextInt();

        if ((num % 4 == 0) && (num % 100 != 0)) //||( num % 400 == 0))
        {
            System.out.println("Year is Leap Year");
        }
        else
        {
            System.out.println("Normal year");
        }
    }
}
