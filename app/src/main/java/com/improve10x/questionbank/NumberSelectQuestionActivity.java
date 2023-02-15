package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class NumberSelectQuestionActivity extends AppCompatActivity implements IQuestionActivity {
     TextView questionTxt;
     SeekBar answerSb;
     Button verifyBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_select_question);
        initViews();
    }

    @Override
    public void handleVerifyBtn() {

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

    public  void initViews(){
        questionTxt = findViewById(R.id.question_txt);
        answerSb = findViewById(R.id.answer_sb);
        verifyBtn = findViewById(R.id.verify_btn);
    }
}