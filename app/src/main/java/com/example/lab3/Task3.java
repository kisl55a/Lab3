package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

public class Task3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mammals);
    }
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_animals, menu);
        return true;
    }
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mammals:
                setContentView(R.layout.mammals);
                return true;
            case R.id.birds:
                setContentView(R.layout.birds);
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    public void huuhkajaSound(View view) {
        Log.i("sound","Owl");
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, R.raw.huuhkaja_norther_eagle_owl);
        mediaPlayer.start();
    }

    public void peippoSound(View view) {
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, R.raw.peippo_chaffinch);
        mediaPlayer.start();
    }

    public void peukaloinenSound(View view) {
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, R.raw.peukaloinen_wren);
        mediaPlayer.start();
    }

    public void punatulkkuSound(View view) {
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, R.raw.punatulkku_northern_bullfinch);
        mediaPlayer.start();
    }

    public void bearSound(View view) {
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, R.raw.bear);
        mediaPlayer.start();
    }
    public void wolfSound(View view) {
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, R.raw.wolf);
        mediaPlayer.start();
    }
    public void elephantSound(View view) {
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, R.raw.elephant);
        mediaPlayer.start();
    }
    public void lambSound(View view) {
        MediaPlayer mediaPlayer;
        mediaPlayer = MediaPlayer.create(this, R.raw.lamb);
        mediaPlayer.start();
    }
}
