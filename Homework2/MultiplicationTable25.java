package Homework2;

import java.util.Scanner;

/**
 * Created by DIPAK on 2/27/2017.
 */
public class MultiplicationTable25
{
    public static void main(String[] args)

    {
        int n, i;
        System.out.println("Input no:");
        Scanner in = new Scanner(System.in);
        n = in.nextInt();

        for ( i = 1 ; i <= 10 ; i++ )
            System.out.println(n+"*"+i+" = "+(n*i));
    }
}
