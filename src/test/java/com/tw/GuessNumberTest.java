package com.tw;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class GuessNumberTest {

    GuessNumber guessNumber;

    @Before
    public void init() {
        guessNumber = new GuessNumber("1234");
    }

    @Test
    public void should_return_4A0B_when_correct_number_is_1234_given_1234() {
        String result = guessNumber.guess("1234");
        Assert.assertEquals("4A0B", result);
    }

    @Test
    public void should_return_2A2B_when_correct_number_is_1234_given_1243() {
        String result = guessNumber.guess("1243");
        Assert.assertEquals("2A2B", result);
    }

    @Test
    public void should_return_0A0B_when_correct_number_is_1234_given_5678() {
        String result = guessNumber.guess("5678");
        Assert.assertEquals("0A0B", result);
    }

    @Test
    public void should_return_0A4B_when_correct_number_is_1234_given_4321() {
        String result = guessNumber.guess("4321");
        Assert.assertEquals("0A4B", result);
    }

    @Test
    public void should_return_1A1B_when_correct_number_is_1529_given_() {
        String result = guessNumber.guess("1529");
        Assert.assertEquals("1A1B", result);
    }
}
