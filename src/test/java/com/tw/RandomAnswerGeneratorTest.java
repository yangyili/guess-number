package com.tw;

import org.junit.Assert;
import org.junit.Test;
import org.apache.commons.lang3.StringUtils;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RandomAnswerGeneratorTest {

    @Test
    public void should_return_4_digit_string() {
        RandomAnswerGenerator randomAnswerGenerator = new RandomAnswerGenerator();
        String answer = randomAnswerGenerator.generate();
        Assert.assertEquals(4, answer.length());
        Assert.assertEquals(true, StringUtils.isNumeric(answer));
    }

    @Test
    public void should_no_duplicate() {
        RandomAnswerGenerator randomAnswerGenerator = new RandomAnswerGenerator();
        String answer = randomAnswerGenerator.generate();
        Set answer_hash = new HashSet<String>(Arrays.asList(answer.split("")));
        Assert.assertTrue(answer_hash.size() == answer.length());
    }

    @Test
    public void should_random() {
        RandomAnswerGenerator randomAnswerGenerator = new RandomAnswerGenerator();
        String answer_1 = randomAnswerGenerator.generate();
        String answer_2 = randomAnswerGenerator.generate();
        Assert.assertFalse(answer_1.equals(answer_2));
    }

}
