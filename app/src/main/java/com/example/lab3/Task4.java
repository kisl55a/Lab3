package com.example.lab3;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

import com.example.lab3.R;
import com.example.lab3.TimerActivity;

public class Task4 extends AppCompatActivity {
    public static final String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task4);
    }

    /** Called when the user taps the Send button */
    public void startTimer(View view) {
        Intent intent = new Intent(this, TimerActivity.class);
        EditText editText = (EditText) findViewById(R.id.time);
        String message = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}