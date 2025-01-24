package com.example.articleapp;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class detailPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_page);

        String title = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");
        int imageResource = getIntent().getIntExtra("image", 0);
        String date = getIntent().getStringExtra("date");

        TextView titleTextView = findViewById(R.id.titleTextView);
        TextView descriptionTextView = findViewById(R.id.descriptionTextView);
        TextView dateTextView = findViewById(R.id.dateTextView);
        ImageView imageView = findViewById(R.id.imageView);

        titleTextView.setText(title);
        descriptionTextView.setText(description);
        dateTextView.setText(date);
        imageView.setImageResource(imageResource);
    }
    public void arrowBack(View view) {
        Intent intent = new Intent(this, homePage.class);
        startActivity(intent);
    }
}