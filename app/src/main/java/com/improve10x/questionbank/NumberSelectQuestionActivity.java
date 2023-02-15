package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

public class NumberSelectQuestionActivity extends AppCompatActivity implements IQuestionActivity {
     TextView questionTxt;
     SeekBar answerSb;
     Button verifyBtn;
     String question;
     String answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_number_select_question);
        initViews();
        getQuestionsData();
        displayData();
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
        Intent intent = getIntent();
        question = intent.getStringExtra("Question");
        answer = intent.getStringExtra("answer");

    }

    @Override
    public void displayData() {
        questionTxt.setText(question);
    }

    public  void initViews(){
        questionTxt = findViewById(R.id.question_txt);
        answerSb = findViewById(R.id.answer_sb);
        verifyBtn = findViewById(R.id.verify_btn);
    }
}