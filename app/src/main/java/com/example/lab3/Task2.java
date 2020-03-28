package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class Task2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_task2);
    }

    public void map(View view) {
// Or map point based on latitude/longitude
        Uri location = Uri.parse("geo:0,0?q=Kotkantie 1, 90250 Oulu, Finland"); // z param is zoom level
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);
    }

    public void call(View view) {
        Uri number = Uri.parse("tel:+79226313400");
        Intent callIntent = new Intent(Intent.ACTION_DIAL, number);
        startActivity(callIntent);
    }

    public void site(View view) {
        EditText editText = findViewById(R.id.site);
        String site = editText.getText().toString();
        Uri webpage = Uri.parse(site);
        Intent webIntent = new Intent(Intent.ACTION_VIEW, webpage);

        startActivity(webIntent);
    }
}
