package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.widget.TextView;

public class TimerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_timer);
        Intent intent = getIntent();
        String message = intent.getStringExtra(Task4.EXTRA_MESSAGE);
//        Log.i("text", message);
        // Capture the layout's TextView and set the string as its text
        final TextView textView = findViewById(R.id.seconds);
        textView.setText(message);
        new CountDownTimer(Integer.parseInt(message) * 1000, 1000) {

            public void onTick(long millisUntilFinished) {
                textView.setText("" + millisUntilFinished / 1000);
            }

            public void onFinish() {
                textView.setText("done!");
                playAlarm();
            }
        }.start();
    }

    private void playAlarm() {
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, R.raw.bear);
        mediaPlayer.start();
    }
}
