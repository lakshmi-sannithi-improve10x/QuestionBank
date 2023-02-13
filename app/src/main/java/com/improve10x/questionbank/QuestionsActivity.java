package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuestionsActivity extends AppCompatActivity {
      TextView questionTxt;
      RadioButton option1Rb;
      RadioButton option2Rb;
      RadioButton option3Rb;
      RadioButton option4Rb;

      String question;
      String option1;
      String option2;
      String option3;
      String option4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        initViews();
        getQuestionsData();
        displayData();

    }

    private void initViews() {
        questionTxt = findViewById(R.id.question_txt);
        option1Rb = findViewById(R.id.optiona_rb);
        option2Rb = findViewById(R.id.optionb_rb);
        option3Rb = findViewById(R.id.optionc_rb);
        option3Rb = findViewById(R.id.optiond_rb);
    }

    public void  getQuestionsData(){
        Intent intent = getIntent();
         question = intent.getStringExtra("Question");
         option1 = intent.getStringExtra("option1");
         option2 = intent.getStringExtra("option2");
         option3 = intent.getStringExtra("option3");
         option4 = intent.getStringExtra("option4");
    }

    public void  displayData(){
        questionTxt.setText(question);
        option1Rb.setText(option1);
        option2Rb.setText(option2);
        option3Rb.setText(option3);
        option4Rb.setText(option4);
    }
}