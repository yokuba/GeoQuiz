package com.aliciamaclennan.geoquiz;

/**
 * Created by amac on 8/4/16.
 */
public class Question {
    private int mTextResId;
    private boolean mAnswerTrue;
    private boolean mIsCheater;

    public Question(int textResId, boolean AnswerTrue, boolean isCheater){
        mTextResId = textResId;
        mAnswerTrue = AnswerTrue;
        mIsCheater = isCheater;
    }

    public int getTextResId() {
        return mTextResId;
    }

    public void setTextResId(int textResId) {
        mTextResId = textResId;
    }

    public boolean isAnswerTrue() {
        return mAnswerTrue;
    }

    public void setAnswerTrue(boolean answerTrue) {
        mAnswerTrue = answerTrue;
    }

    public boolean isCheatTrue() { return mIsCheater;}
    public void setCheatTrue(boolean cheatTrue){mIsCheater = cheatTrue;}
}
