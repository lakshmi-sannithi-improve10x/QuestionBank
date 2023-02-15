package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class TrueOrFalseQuestionActivity extends AppCompatActivity implements IQuestionActivity {
       TextView questionTxt;
       RadioButton trueRb;
       RadioButton falseRb;
       Button verifyBtn;
       RadioGroup optionsRg;

       String question;
       String answer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_true_or_false_question);
        inItViews();
        getQuestionsData();
        displayData();
        VerifyBtn();
    }

    @Override
    public void VerifyBtn() {
        verifyBtn.setOnClickListener(view -> {
            verifyAnswer();

        });

    }

    @Override
    public void verifyAnswer() {
        String selectedAnswer = getSelectedOption();
        if (answer.equals(selectedAnswer)){
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
        }


    }

    @Override
    public String getSelectedOption() {
        int selectedOption = optionsRg.getCheckedRadioButtonId();
        String result = "";
        if (selectedOption == R.id.true_rb){
            result = "a";

        } else if (selectedOption == R.id.false_rb) {
            result = "b";

        }


        return result;
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

    public void inItViews(){
        questionTxt = findViewById(R.id.question_txt);
        trueRb = findViewById(R.id.true_rb);
        falseRb = findViewById(R.id.false_rb);
        verifyBtn = findViewById(R.id.verify_btn);
        optionsRg = findViewById(R.id.options_rg);
    }
}