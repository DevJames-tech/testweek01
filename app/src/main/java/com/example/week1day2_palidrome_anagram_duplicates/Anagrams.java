package com.example.week1day2_palidrome_anagram_duplicates;

import java.util.Arrays;

public class Anagrams {

    public boolean checkAnagrams(String word1) {

        boolean isTrue = false;

        String randomVariable = "coat";

        for (int tIndex = 0; tIndex < word1.length(); tIndex++) {


            for (int cIndex = randomVariable.length(); tIndex > 0; tIndex--) {

                if (word1.charAt(tIndex) == (randomVariable.charAt(cIndex-1))) {
                    isTrue = true;

                } else {
                    break;
                }

            }
        }
        return isTrue;
    }
}
