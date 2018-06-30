package com.example.android.quizapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    int score = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkAnswer(android.view.View view){

         android.widget.EditText theTextField = (android.widget.EditText) findViewById(R.id.username);
        String theName = theTextField.getText().toString();

      android.widget.RadioButton  ans1, ans2, ans3, ans4, ans5;
        ans1 = (android.widget.RadioButton) findViewById(R.id.q1_op4);
        if(ans1.isChecked()){
           score++;
        }

        ans2 = (android.widget.RadioButton) findViewById(R.id.q2_op3);
        if(ans2.isChecked()){
           score++;
        }

        ans3 = (android.widget.RadioButton) findViewById(R.id.q3_op1);
        if(ans3.isChecked()){
           score++;
        }

         ans4 = (android.widget.RadioButton) findViewById(R.id.q4_op3);
        if(ans4.isChecked()){
           score++;
        }

        ans5 = (android.widget.RadioButton) findViewById(R.id.q5_op3);
        if(ans5.isChecked()){
           score++;
        }
        android.widget.Toast.makeText(this, theName +", your score is " + score + " out of 5", android.widget.Toast.LENGTH_SHORT).show();
        score = 0;
    }

}
