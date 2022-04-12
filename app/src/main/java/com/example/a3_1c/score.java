package com.example.a3_1c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class score extends AppCompatActivity {

    String name;
    Integer score;
    TextView nameDisp;
    TextView scoreDisp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_score);
        Intent scoreIntent = getIntent();
        name= scoreIntent.getStringExtra("name");
        score= scoreIntent.getIntExtra("score", 0);
        nameDisp = findViewById(R.id.nameDisp);
        scoreDisp = findViewById(R.id.scoreDisp);
        nameDisp.setText("Congratulations " + name);
        scoreDisp.setText(score + "/5");
    }
    public void restart(View view) {
        setContentView(R.layout.activity_question1);
    }
    public void returnhome(View view) {
        setContentView(R.layout.activity_main);
    }
}