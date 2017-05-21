package Homework2;

import java.util.Scanner;

/**
 * Created by DIPAK on 2/26/2017.
 */
public class Test1
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter type Number(1):");
        int num1 = s.nextInt();

        System.out.println("Enter type Number(2):");
        int num2 = s.nextInt();

        String  a = num1 % 2 == 0 ? "even" : "Odd";//ternary colon
        System.out.println(a);

       String b = num2%2 ==0? "Even":"Odd";
        System.out.println(b);
    }
}
