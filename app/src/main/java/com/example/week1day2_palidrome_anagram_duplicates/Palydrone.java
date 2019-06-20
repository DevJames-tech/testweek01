package com.example.week1day2_palidrome_anagram_duplicates;

import java.util.Scanner;

public class Palydrone {

    public boolean isPalindrome(String word)
    {
      String holdWord = word;
        boolean isTrue = false;

        for(int iIndex = 0; iIndex < holdWord.length() /2; iIndex++)
        {
            System.out.println("true = ");
            for(int jIndex = holdWord.length(); jIndex >0 ; jIndex--)
            {
                System.out.println("holdWord = " + holdWord);
                if(holdWord.charAt(iIndex) == (holdWord.charAt(jIndex-1)))
                {
                    isTrue = true;
                    System.out.println(holdWord);
                }
                else
                {
                    break;
                }


            }
        }
        return isTrue;
    }
};
/*
    public static void main(String[] args) {

    Palydrone myobject;
        System.out.println("Please enter a word to test");
        Scanner testWord = new Scanner(System.in);
        String readWord =testWord .nextLine();

        if(myobject.isPalindrome(readWord)) {
            System.out.println("your word is a palindrome");
        }
            else {
                System.out.println("your word is a palindrome");
            }

        }
    }
*/