package com.example.sensistan;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        Button aibtn, qrscanbtn, storymodebtn;
        aibtn = findViewById(R.id.aibtn);
        qrscanbtn = findViewById(R.id.qrscanbtn);
        storymodebtn = findViewById(R.id.storymodebtn);

        final Intent aiintent, storyintent, qrintent;
        aiintent = new Intent(this, aiMode.class);
        storyintent = new Intent(this, StoryMode.class);
        qrintent = new Intent(this, QRMode.class);

        aibtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(aiintent);
            }
        });
        qrscanbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(qrintent);

            }
        });

        storymodebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(storyintent);
            }
        });



    }
}
