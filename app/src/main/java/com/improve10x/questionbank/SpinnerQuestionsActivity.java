package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class SpinnerQuestionsActivity extends AppCompatActivity implements IQuestionActivity {
    TextView questionTxt;
    Spinner optionsSp;
    Button verifyBtn;


    ArrayAdapter optionAdapter;

    String question;
    String[] options = {};
    String answer;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner_questions);
        initViews();
        getQuestionsData();
        displayData();
        setupAdapter();
        connectAdapter();
        handleVerifyBtn();
    }

    private void initViews() {
        questionTxt = findViewById(R.id.question_txt);
        optionsSp = findViewById(R.id.options_sp);
        verifyBtn = findViewById(R.id.verify_btn);
    }

    public void setupAdapter() {
        optionAdapter = new ArrayAdapter(this, android.R.layout.simple_spinner_dropdown_item, options);
    }

    public void connectAdapter() {
        optionsSp.setAdapter(optionAdapter);
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
        String selectedId = (String) optionsSp.getSelectedItem();
        return selectedId;
    }

    @Override
    public void getQuestionsData() {
        Intent intent = getIntent();
        question = intent.getStringExtra("Question");
        options = intent.getStringArrayExtra("options");
        answer = intent.getStringExtra("answer");
    }

    @Override
    public void displayData() {
        questionTxt.setText(question);
    }
}