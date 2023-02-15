package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;

public class ButtonsActivity extends AppCompatActivity {
    Button question1Btn;
    Button question2Btn;
    Button question3Btn;
    Button checkQ1Btn;
    Button checkQ2Btn;
    Button checkQ3Btn;
    Button trueOrFalseQ1Btn;
    Button trueOrFalseQ2Btn;
    Button trueOrFalseQ3Btn;
    Button numberQuestion1Btn;
    Button numberQuestion2Btn;
    Button numberQuestion3Btn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
        initViews();
        handleQuestion1Btn();
        handleQuestion2Btn();
        handleQuestion3Btn();
        handleCheckQ1Btn();
        handleCheckQ2Btn();
        handleCheckQ3Btn();
        handleTrueOrFalseQ1Btn();
        handleTrueOrFalseQ2Btn();
        handleTrueOrFalseQ3Btn();
        handleNumberQuestion1Btn();
        handleNumberQuestion2Btn();
        handleNumberQuestion3Btn();
    }

    private void handleNumberQuestion3Btn() {
    }

    private void handleNumberQuestion2Btn() {
    }

    private void handleNumberQuestion1Btn() {
        numberQuestion1Btn.setOnClickListener(view -> {
          String question ="What is the size of  int  data type in bytes ?";
          String answer = "4";
          navigateToNumberSelectQuestionActivity(question,answer);
        });
    }

    private void handleTrueOrFalseQ3Btn() {
        trueOrFalseQ3Btn.setOnClickListener(view -> {
            String question = "Android emulator takes very less space?";
            String answer = "False";
            navigateToTrueOrFalseQuestionActivity(question, answer);
        });
    }

    private void handleTrueOrFalseQ2Btn() {
        trueOrFalseQ2Btn.setOnClickListener(view -> {
            String question = "Android Studio supports Java programming language ?";
            String answer = "True";
            navigateToTrueOrFalseQuestionActivity(question, answer);
        });
    }

    private void handleTrueOrFalseQ1Btn() {
        trueOrFalseQ1Btn.setOnClickListener(view -> {
            String question = "Java is a programming language?";
            String answer = "True";
            navigateToTrueOrFalseQuestionActivity(question, answer);
        });
    }

    private void handleCheckQ3Btn() {
        checkQ3Btn.setOnClickListener(view -> {
            String question = " Select activity lifecycle methods in Android";
            String optionA = "OnCreate";
            String optionB = "OnStop";
            String optionC = "OnPause";
            String optionD = "OnResume";
            String answer = "bcd";
            navigateToCheckboxActivity(question, optionA, optionB, optionC, optionD, answer);
        });
    }

    private void handleCheckQ2Btn() {
        checkQ2Btn.setOnClickListener(view -> {
            String question = "Select all the parts of a computer";
            String optionA = "Cat";
            String optionB = "Mouse";
            String optionC = "Monitor";
            String optionD = "Keyboard";
            String answer = "bcd";
            navigateToCheckboxActivity(question, optionA, optionB, optionC, optionD, answer);
        });
    }

    private void handleCheckQ1Btn() {
        checkQ1Btn.setOnClickListener(view -> {
            String question = "Which of the following are planets";
            String optionA = "Mercury";
            String optionB = "Sun";
            String optionC = "Jupiter";
            String optionD = "Saturn";
            String answer = "abc";
            navigateToCheckboxActivity(question, optionA, optionB, optionC, optionD, answer);
        });
    }

    private void handleQuestion3Btn() {
        question3Btn.setOnClickListener(view -> {
            String question = "What will be the output when input is 6. It must return Fizz if the number is divisible by 3.\n" +
                    " It must return Buzz if the number is divisible by 5.  It must return FizzBuzz if the number is divisible by  both 3 and 5. It must return a number if none of the above conditions are true.";
            String optionA = "Fizz";
            String optionB = "Buzz";
            String optionC = "FizzBuzz";
            String optionD = "6";
            String answer = "a";
            navigateToQuestionsActivityScreen(question, optionA, optionB, optionC, optionD, answer);
        });
    }

    private void handleQuestion2Btn() {
        question2Btn.setOnClickListener(view -> {
            Toast.makeText(this, "Q2 Click", Toast.LENGTH_SHORT).show();
            String question = "Given a =10,b=20,return true if sum of the both numbers is less than 100.otherwise false";
            String optionA = "True";
            String optionB = "False";
            String optionC = "All of the above";
            String optionD = "None of the above";
            String answer = "a";
            navigateToQuestionsActivityScreen(question, optionA, optionB, optionC, optionD, answer);
        });
    }

    private void handleQuestion1Btn() {
        question1Btn.setOnClickListener(view -> {
            String question = "How many planets are there in solar system";
            String optionA = "10";
            String optionB = "12";
            String optionC = "8";
            String optionD = "9";
            String answer = "c";
            navigateToQuestionsActivityScreen(question, optionA, optionB, optionC, optionD, answer);
        });
    }

    private void initViews() {
        question1Btn = findViewById(R.id.question1_btn);
        question2Btn = findViewById(R.id.question2_btn);
        question3Btn = findViewById(R.id.question3_btn);
        checkQ1Btn = findViewById(R.id.checkq1_btn);
        checkQ2Btn = findViewById(R.id.checkq2_btn);
        checkQ3Btn = findViewById(R.id.checkq3_btn);
        trueOrFalseQ1Btn = findViewById(R.id.trueorfalseq1_btn);
        trueOrFalseQ2Btn = findViewById(R.id.trueorfalseq2_btn);
        trueOrFalseQ3Btn = findViewById(R.id.trueorfalseq3_btn);
        numberQuestion1Btn = findViewById(R.id.numberquestion1_btn);
        numberQuestion2Btn = findViewById(R.id.numberquestion2_btn);
        numberQuestion3Btn = findViewById(R.id.numberquestion3_btn);
    }

    public void navigateToQuestionsActivityScreen(String question, String optionA, String optionB, String optionC, String optionD, String answer) {
        Intent intent = new Intent(this, SingleSelectedActivity.class);
        intent.putExtra("Question", question);
        intent.putExtra("option1", optionA);
        intent.putExtra("option2", optionB);
        intent.putExtra("option3", optionC);
        intent.putExtra("option4", optionD);
        intent.putExtra("answer", answer);
        startActivity(intent);
    }

    public void navigateToCheckboxActivity(String question, String optionA, String optionB, String optionC, String optionD, String answer) {
        Intent checkboxIntent = new Intent(this, MultiSelectedActivity.class);
        checkboxIntent.putExtra("Question", question);
        checkboxIntent.putExtra("option1", optionA);
        checkboxIntent.putExtra("option2", optionB);
        checkboxIntent.putExtra("option3", optionC);
        checkboxIntent.putExtra("option4", optionD);
        checkboxIntent.putExtra("answer", answer);
        startActivity(checkboxIntent);
    }

    public void navigateToTrueOrFalseQuestionActivity(String question, String answer) {
        Intent trueOrFalseIntent = new Intent(this, TrueOrFalseQuestionActivity.class);
        trueOrFalseIntent.putExtra("Question", question);
        trueOrFalseIntent.putExtra("answer", answer);
        startActivity(trueOrFalseIntent);
    }

    public  void navigateToNumberSelectQuestionActivity(String question,String answer){
        Intent numberQuestionIntent = new Intent(this, NumberSelectQuestionActivity.class);
        numberQuestionIntent.putExtra("Question", question);
        numberQuestionIntent.putExtra("answer", answer);
        startActivity(numberQuestionIntent);
    }
}
















