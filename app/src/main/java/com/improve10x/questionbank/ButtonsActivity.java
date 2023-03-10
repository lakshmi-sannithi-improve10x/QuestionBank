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
    Button textQ1Btn;
    Button textQ2Btn;
    Button textQ3Btn;
    Button spinnerQ1Btn;
    Button spinnerQ2Btn;
    Button spinnerQ3Btn;


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
        handleTextQ1Btn();
        handleTextQ2Btn();
        handleTextQ3Btn();
        handleSpinnerQ1Btn();
        handleSpinnerQ2Btn();
        handleSpinnerQ3Btn();
    }

    private void handleSpinnerQ3Btn() {
        spinnerQ3Btn.setOnClickListener(view -> {
            String question = " Find the value of A[1] after execution of the following program.\n" +
                    "\n" +
                    "int[] A = {0,2,4,1,3};\n" +
                    "for(int i = 0; i < a.length; i++){\n" +
                    "    a[i] = a[(a[i] + 3) % a.length];\n" +
                    "}";
            String[] options = {"0","1","2","3"};
            String answer = "1";
            navigateToSpinnerQuestionsActivity(question,options,answer);
        });
    }

    private void handleSpinnerQ2Btn() {
        spinnerQ2Btn.setOnClickListener(view -> {
            String question = " public class Solution{\n" +
                    "       public static void main(String[] args){\n" +
                    "                     byte x = 127;\n" +
                    "                     x++;\n" +
                    "                     x++;\n" +
                    "                     System.out.print(x);\n" +
                    "       }\n" +
                    "}";
            String[] options ={"-127","127","129","2"};
            String answer = "-127";
            navigateToSpinnerQuestionsActivity(question,options,answer);
        });

    }

    private void handleSpinnerQ1Btn() {
        spinnerQ1Btn.setOnClickListener(view -> {
            String question = " Number of primitive data types in Java are?";
            String[] options = {"6","7","8","9"};
            String answer = "8";
            navigateToSpinnerQuestionsActivity(question,options,answer);
        });
    }

    private void handleTextQ3Btn() {
        textQ3Btn.setOnClickListener(view -> {
            String question =" _____________ component is used to suppoer vertical Scrolling";
            String answer = "Scrollview";
            String trimTxt = answer.trim();
            navigateToTextQuestionActivity(question,trimTxt);
        });

    }

    private void handleTextQ2Btn() {
        textQ2Btn.setOnClickListener(view -> {
            String question ="Android is an ________ ";
            String answer = "Operating System  ";
            String trimTxt = answer.trim();
            navigateToTextQuestionActivity(question,trimTxt);
        });
    }

    private void handleTextQ1Btn() {
        textQ1Btn.setOnClickListener(view -> {
            String question =" Java ______ can contain variables and methods";
            String answer = "Class";
            String trimTxt = answer.trim();
            navigateToTextQuestionActivity(question,trimTxt);
        });
    }

    private void handleNumberQuestion3Btn() {
        numberQuestion3Btn.setOnClickListener(view -> {
            String question ="What is the size of double data type in bytes ?";
            String answer = "8";
            navigateToTextQuestionActivity(question,answer);
        });
    }

    private void handleNumberQuestion2Btn() {
        numberQuestion2Btn.setOnClickListener(view -> {
            String question ="What is the size of long data type in bytes ?";
            String answer = "8";
            navigateToTextQuestionActivity(question,answer);
        });
    }

    private void handleNumberQuestion1Btn() {
        numberQuestion1Btn.setOnClickListener(view -> {
          String question ="What is the size of  int  data type in bytes ?";
          String answer = "4";
          navigateToTextQuestionActivity(question,answer);
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
            String question = " Select activity lifecycle methods in Android ?";
            String optionA = "OnCreate";
            String optionB = "OnStop";
            String optionC = "OnPause";
            String optionD = "OnResume";
            String answer = "abcd";
            navigateToCheckboxActivity(question, optionA, optionB, optionC, optionD, answer);
        });
    }

    private void handleCheckQ2Btn() {
        checkQ2Btn.setOnClickListener(view -> {
            String question = "Select all the parts of a computer ?";
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
            String question = "Which of the following are planets ?";
            String optionA = "Mercury";
            String optionB = "Sun";
            String optionC = "Jupiter";
            String optionD = "Saturn";
            String answer = "acd";
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
        textQ1Btn = findViewById(R.id.textq1_btn);
        textQ2Btn = findViewById(R.id.textq2_btn);
        textQ3Btn = findViewById(R.id.textq3_btn);
        spinnerQ1Btn = findViewById(R.id.spinnerq1_btn);
        spinnerQ2Btn = findViewById(R.id.spinnerq2_btn);
        spinnerQ3Btn = findViewById(R.id.spinnerq3_btn);
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

    public void  navigateToTextQuestionActivity(String question,String answer){
        Intent textQuestionIntent = new Intent(this, TextQuestionActivity.class);
        textQuestionIntent.putExtra("Question", question);
        textQuestionIntent.putExtra("answer", answer);
        startActivity(textQuestionIntent);
    }

    public void navigateToSpinnerQuestionsActivity(String question,String[] options,String answer){
        Intent spinnerQuestionsIntent = new Intent(this, SpinnerQuestionsActivity.class);
        spinnerQuestionsIntent.putExtra("Question", question);
        spinnerQuestionsIntent.putExtra("options",options);
        spinnerQuestionsIntent.putExtra("answer",answer);
        startActivity(spinnerQuestionsIntent);
    }
}
















