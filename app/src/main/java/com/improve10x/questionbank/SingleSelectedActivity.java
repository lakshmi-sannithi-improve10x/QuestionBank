package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class SingleSelectedActivity extends AppCompatActivity implements IQuestionActivity {
      TextView questionTxt;
      RadioButton option1Rb;
      RadioButton option2Rb;
      RadioButton option3Rb;
      RadioButton option4Rb;
      RadioGroup optionsRg;
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
        setContentView(R.layout.activity_questions);
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
        if (answer.equals(selectedAnswer)){
            Toast.makeText(this, "Correct Answer", Toast.LENGTH_SHORT).show();
        }else {
            Toast.makeText(this, "Wrong Answer", Toast.LENGTH_SHORT).show();
        }

    }

   @Override
   public String getSelectedOption(){
        int selectedOption = optionsRg.getCheckedRadioButtonId();
        String result = "";
        if(selectedOption == R.id.optiona_rb){
            result ="a";
        }else if(selectedOption == R.id.optionb_rb){
            result ="b";
        } else if (selectedOption == R.id.optionc_rb) {
            result = "c";
        } else if (selectedOption == R.id.optiond_rb) {
            result = "d";
        }
        return result;
    }

    private void initViews() {
        questionTxt = findViewById(R.id.question_txt);
        option1Rb = findViewById(R.id.optiona_rb);
        option2Rb = findViewById(R.id.optionb_rb);
        option3Rb = findViewById(R.id.optionc_rb);
        option4Rb = findViewById(R.id.optiond_rb);
        optionsRg = findViewById(R.id.options_rg);
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

   @Override
   public void  displayData(){
        questionTxt.setText(question);
        option1Rb.setText(option1);
        option2Rb.setText(option2);
        option3Rb.setText(option3);
        option4Rb.setText(option4);
    }
}