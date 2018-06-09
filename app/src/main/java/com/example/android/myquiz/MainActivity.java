package com.example.android.myquiz;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.Toast;

//public class MainActivity extends AppCompatActivity {

  //  @Override
  //  protected void onCreate(Bundle savedInstanceState) {
  //      super.onCreate(savedInstanceState);
  //      setContentView(R.layout.activity_main);
  //  }

//}


public class MainActivity extends AppCompatActivity {
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    // 1st Question

    RadioButton choice4_question1;

    // 2nd Question

    RadioButton choice2_question2;

    // 3rd Question

    CheckBox choice1_question3;
    CheckBox choice2_question3;
    CheckBox choice3_question3;
    CheckBox choice4_question3;

    // 4th Question

    RadioButton choice1_question4;

    // 5th Question

    RadioButton choice1_question5;

    // 6th Question

    EditText answer_to_question6;

    @Override
     protected void onCreate(Bundle savedInstanceState) {
       super.onCreate(savedInstanceState);
    // Hide the keyboard
     this.getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_STATE_ALWAYS_HIDDEN);
    setContentView(R.layout.activity_main);
    }

    public void Done(View view) {
        CharSequence resultsDisplay;
        // Log.e(LOG_TAG, " " + this.findViewById(R.id.choice4_question1));
        int score_answer1;
        int score_answer2;
        int score_answer3;
        int score_answer4;
        int score_answer5;
        int score_answer6;
        int final_score;

        //=================================================
        // 1st Question - Answer = 4 South Korea
        //=================================================
        Boolean answer1;

        choice4_question1 = (RadioButton) this.findViewById(R.id.choice4_question1);
        answer1 = choice4_question1.isChecked();
        if (answer1) {
            score_answer1 = 1;
        } else {
            score_answer1 = 0;
        }
        //=================================================
        // 2nd Question - Answer = 2 Heaven
        //=================================================
        Boolean answer2;

        choice2_question2 = (RadioButton) this.findViewById(R.id.choice2_question2);
        answer2 = choice2_question2.isChecked();
        if (answer2) {
            score_answer2 = 1;
        } else {
            score_answer2 = 0;
        }
        //==================================================
        // 3rd Question  - Answers = 3 Autumn
        //==================================================
        Boolean choice1_answer3;
        Boolean choice2_answer3;
        Boolean choice3_answer3;
        Boolean choice4_answer3;
        choice1_question3 = (CheckBox) this.findViewById(R.id.choice1_question3);
        choice2_question3 = (CheckBox) this.findViewById(R.id.choice2_question3);
        choice3_question3 = (CheckBox) this.findViewById(R.id.choice3_question3);
        choice4_question3 = (CheckBox) this.findViewById(R.id.choice4_question3);
        choice1_answer3 = choice1_question3.isChecked();
        choice2_answer3 = choice2_question3.isChecked();
        choice3_answer3 = choice3_question3.isChecked();
        choice4_answer3 = choice4_question3.isChecked();
        if (!choice1_answer3 && !choice2_answer3 && choice3_answer3 && !choice4_answer3) {
            score_answer3 = 1;
        } else {
            score_answer3 = 0;
        }

        //=================================================
        // 4th Question - Answer = 1 Positive Cosmic Forces
        //=================================================
        Boolean answer4;

        choice1_question4 = (RadioButton) this.findViewById(R.id.choice1_question4);
        answer4 = choice1_question4.isChecked();
        if (answer4) {
            score_answer4 = 1;
        } else {
            score_answer4 = 0;
        }

        //=================================================
        // 5th Question - Answer = 1 YES
        //=================================================
        Boolean answer5;

        choice1_question5 = (RadioButton) this.findViewById(R.id.choice1_question5);
        answer5 = choice1_question5.isChecked();
        if (answer5) {
            score_answer5 = 1;
        } else {
            score_answer5 = 0;
        }


        //=====================================================
        // Question 6 - Correct Answer is "Negative Cosmic Forces"
        //======================================================
        String answer6;
        answer_to_question6 = (EditText) this.findViewById(R.id.answer_to_question6);
        answer6 = answer_to_question6.getText().toString().toLowerCase();
        if (answer6.equals("negative cosmic forces")) {
            score_answer6 = 1;
        } else {
            score_answer6 = 0;
        }
        //===============================
        // End Score
        //===============================
        final_score = score_answer1 + score_answer2 + score_answer3 + score_answer4 + score_answer5 +
                score_answer6;

        if (final_score == 6) {
            resultsDisplay = "WooHoo! You Smart AF! You scored 6 out of 6";
        } else {
            resultsDisplay = "Did you even bother reading? You need to study more. You scored " + final_score + " out of 6";
        }

        Context context = getApplicationContext();
        int duration = Toast.LENGTH_LONG;
        Toast toast = Toast.makeText(context, resultsDisplay, duration);
        toast.setGravity(Gravity.CENTER, 0, 0);
        toast.show();
    }
}