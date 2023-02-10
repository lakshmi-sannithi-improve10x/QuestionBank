package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioButton;
import android.widget.TextView;

public class QuestionsActivity extends AppCompatActivity {
      TextView ques1Txt;
      RadioButton radio1Rb;
      RadioButton radio2Rb;
      RadioButton radio3Rb;
      RadioButton radio4Rb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_questions);
        handleInitViews();
        Intent intent = getIntent();
        String question = intent.getStringExtra("Question1");
        String option1 = intent.getStringExtra("option1");
        String option2 = intent.getStringExtra("option2");
        String option3 = intent.getStringExtra("option3");
        String option4 = intent.getStringExtra("option4");
        ques1Txt.setText(question);
        radio1Rb.setText(option1);
        radio2Rb.setText(option2);
        radio3Rb.setText(option3);
        radio4Rb.setText(option4);

    }

    private void handleInitViews() {
        ques1Txt = findViewById(R.id.ques1_txt);
        radio1Rb = findViewById(R.id.radio1_rb);
        radio2Rb = findViewById(R.id.radio2_rb);
        radio3Rb = findViewById(R.id.radio3_btn);
        radio4Rb = findViewById(R.id.radio4_btn);
    }
}