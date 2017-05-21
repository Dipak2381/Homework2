package Homework2;

import java.util.Scanner;

public class VowelOFConsonant19 {


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);
        System.out.println("Input single Character:");
        String x =s.next().toLowerCase();
        int y =x.length();
        char s1 = x.charAt(0);

        if (s1>y)
        {
            System.out.println("error message:");
        }
           else  if ((s1 == 'a') || (s1 == 'e') ||
                    (s1 == 'i') || (s1 == 'o') ||
                    (s1 == 'u'))
              {
                  System.out.println("Vowel words:");
              }
                      else
                        {
                          System.out.println("Input letter is consonant");
                         }


    }       }

