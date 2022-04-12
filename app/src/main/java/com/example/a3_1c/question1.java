package com.example.a3_1c;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;

public class question1 extends AppCompatActivity {
    TextView topName;
    String name;
    TextView title;
    TextView questionText;
    Integer question = 1;
    Integer selected = 0;
    Button answer1;
    Button answer2;
    Button answer3;
    Button submitbut;
    Integer score = 0;
    Boolean completed = false;
    ProgressBar progressBar;
    TextView questionCount;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_question1);
        Intent anIntent = getIntent();
        name= anIntent.getStringExtra("name");
        topName = findViewById(R.id.topName);
        topName.setText("Welcome " + name + "!");

        answer1 = findViewById(R.id.ans1butt);
        answer2 = findViewById(R.id.ans2butt);
        answer3 = findViewById(R.id.ans3butt);
        submitbut = findViewById(R.id.submitButton);

        title = findViewById(R.id.qtitle);
        questionText = findViewById(R.id.qtext);

        progressBar = findViewById(R.id.progressBar);
        progressBar.setProgress(question);
        questionCount = findViewById(R.id.questNum);
        submitbut.setOnClickListener(new submitClickListener());


    }
    public void chooseAnswer1(View view) {
        answer1.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.blue));
        answer2.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.grey));
        answer3.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.grey));
        selected = 1;
    }
    public void chooseAnswer2(View view) {
        answer1.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.grey));
        answer2.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.blue));
        answer3.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.grey));
        selected = 2;
    }
    public void chooseAnswer3(View view) {
        answer1.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.grey));
        answer2.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.grey));
        answer3.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.blue));
        selected = 3;
    }

    private class submitClickListener implements View.OnClickListener {
        @Override
        public void onClick(View view) {
            if (completed == false & selected != 0) {
                if (question == 1) {
                    //answer 1 is correct
                    if (selected == 1) {
                        score++;
                    }
                    answer1.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.green));
                    if (selected == 2)
                        answer2.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.red));
                    if (selected == 3)
                        answer3.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.red));
                }
                if (question == 2) {
                    //answer 3 is correct
                    if (selected == 1)
                        answer1.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.red));
                    if (selected == 2)
                        answer2.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.red));
                    if (selected == 3)
                        score++;
                    answer3.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.green));
                }
                if (question == 3) {
                    //answer 2 is correct
                    if (selected == 1)
                        answer1.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.red));
                    if (selected == 2)
                        score++;
                    if (selected == 3)
                        answer3.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.red));
                    answer2.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.green));
                }
                if (question == 4) {
                    //answer 3 is correct
                    if (selected == 1)
                        answer1.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.red));
                    if (selected == 2)
                        answer2.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.red));
                    if (selected == 3)
                        score++;
                    answer3.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.green));
                }
                if (question == 5) {
                    //answer 1 is correct
                    if (selected == 1) {
                        score++;
                    }
                    answer1.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.green));
                    if (selected == 2)
                        answer2.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.red));
                    if (selected == 3)
                        answer3.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.red));
                }
                completed = true;
                selected = 0;
                submitbut.setText("Next");
            } else if (completed == true)
            {
                question++;
                progressBar.setProgress(question);
                questionCount.setText(question + "/5");
                completed = false;
                submitbut.setText("Submit");
                answer1.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.grey));
                answer2.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.grey));
                answer3.setBackgroundTintList(ContextCompat.getColorStateList(getApplicationContext(), R.color.grey));
                if (question == 2)
                {
                    title.setText("Question 2");
                    questionText.setText("What is the method used on the first creation of an activity?");
                    answer1.setText("onCreation");
                    answer2.setText("onLaunch");
                    answer3.setText("onCreate");
                }
                if (question == 3)
                {
                    title.setText("Question 3");
                    questionText.setText("Which of the following languages can be used in Android Studio (pick 1)?");
                    answer1.setText("Python");
                    answer2.setText("Java");
                    answer3.setText("AppleScript");
                }
                if (question == 4)
                {
                    title.setText("Question 4");
                    questionText.setText("Which of the following is not a lifestyle state for an activity?");
                    answer1.setText("Foreground");
                    answer2.setText("Partially Hidden");
                    answer3.setText("Dead");
                }
                if (question == 5)
                {
                    title.setText("Question 5");
                    questionText.setText("True or False: All elements within a layout are built using a hierarchy of View and ViewGroup objects?");
                    answer1.setText("True");
                    answer2.setText("False");
                    answer3.setText("Neither");
                }
                if (question == 6)
                {
                    Intent scoreIntent = new Intent(question1.this, score.class);
                    scoreIntent.putExtra("name", name);
                    scoreIntent.putExtra("score", score);
                    startActivity(scoreIntent);
                    setContentView(R.layout.activity_score);
                }
            }
        }
    }
}