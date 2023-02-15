package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class TextQuestionActivity extends AppCompatActivity implements IQuestionActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_text_question);
    }

    @Override
    public void VerifyBtn() {

    }

    @Override
    public void verifyAnswer() {

    }

    @Override
    public String getSelectedOption() {
        return null;
    }

    @Override
    public void getQuestionsData() {

    }

    @Override
    public void displayData() {

    }
}