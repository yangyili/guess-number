package com.tw;

import org.apache.commons.lang3.StringUtils;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class RandomAnswerGenerator implements AnswerGenerator {
    @Override
    public String generate() {
        Set answer = new HashSet<String>();
        Random random = new Random();
        while (answer.size() < 4) {
            answer.add(random.nextInt(10));
        }
        return StringUtils.join(answer.toArray(), "");
    }
}
