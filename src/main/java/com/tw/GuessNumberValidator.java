package com.tw;

import org.apache.commons.lang3.StringUtils;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class GuessNumberValidator implements InputNumberValidator {
    private int guessNumberLength = 4;

    public boolean isValid(String guessNumber) {
        boolean isGuessNumberLengthValid = guessNumber.length() == this.guessNumberLength;
        if (!isGuessNumberLengthValid) return false;

        boolean isGuessNumberIsAllDigit = StringUtils.isNumeric(guessNumber);
        if (!isGuessNumberIsAllDigit) return false;

        Set guessNumberSet = new HashSet<String>(Arrays.asList(guessNumber.split("")));
        boolean isGuessNumberNoDuplicate = guessNumberSet.size() == this.guessNumberLength;
        if (!isGuessNumberNoDuplicate) return false;

        return true;
    }
}
