package Homework2;

import java.util.Scanner;

/**
 * Created by DIPAK on 2/27/2017.
 */
public class SwitchOccur14 {

    public static void main(String[] args)
    {
        Scanner s= new Scanner(System.in);
        System.out.println("Input any two Number:");
        int num1 = s.nextInt();
        System.out.println();
        int num2 = s.nextInt();
        System.out.println();
        System.out.println("Type any symbo(+ - * / :");
        char s1 = s.next().charAt(0);

        switch (s1)
        {
            case '+':
                int add = num1+num2;
                System.out.println(add);
                break;
            case '-':
                int sub =num1-num2;
                System.out.println(sub);
                break;
            case '*':
                int multi = num1*num2;
                System.out.println(multi);
                break;
            case '/':
                int devi =num1/num2;
                System.out.println(devi);
                break;



        }
    }
}
