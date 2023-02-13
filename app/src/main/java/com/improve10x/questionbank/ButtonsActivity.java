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

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buttons);
        handleInitViews();
        handleQuestion1Btn();
        handleQuestion2Btn();
        handleQuestion3Btn();
    }

    private void handleQuestion3Btn() {
        question3Btn.setOnClickListener(view -> {
            Toast.makeText(this, "Q3 Click", Toast.LENGTH_SHORT).show();
            String question = "What will be the output when input is 6. It must return Fizz if the number is divisible by 3.\n" +
                                        " It must return Buzz if the number is divisible by 5.  It must return FizzBuzz if the number is divisible by  both 3 and 5. It must return a number if none of the above conditions are true.";
            String optionA = "Fizz";
            String optionB = "Buzz";
            String optionC = "FizzBuzz";
            String optionD = "6";
            navigateToQuestionsActivityScreen(question,optionA,optionB,optionC,optionD);
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
            navigateToQuestionsActivityScreen(question,optionA,optionB,optionC,optionD);
        });
    }

    private void handleQuestion1Btn() {
        question1Btn.setOnClickListener(view -> {
            Toast.makeText(this, "Q1 Click", Toast.LENGTH_SHORT).show();
            String question = "How many planets are there in solar system";
             String optionA = "10";
             String optionB = "12";
             String optionC = "8";
             String optionD = "9";
            navigateToQuestionsActivityScreen(question,optionA,optionB,optionC,optionD);
        });
    }

    private void handleInitViews() {
        question1Btn = findViewById(R.id.question1_btn);
        question2Btn = findViewById(R.id.question2_btn);
        question3Btn = findViewById(R.id.question3_btn);
    }

    public void navigateToQuestionsActivityScreen(String question,String optionA,String optionB,String optionC,String optionD){
        Intent intent = new Intent(this,QuestionsActivity.class);
            intent.putExtra("Question",question);
            intent.putExtra("option1",optionA);
            intent.putExtra("option2",optionB);
            intent.putExtra("option3",optionC);
            intent.putExtra("option4",optionD);
            startActivity(intent);
    }
}
















