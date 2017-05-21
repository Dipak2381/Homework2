package Homework2;

import java.util.Scanner;

/**
 * Created by DIPAK on 2/27/2017.
 */
public class FloydTriangle24
{
    public static void main(String[] args)
    {
        int n, num = 1, i, j;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number of rows :");
        n = in.nextInt();

        System.out.println("Floyd's triangle :");

        for ( i = 1 ; i <= n ; i++ )
        {
            for ( j = 1 ; j <= i ; j++ )
            {
                System.out.print(num+" ");
                num++;
            }

            System.out.println();
        }
    }
}
