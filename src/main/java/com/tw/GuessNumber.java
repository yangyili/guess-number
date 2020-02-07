package com.tw;

public class GuessNumber {
    private String answer;
    private int numberLen = 4;
    private String RESULT_TEMPLATE = "%sA%sB";

    public GuessNumber(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generate();
    }

    public String guess(String number) {
        int ACount = 0;
        int BCount = 0;
        for (int i = 0; i < this.numberLen; i++) {
            if (number.charAt(i) == this.answer.charAt(i)) ACount++;
            if (number.charAt(i) != this.answer.charAt(i) && this.answer.indexOf(number.charAt(i)) != -1) BCount++;
        }
        return String.format(this.RESULT_TEMPLATE, ACount, BCount);
    }
}
