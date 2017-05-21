package Homework2;

import java.util.Scanner;

/**
 * Created by DIPAK on 2/27/2017.
 */
public class AlphabetAToF10
{
    public static void main(String[] args)
    {
       Scanner s = new Scanner(System.in);
        System.out.println("Type alphabet a to f:");
        String name = s.nextLine();

        if (name.equals("a"))
        {
            System.out.println("ahmedabad");
        }else if (name.equals("b"))
                   {
                       System.out.println("Bhavnager");
                   }else if (name.equals("c"))
                          {
                              System.out.println("chennie");
                           }else if (name.equals("d"))
                             {
                                 System.out.println("delhi");
                             }else if (name.equals("e"))
                                    {
                                        System.out.println("eslamadab");
                                    }else if (name.equals("f"))
                                            {
                                                System.out.println("faridabad");
                                            }else{
                                                 System.out.println("alhabet should be invalid");
                                                 }
    }
}
