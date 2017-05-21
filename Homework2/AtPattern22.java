package Homework2;

import java.util.Scanner;

/**
 * Created by DIPAK on 2/27/2017.
 */
public class AtPattern22
{

    public static void main(String args[])
    {

        Scanner input = new Scanner(System.in);
        System.out.print("How many rows: ");
        int rows = input.nextInt();
        for (int i = 1; i <= rows; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print("@");
            }

            System.out.println("");

        }
    }

}