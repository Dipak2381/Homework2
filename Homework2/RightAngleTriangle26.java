package Homework2;

import java.util.Scanner;

/**
 * Created by DIPAK on 2/27/2017.
 */
public class RightAngleTriangle26 {


    public static void main(String[] args)
    {
        Scanner scn=new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n=scn.nextInt();
        for (int i = 1; i <=n; i++)
        {
            for (int j = n-i; j >=1; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <=i; k++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}