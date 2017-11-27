package io.zipcoder;

import org.junit.Assert;
import org.junit.Test;

public class Problem4Test {

    @Test
    public void isPalindromeTest_Pass() {
        Assert.assertTrue(new Problem4().isPalindrome("aabbaa"));
    }

    @Test
    public void findFrequencyOfACharacterInAStringTest() {
        Integer expected = 3;
        Integer actual = new Problem4().findFrequencyOfACharacterInAString("aaabbbb", 'a');
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void findFrequencyOfAllCharactersTest() {
        Integer expected = 26;
        Integer actual = new Problem4().findFrequencyOfAllCharacters("aaabbbb").size();
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isPalindromePermutationTest_aaabbbb() {
        String expected = "YES";
        String actual = new Problem4().IsPalindromePermutation("aaabbbb");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isPalindromePermutationTest_cdefghmnopqrstuvw() {
        String expected = "NO";
        String actual = new Problem4().IsPalindromePermutation("cdefghmnopqrstuvw");
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void isPalindromePermutationTest_cdcdcdcdeeeef() {
        String expected = "YES";
        String actual = new Problem4().IsPalindromePermutation("cdcdcdcdeeeef");
        Assert.assertEquals(expected, actual);
    }
}
