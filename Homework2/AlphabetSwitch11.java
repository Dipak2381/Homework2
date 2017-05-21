package Homework2;

import java.util.Scanner;

/**
 * Created by DIPAK on 2/27/2017.
 */
public class AlphabetSwitch11
{
    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Type Alphabet between a to f:");
        String name = s.next();
        switch (name)
        {
            case "a":
                   System.out.println("Ahmedabad");
                   break;
            case "b":
                   System.out.println("Bhavnager");
                   break;
            case "c":
                   System.out.println("chennie");
                   break;
            case "d":
                   System.out.println("delhi");
                    break;
            case "e":
                System.out.println("eslamadab");
                break;
            case "f":
                System.out.println("faridabad");
                break;
            default:
                    System.out.println("Invalid Alphabet");
                    break;
        }
    }
}
