package com.example.a3_1c;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    EditText editName;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editName = findViewById(R.id.editName);
    }
    public void StartButt(View view)
    {
        String name = editName.getText().toString();
        Intent anIntent = new Intent(MainActivity.this, question1.class);
        anIntent.putExtra("name", name);
        startActivity(anIntent);
        setContentView(R.layout.activity_question1);
    }
}