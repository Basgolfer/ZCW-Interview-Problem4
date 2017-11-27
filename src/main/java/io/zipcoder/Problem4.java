package io.zipcoder;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;

public class Problem4 {

    public boolean isPalindrome(String input) {
        StringBuilder stringBuilder = new StringBuilder(input);
        String reverse = stringBuilder.reverse().toString();
        return input.equalsIgnoreCase(reverse);
    }

    public Integer findFrequencyOfACharacterInAString(String input, Character character) {
        ArrayList<Character> arrayList = new ArrayList<Character>();
        for (int i = 0; i < input.length(); i++) {
            arrayList.add(input.charAt(i));
        }
        Integer countOfGivenCharacter = Collections.frequency(arrayList, character);
//        if (countOfGivenCharacter >=1) {
//            System.out.println("The frequency of " + character + " is " + countOfGivenCharacter);
//        }
        return countOfGivenCharacter;
    }

    public ArrayList<Integer> findFrequencyOfAllCharacters(String input) {
        ArrayList<Integer> frequencyOfCharacter = new ArrayList<Integer>();
        for (char i = 'a'; i <= 'z'; i++) {
            frequencyOfCharacter.add(findFrequencyOfACharacterInAString(input, i));
        }
        return frequencyOfCharacter;
    }

    public String IsPalindromePermutation(String input) {
        ArrayList<Integer> frequencyOfAllCharacters = findFrequencyOfAllCharacters(input);
        Integer numberOfCharactersThatHaveAnOddPresence = 0;
        for (int index = 0; index < frequencyOfAllCharacters.size(); index++) {
            if (frequencyOfAllCharacters.get(index) % 2 == 1) {
                numberOfCharactersThatHaveAnOddPresence++;
            }
        }
        if (numberOfCharactersThatHaveAnOddPresence == 0 || numberOfCharactersThatHaveAnOddPresence == 1) {
            return "YES";
        }
        return "NO";
    }




}
