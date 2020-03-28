package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
         View root = findViewById(R.id.main);
         TextView text = findViewById(R.id.text);
        switch (item.getItemId()) {
            case R.id.red:
                root.setBackgroundColor(Color.parseColor("#FF0000"));
                text.setText("Red");
                Log.i("color", "red");
                return true;

            case R.id.yellow:
                root.setBackgroundColor(Color.parseColor("#FFFF00"));
                text.setText("Yellow");
                Log.i("color", "yellow");
                return true;

            case R.id.green:
                root.setBackgroundColor(Color.parseColor("#008000"));
                text.setText("Green");
                Log.i("color", "red");
                return true;

            default:
                return super.onOptionsItemSelected(item);
        }
    }
}
