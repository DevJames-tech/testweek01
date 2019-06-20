package com.example.week1day2_palidrome_anagram_duplicates;


import androidx.appcompat.widget.LinearLayoutCompat;

import java.lang.invoke.MutableCallSite;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class GetDuplicates {

    String storedWord;

    public void findDuplicates(List<String> passedWord) {
        List<String> storesWords = new LinkedList();


        for (int index = 0; index < storesWords.size(); index++) {

            storesWords.add(passedWord.get(index));

            storedWord = storesWords.get(index);

            if (!storedWord.equals(storesWords.get(index))) ;
            {
                System.out.println(storesWords.get(index));
                index++;
            }


        }


    }

    public static void main(String[] args) {
        Multiplication myObject = new Multiplication();
        myObject.multiplcationTable();
/* ////////////////////Divisible/////////////////
        int holdmynum;
        Divisible myclass = new Divisible();
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Enter a valuer to check");
        holdmynum = myScanner.nextInt();

        myclass.getResult(holdmynum);
        */
    }
/*
        Anagrams myAna = new Anagrams();
        String Message = " taco";

        if(myAna.checkAnagrams(Message)) {
            System.out.println("Is anagram");
        }
            else {
            System.out.println("is not an anagram");
            }

        }
*/

        /////////Palindromes/////////
        /*
        Palydrone palydrone = new Palydrone();

        System.out.println("Please enter a word to test");
        Scanner testWord = new Scanner(System.in);
        String readWord =testWord .nextLine();

        if(palydrone.isPalindrome(readWord)) {
            System.out.println("your word is a palindrome");
        }
        else {
            System.out.println("your word is not a palindrome");
        }
*/
    }


/*
    /////////////////Duplicates/////////////////////////////////

        String readWords;
        List<String>getWord = new LinkedList();
        GetDuplicates myObj = new GetDuplicates();
        Scanner getUserInput = new Scanner(System.in);


        do {
            System.out.println("Enter Strings for list");
            readWords = getUserInput.nextLine();
            getWord.add(readWords);

        }while(!readWords.equals("quit"));

        myObj.findDuplicates(getWord);
        }
*/

