package com.tw;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;

public class GuessNumberTest {

    RandomAnswerGenerator randomAnswerGenerator;

    @Before
    public void init() {
        randomAnswerGenerator = Mockito.mock(RandomAnswerGenerator.class);
        Mockito.when(randomAnswerGenerator.generate()).thenReturn("1234");
    }

    @Test
    public void should_return_4A0B_when_correct_number_is_1234_given_1234() {
        GuessNumber guessNumber = new GuessNumber(randomAnswerGenerator);
        String result = guessNumber.guess("1234");
        Assert.assertEquals("4A0B", result);
    }

    @Test
    public void should_return_2A2B_when_correct_number_is_1234_given_1243() {
        GuessNumber guessNumber = new GuessNumber(randomAnswerGenerator);
        String result = guessNumber.guess("1243");
        Assert.assertEquals("2A2B", result);
    }

    @Test
    public void should_return_0A0B_when_correct_number_is_1234_given_5678() {
        GuessNumber guessNumber = new GuessNumber(randomAnswerGenerator);
        String result = guessNumber.guess("5678");
        Assert.assertEquals("0A0B", result);
    }

    @Test
    public void should_return_0A4B_when_correct_number_is_1234_given_4321() {
        GuessNumber guessNumber = new GuessNumber(randomAnswerGenerator);
        String result = guessNumber.guess("4321");
        Assert.assertEquals("0A4B", result);
    }

    @Test
    public void should_return_1A1B_when_correct_number_is_1529_given_() {
        GuessNumber guessNumber = new GuessNumber(randomAnswerGenerator);
        String result = guessNumber.guess("1529");
        Assert.assertEquals("1A1B", result);
    }

    @Test
    public void should_return_game_over_when_guess_wrong_more_than_6_time() {
        GuessNumber guessNumber = new GuessNumber(randomAnswerGenerator);
        String first_guess_result = guessNumber.guess("1345");
        String second_guess_result = guessNumber.guess("4567");
        String third_guess_result = guessNumber.guess("9854");
        String forth_guess_result = guessNumber.guess("0972");
        String fifth_guess_result = guessNumber.guess("7812");
        String sixth_guess_result = guessNumber.guess("5970");
        String seventh_guess_result = guessNumber.guess("1234");
        Assert.assertEquals("1A2B", first_guess_result);
        Assert.assertEquals("0A1B", second_guess_result);
        Assert.assertEquals("1A0B", third_guess_result);
        Assert.assertEquals("0A1B", forth_guess_result);
        Assert.assertEquals("0A2B", fifth_guess_result);
        Assert.assertEquals("0A0B", sixth_guess_result);
        Assert.assertEquals("", seventh_guess_result);
    }

    @Test
    public void should_return_wrong_input_when_input_repeat_digits_string() {
        GuessNumber guessNumber = new GuessNumber(randomAnswerGenerator);
        String guess_result = guessNumber.guess("1134");
        Assert.assertEquals("Wrong Input, input again", guess_result);
    }

    @Test
    public void should_return_wrong_input_when_input_not_4_digits_string() {
        GuessNumber guessNumber = new GuessNumber(randomAnswerGenerator);
        String guess_result_with_less_than_4_nums = guessNumber.guess("12");
        String guess_result_with_more_than_4_nums = guessNumber.guess("1235");
        Assert.assertEquals("Wrong Input, input again", guess_result_with_less_than_4_nums);
        Assert.assertEquals("Wrong Input, input again", guess_result_with_more_than_4_nums);
    }
}
