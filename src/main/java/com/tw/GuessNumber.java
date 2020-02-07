package com.tw;

public class GuessNumber {
    private final int guessMaxCount = 6;
    private String answer;
    private int numberLen = 4;
    private String RESULT_TEMPLATE = "%sA%sB";
    private int guessCount;
    public GuessNumber(AnswerGenerator answerGenerator) {
        this.answer = answerGenerator.generate();
        this.guessCount = 0;
    }

    public String guess(String number) {
        this.guessCount++;
        if (this.guessCount > this.guessMaxCount) {
            System.out.println("Game Over");
            return "";
        }
        int ACount = 0;
        int BCount = 0;
        for (int i = 0; i < this.numberLen; i++) {
            if (number.charAt(i) == this.answer.charAt(i)) ACount++;
            if (number.charAt(i) != this.answer.charAt(i) && this.answer.indexOf(number.charAt(i)) != -1) BCount++;
        }
        return String.format(this.RESULT_TEMPLATE, ACount, BCount);
    }
}
