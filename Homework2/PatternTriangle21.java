package Homework2;

import java.util.Scanner;

/**
 * Created by DIPAK on 2/27/2017.
 */
public class PatternTriangle21
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number of rows:");

        int numRow = sc.nextInt();

        int rowCount = 1;

        for (int i = numRow; i > 0; i--)
        {
            //Printing i spaces at the beginning of each row

            for (int j = 1; j <= i; j++)
            {
                System.out.print(" ");
            }

            //Printing 'j' value at the end of each row

            for (int j = 1; j <= rowCount; j++)
           {
               System.out.print(j+" ");
           }

           System.out.println();

            //Incrementing the rowCount

            rowCount++;
        }
    }
}
