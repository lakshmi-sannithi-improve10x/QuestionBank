package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;
import android.widget.Toast;

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
        handleVerifyBtn();
    }

    @Override
    public void handleVerifyBtn() {
        verifyBtn.setOnClickListener(view -> {
            verifyAnswer();
        });

    }

    @Override
    public void verifyAnswer() {
        String selectedAnswer = getSelectedOption();
        if (answer.equalsIgnoreCase(selectedAnswer)) {
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
        }
    }

    @Override
    public String getSelectedOption() {
        int progress = answerSb.getProgress();
        return progress + "";
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