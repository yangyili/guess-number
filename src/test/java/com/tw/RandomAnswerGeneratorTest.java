package com.tw;

import org.junit.Assert;
import org.junit.Test;

public class RandomAnswerGeneratorTest {
    @Test
    public void should_return_4_digit_string() {
        RandomAnswerGenerator randomAnswerGenerator = new RandomAnswerGenerator();
        String answer = randomAnswerGenerator.generate();
        Assert.assertEquals(4, answer.length());
        // StringUtil
    }

    @Test
    public void should_no_duplicate() {
        RandomAnswerGenerator randomAnswerGenerator = new RandomAnswerGenerator();
    }

}
