package com.tw;

public class GuessNumber {
    private String answer;
    private int numberLen = 4;
    private String resultTemp = "%sA%sB";

    public GuessNumber(String answer) {
        this.answer = answer;
    }

    public String guess(String number) {
        int ACount = 0;
        int BCount = 0;
        for (int i = 0; i < this.numberLen; i++) {
            if (number.charAt(i) == this.answer.charAt(i)) ACount++;
            if (number.charAt(i) != this.answer.charAt(i) && this.answer.indexOf(number.charAt(i)) != -1) BCount++;
        }
        return String.format(this.resultTemp, ACount, BCount);
    }
}
