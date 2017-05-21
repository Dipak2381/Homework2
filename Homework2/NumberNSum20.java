package Homework2;

import java.util.Scanner;

/**
 * Created by DIPAK on 2/27/2017.
 */
public class NumberNSum20
{
    public static void main(String[] args)

    {
        int i, n, sum=0;
        {
            Scanner in = new Scanner(System.in);
            System.out.print("Input number: ");
            n = in.nextInt();

        }
             for(i=1;i<=n;i++)
             {
                 System.out.println(i);
                 sum+=i;
              }
        System.out.println("Total sum : " +sum);

    }
}
