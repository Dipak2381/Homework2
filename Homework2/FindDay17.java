package Homework2;

import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.Scanner;

/**
 * Created by DIPAK on 2/27/2017.
 */
public class FindDay17
{
    public static void main(String[] args)

    {
       Scanner s= new Scanner(System.in);
        System.out.println("Input any number between 1 to 7:");
        int day = s.nextInt();

        switch (day) {

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("saturday");
                break;
            case 7:
                System.out.println("sunday");
                break;



        }
    }
}
