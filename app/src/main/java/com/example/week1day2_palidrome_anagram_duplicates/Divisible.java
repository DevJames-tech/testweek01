package com.example.week1day2_palidrome_anagram_duplicates;

public class Divisible {

    public void getResult(int number) {
        if (number % 3 == 0 && number % 5 == 0) {
            System.out.println("fizzbuzz");
        } else if (number % 3 == 0) {

            System.out.println("fizz");
        } else if (number % 5 == 0) {
            System.out.println("buzz");
        } else {
            System.out.println("non is disvisble");
        }
    }
}




