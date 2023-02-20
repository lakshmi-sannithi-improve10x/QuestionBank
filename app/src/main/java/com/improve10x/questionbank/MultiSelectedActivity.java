package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;
import android.widget.Toast;

public class MultiSelectedActivity extends AppCompatActivity implements IQuestionActivity {
    TextView questionTxt;
    CheckBox optionACb;
    CheckBox optionBCb;
    CheckBox optionCCb;
    CheckBox optionDCb;
    Button verifyBtn;
    String question;
    String option1;
    String option2;
    String option3;
    String option4;
    String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_checkbox);
        inItViews();
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
   public void verifyAnswer(){
        String selectedAnswer = getSelectedOption();
        if (answer.equals(selectedAnswer)){
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
        }


    }

   @Override
   public String getSelectedOption(){
        String result = "";
        if (optionACb.isChecked()){
            result = result +"a";

        }
        if (optionBCb.isChecked()) {
            result = result + "b";

        }
        if (optionCCb.isChecked()) {
            result = result + "c";

        }
        if (optionDCb.isChecked()) {
            result = result + "d";

        }
        return result;
   }

    public void inItViews(){
        questionTxt = findViewById(R.id.question_txt);
        optionACb = findViewById(R.id.optiona_cb);
        optionBCb = findViewById(R.id.optionb_cb);
        optionCCb = findViewById(R.id.optionc_cb);
        optionDCb = findViewById(R.id.optiond_cb);
        verifyBtn = findViewById(R.id.verify_btn);
    }

   @Override
   public void  getQuestionsData(){
        Intent intent = getIntent();
        question = intent.getStringExtra("Question");
        option1 = intent.getStringExtra("option1");
        option2 = intent.getStringExtra("option2");
        option3 = intent.getStringExtra("option3");
        option4 = intent.getStringExtra("option4");
        answer = intent.getStringExtra("answer");
    }

    public void  displayData(){
      questionTxt.setText(question);
      optionACb.setText(option1);
      optionBCb.setText(option2);
      optionCCb.setText(option3);
      optionDCb.setText(option4);
    }
}