package com.example.matcheloacademy;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class listdata extends AppCompatActivity {
    TextView name;
    ImageView image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.algebra);
        name = findViewById(R.id.listdata);
        image = findViewById(R.id.imageView);

        Intent intent = getIntent();

        String receivedName =  intent.getStringExtra("name");
        int receivedImage = intent.getIntExtra("image",0);
    }
}