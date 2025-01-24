package com.example.articleapp;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
public class detailPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail_page);

        // Menangkap data dari Intent
        String title = getIntent().getStringExtra("title");
        String description = getIntent().getStringExtra("description");
        int imageResource = getIntent().getIntExtra("image", 0);
        String date = getIntent().getStringExtra("date");

        // Menghubungkan ke layout
        TextView titleTextView = findViewById(R.id.titleTextView);
        TextView descriptionTextView = findViewById(R.id.descriptionTextView);
        TextView dateTextView = findViewById(R.id.dateTextView);
        ImageView imageView = findViewById(R.id.imageView);

        // Menampilkan data
        titleTextView.setText(title);
        descriptionTextView.setText(description);
        dateTextView.setText(date);
        imageView.setImageResource(imageResource);
    }
}