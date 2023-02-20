package com.improve10x.questionbank;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

public class TeacherStudentActivity extends AppCompatActivity {
     TextView questionBankTxt;
     Button teacherBtn;
     Button studentBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_teacher_student);
        initViews();
        handleStudentBtn();
    }

    public void  initViews(){
        questionBankTxt = findViewById(R.id.questionbank_txt);
        teacherBtn = findViewById(R.id.teacher_btn);
        studentBtn = findViewById(R.id.student_btn);
    }
    public void  handleStudentBtn(){
        studentBtn.setOnClickListener(view -> {
            Intent intent = new Intent(this,ButtonsActivity.class);
            startActivity(intent);
        });
    }
}